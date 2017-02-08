package example.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void logout(View view) {

        SharedPreferences.Editor sp = getSharedPreferences("user_info",MODE_PRIVATE).edit();

        sp.clear();

        sp.commit();

        finish();

        Intent i = new Intent(Home_Activity.this , MainActivity.class);
        startActivity(i);
    }
}
