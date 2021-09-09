package com.example.selfassessment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

//Main Activity Class
public class SelfAssessmentActivity extends AppCompatActivity {

    //Variables
    int questionCounter = 0;
    boolean safe = true;

    //Functions
    TextView progressTracker, question;
    Button yes, no;

    //ArrayList for Questions and Responses
    ArrayList<QuestionsAndResponses> questionsAndResponsesArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_assessment_activity);

        //Find by id
        this.progressTracker = findViewById(R.id.progressTracker);
        this.question = findViewById(R.id.question);
        this.yes = findViewById(R.id.yes);
        this.no = findViewById(R.id.no);

        //Questions and Answers
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Have You Tested Positive For Covid-19?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Have You Come Into Contact With Anyone That Has Tested Positive For Covid-19?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Have You Travelled Anywhere Outside Of Canada In The Past 14 Days?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Have You Come Into Contact With Any Person That Has Flu-Like Symptoms In The Past 14 Days?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Do You Have A Cough?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Do You Have A Fever?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Do You Have Shortness Off Breath?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Do You Have A Sore Throat?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Do You Have A Runny Nose?","Yes","No"));
        questionsAndResponsesArrayList.add(new QuestionsAndResponses("Do You Feel Unwell?","Yes","No"));

        //Determine whether the user is safe based off their response
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextQuestion(true);
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextQuestion(false);
            }
        });
    }

    //Display questions
    public void questions(int questionNumber, boolean isSafe){

        //Update the progress tracker
        QuestionsAndResponses q = questionsAndResponsesArrayList.get(questionNumber);
        progressTracker.setText("Question "+(questionNumber+1)+"/10");

        //Get & Set
        question.setText((questionNumber+1)+". "+q.getQuestion());
        yes.setText(q.getYes());
        no.setText(q.getNo());
        q.setSafe(isSafe);

    }

    private void goToNextQuestion(boolean safe) {
        //If Self Assessment is not complete
        if (questionCounter<(questionsAndResponsesArrayList.size()-1)) {
            questionCounter++;
            questions(questionCounter, safe);
        }
        //If Self Assessment is complete
        else {
            //If the user is not safe, advise them (ERIC PUT UR STUFF IN HERE)
            if (isSafe()){

            }
            //If the user is safe, remind them to follow safety precautions (ERIC PUT STUFF IN HERE)
            else {

            }
        }
    }

    private boolean isSafe() {
        for(QuestionsAndResponses qr:questionsAndResponsesArrayList) {
            if (!qr.isSafe()) {
                return false;
            }
        }
        return true;
    }

}