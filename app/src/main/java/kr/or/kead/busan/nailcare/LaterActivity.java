package kr.or.kead.busan.nailcare;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class LaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get Language
        int nLanguage = 0;
        Language fnLang = (Language) getApplicationContext();
        nLanguage = fnLang.getGlobalLanguage();

        if (nLanguage == 1) {
            setContentView(R.layout.activity_later_eng);
        } else if (nLanguage == 2) {
            setContentView(R.layout.activity_later_jap);
        } else if (nLanguage == 3) {
            setContentView(R.layout.activity_later_chi);
        } else {
            setContentView(R.layout.activity_later);
        }
    }

    public void onClick(View view)
    {
        //finish();

        // Close All Activity
        // Move First Activity
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
