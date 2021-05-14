package com.example.todo_17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1,mScore2;
    private TextView mScoreText1,mScoreText2;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.night_mode){
            int nightMode= AppCompatDelegate.getDefaultNightMode();
            if(nightMode==AppCompatDelegate.MODE_NIGHT_YES){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreText1=findViewById(R.id.score);
       mScoreText2 =findViewById(R.id.score_2);

    }

    public void Decrease_Score(View view) {
        int viewID=view.getId();
        switch (viewID){
            case R.id.decrease_Team:
            mScore1--;
            mScoreText1.setText(String.valueOf(mScore1));

            case R.id.decrease_Team2:
                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));
        }

    }

    public void Increase_Score(View view) {
        int viewID=view.getId();
        switch (viewID){
            case R.id.increase_Team:
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));

            case R.id.increase_Team2:
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }
}