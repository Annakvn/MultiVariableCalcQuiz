package com.example.android.multi_variablecalcquiz;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Activated when user hits the submit button
    //answers are checked, toast message pops up, and answers reset automatically
    public void CheckQuestions(View view) {
        String correctAnswer1 = "ellipsoid";
        EditText text = findViewById(R.id.text_answer_1);
        String textAnswer1 = text.getText().toString();
        if (textAnswer1.equalsIgnoreCase(correctAnswer1))
            score ++;
        text.setText("");

        String correctAnswer2 = "Cylinder";
        EditText text2 = findViewById(R.id.text_answer_2);
        String textAnswer2 = text2.getText().toString();
        if (textAnswer2.equalsIgnoreCase(correctAnswer2))
            score ++;
        text2.setText("");

        String correctAnswer3 = "Cone";
        EditText text3 = findViewById(R.id.text_answer_3);
        String textAnswer3 = text3.getText().toString();
        if (textAnswer3.equalsIgnoreCase(correctAnswer3))
            score ++;
        text3.setText("");

        RadioButton radioOne = findViewById(R.id.correct_rad_1);
        boolean correctRadio1 = radioOne.isChecked();
        if(correctRadio1)
            score ++;

        RadioButton radioTwo = findViewById(R.id.correct_rad_2);
        boolean correctRadio2 = radioTwo.isChecked();
        if(correctRadio2)
            score ++;

        RadioButton radioThree = findViewById(R.id.correct_rad_3);
        boolean correctRadio3 = radioThree.isChecked();
        if(correctRadio3)
            score ++;

        CheckBox checkBox1 = findViewById(R.id.check_1_ans);
        boolean correctChecked1= checkBox1.isChecked();
        CheckBox checkBox2 = findViewById(R.id.check_2_ans);
        boolean correctChecked2= checkBox2.isChecked();
        CheckBox checkBox3 = findViewById(R.id.check_3_ans);
        boolean correctChecked3= checkBox3.isChecked();
        if(correctChecked1 && correctChecked2 && correctChecked3)
            score ++;

        Toast.makeText(getApplicationContext(),getResults(),Toast.LENGTH_LONG).show();

        RadioGroup group1 = findViewById(R.id.group1);
        group1.clearCheck();
        RadioGroup group2 = findViewById(R.id.group2);
        group2.clearCheck();
        RadioGroup group3 = findViewById(R.id.group3);
        group3.clearCheck();

        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);

        score = 0;

    }
    //provides message for toast with proper score 
    private String getResults(){
        String results;
        if (score >= 5)
            results = "Congrats!\n" +
                    "You did very well!\n" +
                    "You got "+ score+ " out of 7\n";
        else
            results = "You should study more.\n" +
                    "You got "+ score +" out of 7.\n";
        return results;

    }

}





