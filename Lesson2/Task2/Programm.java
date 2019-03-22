class Programm {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.setHandler(new ScreenOutputDecorator(new FileOutputDecorator(new PrintReport())));
        report.output();
    }
}