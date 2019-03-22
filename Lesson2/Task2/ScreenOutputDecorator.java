import java.util.List;

public class ScreenOutputDecorator extends ReportOutputDecorator {

    public ScreenOutputDecorator(ReportHandler handler) {
        super(handler);
    }

    @Override
    public void output(List<ReportItem> reports) {
        System.out.println("Output to screen");
        for (ReportItem item : reports) {
            System.out.format("screen %s - %f \n\r", item.getDescription(), item.getAmount());
        }
        super.output(reports);
    }
}
