package com.edu.gof.behavioral.template_method.src;

public class UseTemplatePattern {


    public static void main(String[] args) {


        ReportGeneratorTemplate reportGeneratorTemplate = new ReportGeneratorCsv();

        reportGeneratorTemplate.generateAndSendReport("");
    }
}
