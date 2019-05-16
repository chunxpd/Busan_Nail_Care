package kr.or.kead.busan.nailcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainStart extends AppCompatActivity {
    //private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int nLanguage = 0;
        Language fnLang = (Language) getApplicationContext();
        nLanguage = fnLang.getGlobalLanguage();

        if (nLanguage == 1) {
            setContentView(R.layout.activity_main_eng);
        } else if (nLanguage == 2) {
            setContentView(R.layout.activity_main_jap);
        } else if (nLanguage == 3) {
            setContentView(R.layout.activity_main_chi);
        } else {
            setContentView(R.layout.activity_main);
        }

        //backPressCloseHandler = new BackPressCloseHandler(this);
    }

    public void onClickOk(View view) {
        Intent intent = new Intent(this, Proc1Activity.class);

        int nLanguage = 0;
        Language fnLang = (Language) getApplicationContext();
        nLanguage = fnLang.getGlobalLanguage();

        if (nLanguage == 1) {
            intent.putExtra("care","Continue");
        } else if (nLanguage == 2) {
            intent.putExtra("care","基本ケアを");
        } else if (nLanguage == 3) {
            intent.putExtra("care","指甲护理");
        } else {
            intent.putExtra("care","기본 케어");
        }

        startActivityForResult(intent, 0);
    }

    public void onClickLater(View view) {
        Intent intent = new Intent(this, LaterActivity.class);
        //Intent intent = new Intent(this, Step5Activity.class);
        startActivity(intent);
    }

    //@Override public void onBackPressed() {
        //super.onBackPressed();
        //backPressCloseHandler.onBackPressed();
    //}

    public void onClickBreakTime(View view) {
        Intent intent = new Intent(this, BreaktimeMenuActivity.class);
        startActivity(intent);
    }

}
