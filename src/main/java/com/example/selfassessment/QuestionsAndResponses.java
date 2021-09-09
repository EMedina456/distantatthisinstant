package com.example.selfassessment;

//Questions and Responses Class
public class QuestionsAndResponses {

    //Create attributes
    String question;
    String yes;
    String no;
    boolean safe;

    //Constructor
    public QuestionsAndResponses(String question, String yes, String no){
        this.question = question;
        this.yes = yes;
        this.no = no;
    }

    //Getters and Setters
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getYes() {
        return yes;
    }
    public void setYes(String yes) {
        this.yes = yes;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public boolean isSafe() {
        return safe;
    }
    public void setSafe(boolean safe) {
        this.safe = safe;
    }
}
