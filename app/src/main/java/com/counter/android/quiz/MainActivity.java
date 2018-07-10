package com.counter.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onClickEvent(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_1_option_1:
                    score = score + 1;
                    Toast.makeText(this, "Correct Answer.Your score is " + score, Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_2_option_4:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score ,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_3_option_1:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_4_option_3:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_5_option_1:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_6_option_3:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_7_option_3:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_8_option_3:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_9_option_4:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;
            case R.id.question_10_option_1:
                    score = score+1;
                Toast.makeText(this,"Correct Answer.Your score is " + score,Toast.LENGTH_SHORT).show();

                break;

                default:
                    Toast.makeText(this,"Wrong Answer",Toast.LENGTH_SHORT).show();
        }
    }
    public void displayScore(View view ){
        Toast.makeText(this,"You have answered " + score + " questions correctly",Toast.LENGTH_SHORT).show();
    }

}
