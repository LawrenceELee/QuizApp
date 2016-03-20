package com.example.lawrence.quizapp;

public class TrueFalse {

    private int mQuestion;          // this is an int and not a String because we're getting it from the strings.xml as a resource.
    private boolean mTrueQuestion;  // indicates if the answer to question is true or not.

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    // setters and getters for private fields.
    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
