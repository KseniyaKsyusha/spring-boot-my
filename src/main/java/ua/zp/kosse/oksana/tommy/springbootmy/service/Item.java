package ua.zp.kosse.oksana.tommy.springbootmy.service;

public class Item {
    private String project;
    private String timestamp;
    private int compilationTime;
    private String result;

    public Item(String project, String timestamp, int compilationTime, String result) {
        super();
        this.project = project;
        this.timestamp = timestamp;
        this.compilationTime = compilationTime;
        this.result = result;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getCompilationTime() {
        return compilationTime;
    }

    public void setCompilationTime(int compilationTime) {
        this.compilationTime = compilationTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

