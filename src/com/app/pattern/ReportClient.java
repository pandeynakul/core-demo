package com.app.pattern;

public class ReportClient {
    public static void main(String[] args) {
        Report build = new Report.ReportBuilder().setAuthor("rahul")
                .setContent("smoker").setTitle("the smoker").build();
        System.out.println(build);
    }

    //Achieve the builder design pattern with other Example

}
