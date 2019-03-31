package com.example.yatheeswari.quizzle;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;

    TextView score=null,question = null;

    public Questions nQuestions = new Questions();
    public String nAnswer="";
    public int nScore = 0;
    public int nQuestionsLength = nQuestions.nQuestions.length;
    Random r = new Random();

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        answer1 =  findViewById(R.id.answer1);
        answer2 =  findViewById(R.id.answer2);
        answer1 =  findViewById(R.id.answer3);
        answer1 =  findViewById(R.id.answer4);

        score =  findViewById(R.id.score);
        question =  findViewById(R.id.question);

        score.setText("Score : " + nScore);

        updateQuestion (r.nextInt(nQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if(answer1.getText().toString().equals(nAnswer)) {
                                               nScore++;
                                               score.setText("Score : " + nScore);
                                               updateQuestion(r.nextInt(nQuestionsLength) );
                                           }
                                           else
                                               gameOver();

                                       }
                                   });

            answer2.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               if(answer2.getText().toString().equals(nAnswer)) {
                                                   nScore++;
                                                   score.setText("Score : " + nScore);
                                                   updateQuestion(r.nextInt(nQuestionsLength) );
                                               }
                                               else
                                                   gameOver();

                                           }
                                       });

                answer3.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
            if(answer3.getText().toString().equals(nAnswer)) {
                nScore++;
                score.setText("Score : " + nScore);
                updateQuestion(r.nextInt(nQuestionsLength) );
            }
            else
                gameOver();

        }

        });

                    answer4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                     if(answer4.getText().toString().equals(nAnswer)) {
                         nScore++;
        score.setText("Score : " + nScore);
        updateQuestion(r.nextInt(nQuestionsLength) );
        }
        else
        gameOver();

        }
        });

    }

    public void updateQuestion (int num){
        score =  findViewById(R.id.score);
        question =  findViewById(R.id.question);
        answer1 =  findViewById(R.id.answer1);
        answer2 =  findViewById(R.id.answer2);
        answer3 =  findViewById(R.id.answer3);
        answer4 =  findViewById(R.id.answer4);
                    question.setText(nQuestions.getQuestion(num));
                    answer1.setText(nQuestions.getChoice1(num));
                    answer2.setText(nQuestions.getChoice2(num));
                    answer3.setText(nQuestions.getChoice3(num));
                    answer4.setText(nQuestions.getChoice4(num));

                    nAnswer = nQuestions.getCorrectAnswer(num);
                }

    public void gameOver(){
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                    alertDialogBuilder
                            .setMessage("GAME OVER!!! Your score is "+nScore+ " points.")
                            .setCancelable(false)
                            .setPositiveButton("NEW GAME",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                            finish();
                                        }
                                    })
                    .setNegativeButton("EXIT",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                }

                }


