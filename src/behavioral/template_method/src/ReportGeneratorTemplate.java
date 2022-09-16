package behavioral.template_method.src;

public abstract class ReportGeneratorTemplate {

    /**
     * Template method for all report generator
     */
    public final void generateAndSendReport(String filePath) {

        String rawData = readFile(filePath);
        SalaryReport salaryReport = parseData(rawData);
        String filePathOfReport = generateReport(salaryReport);
        sendReport(filePathOfReport);
    }

    abstract String readFile(String filePath);

    abstract SalaryReport parseData(String rawData);

    public String generateReport(SalaryReport salaryReport) {

        // Generate a pdf report and return temp filePath

        return null;
    }

    public void sendReport(String filePath) {

        // Send the pdf report
    }

}
