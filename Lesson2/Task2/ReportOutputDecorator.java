import java.util.List;

public class ReportOutputDecorator implements ReportHandler {

    private ReportHandler handler;

    public ReportOutputDecorator(ReportHandler handler) {
        this.handler = handler;
    }

    @Override
    public void output(List<ReportItem> reports) {
        handler.output(reports);
    }
}
