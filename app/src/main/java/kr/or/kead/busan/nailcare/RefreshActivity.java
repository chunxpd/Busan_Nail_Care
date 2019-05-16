package kr.or.kead.busan.nailcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RefreshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int nLanguage = 0;
        Language fnLang = (Language) getApplicationContext();
        nLanguage = fnLang.getGlobalLanguage();

        if (nLanguage == 1) {
            setContentView(R.layout.activity_refresh_eng);
        } else if (nLanguage == 2) {
            setContentView(R.layout.activity_refresh_jap);
        } else if (nLanguage == 3) {
            setContentView(R.layout.activity_refresh_chi);
        } else {
            setContentView(R.layout.activity_refresh);
        }
    }
}
