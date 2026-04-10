package com.app.pattern;


import lombok.NonNull;
import lombok.ToString;

@ToString
public class Report {

    //private constructor
    //private constructor with parameter as Builder Object
    private String title;
    private String author;

    private String content;

    private Report(ReportBuilder reportBuilder) {
        this.title = reportBuilder.title;
        this.author = reportBuilder.author;
        this.content = reportBuilder.content;
    }

    //inner class
    public static class ReportBuilder {
        //private properties
        private String title;
        private String author;
        private String content;
        //setter with returnType as ReportBuilder

        public ReportBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ReportBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }


        public ReportBuilder setContent(String content) {
            this.content = content;
            return this;
        }


        //build method with return obj
        public Report build() {
            if (this.content == null) {
                throw new IllegalArgumentException();
            }
            return new Report(this);
        }

    }
}


