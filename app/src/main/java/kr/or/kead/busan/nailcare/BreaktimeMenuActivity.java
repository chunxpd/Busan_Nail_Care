package kr.or.kead.busan.nailcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BreaktimeMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaktime_menu);
    }



    public void onClickPrepare(View view) {
        Intent intent = new Intent(this, PrepareActivity.class);
        startActivity(intent);
    }

    public void onClickEnd(View view) {
        Intent intent = new Intent(this, ServiceEndActivity.class);
        startActivity(intent);
    }
    public void onClickAway(View view) {
        Intent intent = new Intent(this, AwayActivity.class);
        startActivity(intent);
    }

    public void onClickRefresh(View view) {
        Intent intent = new Intent(this, RefreshActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
