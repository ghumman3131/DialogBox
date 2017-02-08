package example.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences("user_info" , MODE_PRIVATE);

        String savedValue = sp.getString("remember","No");

        if(savedValue.equals("yes"))
        {
            Intent i  = new Intent(MainActivity.this , Home_Activity.class);

            startActivity(i);

            finish();
        }
    }


    public void login(View view) {

        CheckBox check_box = (CheckBox) findViewById(R.id.checkbox_id);

        Boolean check_value = check_box.isChecked();

        if(check_value)
        {
            SharedPreferences.Editor sp = getSharedPreferences("user_info",MODE_PRIVATE).edit();

            sp.putString("remember","yes");

            sp.commit();
        }

        Intent i = new Intent(MainActivity.this , Home_Activity.class);

        startActivity(i);
    }

    public void showpopup(View view) {

        Pop_up pop = new Pop_up(MainActivity.this);

        pop.show();
    }
}
