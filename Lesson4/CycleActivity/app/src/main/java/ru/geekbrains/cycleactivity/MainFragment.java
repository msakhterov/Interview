package ru.geekbrains.cycleactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainFragment extends Fragment {

    private String TAG = "[CycleFragment]";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        makeMessage("Fragment onAttach()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        makeMessage("Fragment onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        makeMessage("Fragment onCreateView()");
        return inflater.inflate(R.layout.fragment_main, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        makeMessage("Fragment onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        makeMessage("Fragment onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        makeMessage("Fragment onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        makeMessage("Fragment onPause()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        makeMessage("Fragment onSaveInstanceState()");
    }

    @Override
    public void onStop() {
        super.onStop();
        makeMessage("Fragment onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        makeMessage("Fragment onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        makeMessage("Fragment onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        makeMessage("Fragment onDetach()");
    }

    private void makeMessage(String message) {
        Toast toast = Toast.makeText(getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        Log.i(TAG, message);
    }
}
