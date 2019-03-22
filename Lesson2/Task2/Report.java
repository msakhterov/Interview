import java.util.ArrayList;
import java.util.List;

class Report {
    private List<ReportItem> items;    // Отчетные данные
    private ReportHandler handler;

    // расчет отчетных данных
    public void calculate() {
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void setHandler(ReportHandler handler) {
        this.handler = handler;
    }

    public void output() {
        handler.output(items);
    }
}