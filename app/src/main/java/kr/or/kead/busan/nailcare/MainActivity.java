package kr.or.kead.busan.nailcare;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }

    public void onClickEng(View view)
    {
        // Set Language - Eng
        Language fnLang = (Language) getApplicationContext();
        fnLang.setGlobalLanguage(1);

        Intent intent = new Intent(this, MainStart.class);
        startActivity(intent);
    }

    public void onClickJap(View view)
    {
        // Set Language - Jap
        Language fnLang = (Language) getApplicationContext();
        fnLang.setGlobalLanguage(2);

        Intent intent = new Intent(this, MainStart.class);
        startActivity(intent);
    }

    public void onClickChi(View view)
    {
        // Set Language - Chi
        Language fnLang = (Language) getApplicationContext();
        fnLang.setGlobalLanguage(3);

        Intent intent = new Intent(this, MainStart.class);
        startActivity(intent);
    }

    public void onClickKor(View view)
    {
        // Set Language - Kor
        Language fnLang = (Language) getApplicationContext();
        fnLang.setGlobalLanguage(0);

        Intent intent = new Intent(this, MainStart.class);
        startActivity(intent);
    }
}
