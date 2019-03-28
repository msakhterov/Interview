package ru.geekbrains.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.Toast;

public class MyWidget extends AppWidgetProvider {

    private final static String ExtraMsg = "msg";
    private final static String ACTION_WIDGET = "action";

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.my_widget);
        // Здесь обновим текст, будем показывать номер виджета
        views.setTextViewText(R.id.appwidget_text, String.format("%s - %d", widgetText, appWidgetId));

        Intent active = new Intent(context, MyWidget.class);
        active.setAction(ACTION_WIDGET);
        active.putExtra(ExtraMsg, "Widget Click");
        PendingIntent actionPendingIntent = PendingIntent.getBroadcast(context, 0, active, 0);
        views.setOnClickPendingIntent(R.id.appwidget_btn, actionPendingIntent);

        appWidgetManager.updateAppWidget(appWidgetId, views);
    }
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        if (action.equals(ACTION_WIDGET)) {
            String msg = "";
            try {
                msg = intent.getStringExtra(ExtraMsg);
            } catch (NullPointerException e) {
                Log.e("Error", "msg = null");
            }
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
        super.onReceive(context, intent);
    }
}

