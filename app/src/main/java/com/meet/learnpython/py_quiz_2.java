package com.meet.learnpython;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class py_quiz_2 extends AppCompatActivity {
    AdView mAdview;
    AdRequest adRequest;
    TextView tv,high_score;
    Button submitbutton, quitbutton,checkbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "What is the result of cmp(5, 2)?",
            "Which of the following symbols are used for comments in Python?",
            "Which one of the following has the highest precedence in the expression?",
            "What is answer of this expression, 22 % 3 is?",
            "Which keyword is use for function?.",
            "Which of the following data types is not supported in python?",
            "Which predefined Python function is used to find length of string?",
            "What dataype is the object below ?\n" +
                    "L = [1, 23, ‘hello’, 1].",
            "What is a recursive function?.",
            "Which of these in not a core datatype?"
    };
    String answers[] = {"1","#","Parentheses","1","def","Slice","len()","list","A function which calls itself.","Class"};
    String opt[] = {
            "1","0","True","False",
            "//","''","/**/","#",
            "Addition","Multiplication","Exponential","Parentheses",
            "7","1","0","5",
            "define","fun","def","function",
            "Numbers", "String","List","Slice",
            "length()","len()","strlen()","stringlength()",
            "list","dictionary","array", "tuple",
            "A function that calls other function.", "A function which calls itself.","Both of above" ,"None of the above",
            "Lists","Dictionary","Tuples", "Class"
    };
    int flag=0,flag2=0;
    Random random;
    myDbAdapter helper;
    ArrayList<Integer> arrayList;
    Vibrator vibe;
    public static int marks=0,correct=0,wrong=0;
    static int flag1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_py_quiz_2);

        mAdview = findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        AdLoader adLoader = new AdLoader.Builder(this, getResources().getString(R.string.PY_native))
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    private ColorDrawable background;@Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();
        adLoader.loadAd(adRequest);

        setTitle("Quiz 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        vibe=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        high_score=(TextView)findViewById(R.id.high_score);
        helper = new myDbAdapter(this);
        view_data();
        randon_num();

        final TextView score = (TextView) findViewById(R.id.textView4);

        submitbutton = (Button) findViewById(R.id.button3);
        quitbutton = (Button) findViewById(R.id.buttonquit);
        tv = (TextView) findViewById(R.id.tvque);

        flag=arrayList.get(flag2);
        radio_g = (RadioGroup) findViewById(R.id.answersgrp);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        tv.setText(flag2+1+". "+questions[flag]);
        rb1.setText(opt[flag * 4]);
        rb2.setText(opt[flag * 4 + 1]);
        rb3.setText(opt[flag * 4 + 2]);
        rb4.setText(opt[flag * 4 + 3]);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if (ansText.equals(answers[flag])) {
                    rb1.setBackgroundResource(R.drawable.radiobutton_border_1);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                } else {
                    rb1.setBackgroundResource(R.drawable.radiobutton_border_2);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                    vibrate();
                }
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if (ansText.equals(answers[flag])) {
                    rb2.setBackgroundResource(R.drawable.radiobutton_border_1);
                    rb1.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                else {
                    rb2.setBackgroundResource(R.drawable.radiobutton_border_2);
                    rb1.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                    vibrate();
                }
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if (ansText.equals(answers[flag])) {
                    rb3.setBackgroundResource(R.drawable.radiobutton_border_1);
                    rb2.setEnabled(false);
                    rb1.setEnabled(false);
                    rb4.setEnabled(false);
                } else {
                    rb3.setBackgroundResource(R.drawable.radiobutton_border_2);
                    rb2.setEnabled(false);
                    rb1.setEnabled(false);
                    rb4.setEnabled(false);
                    vibrate();
                }
            }
        });
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if (ansText.equals(answers[flag])) {
                    rb4.setBackgroundResource(R.drawable.radiobutton_border_1);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb1.setEnabled(false);
                } else {
                    rb4.setBackgroundResource(R.drawable.radiobutton_border_2);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb1.setEnabled(false);
                    vibrate();
                }
            }
        });

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio_g.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select option", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
                if (ansText.equals(answers[flag])) {
                    correct++;
                } else {
                    wrong++;
                }
                rb1.setBackgroundResource(R.drawable.radiobutton_border);
                rb2.setBackgroundResource(R.drawable.radiobutton_border);
                rb3.setBackgroundResource(R.drawable.radiobutton_border);
                rb4.setBackgroundResource(R.drawable.radiobutton_border);
                rb1.setEnabled(true);
                rb2.setEnabled(true);
                rb3.setEnabled(true);
                rb4.setEnabled(true);

                flag2++;

                if (score != null)
                    score.setText(correct + "/10");

                if (flag2 < questions.length) {
                    flag=arrayList.get(flag2);
                    tv.setText(flag2+1+". "+questions[flag]);
                    rb1.setText(opt[flag * 4]);
                    rb2.setText(opt[flag * 4 + 1]);
                    rb3.setText(opt[flag * 4 + 2]);
                    rb4.setText(opt[flag * 4 + 3]);
                } else {
                    marks = correct;

                    String data = helper.getData("2");
                    int a=Integer.parseInt(data.trim());
                    if(a<marks)
                    {
                        helper.updateName("2",marks+"");
                    }

                    if (marks >= 7) {
                        showDialog("Your Score: " + marks + "/10", "Congratulation your Score is above or equal to 70%.");
                        marks = correct = 0;
                    } else {
                        showDialog("Your Score: " + marks + "/10", "Bad Luck your Score is below 70%.");
                        marks = correct = 0;
                    }

                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                py_quiz_2.correct = 0;
                py_quiz_2.marks = 0;
            }
        });
    }
    public void vibrate()
    {
        if (Build.VERSION.SDK_INT >= 26) {
            vibe.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            vibe.vibrate(100);
        }
    }
    public void view_data()
    {
        String data = helper.getData("2");
        high_score.setText(data+"/10");
    }
    public void randon_num()
    {
        random = new Random();
        arrayList = new ArrayList<Integer>();

        while (arrayList.size() < 10) {
            int a = random.nextInt(10);
            if (!arrayList.contains(a)) {
                arrayList.add(a);
            }
        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                py_quiz_2.correct = 0;
                py_quiz_2.marks = 0;
                this.finish();
                return true;
            default:
                py_quiz_2.correct = 0;
                py_quiz_2.marks = 0;
                return super.onOptionsItemSelected(item);
        }
    }

    public void onBackPressed() {
        py_quiz_2.correct = 0;
        py_quiz_2.marks = 0;
        super.onBackPressed();
    }

    public void showDialog(String title, String des) {

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button cancelBTN = (Button) dialog.findViewById(R.id.cancelBTN);
        TextView tvTitle = (TextView) dialog.findViewById(R.id.title);
        TextView tvDescription = (TextView) dialog.findViewById(R.id.description);
        ImageView ivIcon = (ImageView) dialog.findViewById(R.id.icon);

        tvTitle.setText(title);
        tvDescription.setText(des);


        cancelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
