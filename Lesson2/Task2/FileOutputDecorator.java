import java.util.List;

public class FileOutputDecorator extends ReportOutputDecorator {

    public FileOutputDecorator(ReportHandler handler) {
        super(handler);
    }

    @Override
    public void output(List<ReportItem> reports) {
        System.out.println("Output to file");
        for (ReportItem item : reports) {
            System.out.format("file %s - %f \n\r", item.getDescription(), item.getAmount());
        }
        super.output(reports);
    }
}
