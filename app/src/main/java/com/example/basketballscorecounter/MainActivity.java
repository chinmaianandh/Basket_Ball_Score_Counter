package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    int score_a=0;
    int score_b=0;

    public void reset(View view)
    {
        score_a=0;
        score_b=0;
        display_a();
        display_b();
    }
    public void inc_a_3(View view)
    {
        increase_a_by(3);
    }
    public void inc_a_2(View view)
    {
        increase_a_by(2);
    }
    public void inc_a_1(View view)
    {
        increase_a_by(1);
    }
    public void inc_b_3(View view)
    {
        increase_b_by(3);
    }
    public void inc_b_2(View view)
    {
        increase_b_by(2);
    }
    public void inc_b_1(View view)
    {
        increase_b_by(1);
    }

    private void increase_a_by(int x)
    {
        score_a+=x;
        display_a();
    }

    private void increase_b_by(int x)
    {
        score_b+=x;
        display_b();
    }

    private void display_a()
    {
        TextView text_a=(TextView)findViewById(R.id.score_a);
        text_a.setText(""+score_a);
    }
    private void display_b()
    {
        TextView text_a=(TextView)findViewById(R.id.score_b);
        text_a.setText(""+score_b);
    }
}
