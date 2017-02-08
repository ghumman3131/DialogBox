package example.demo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by ghumman on 2/8/2017.
 */

public class Pop_up extends Dialog {


    public Pop_up(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_layout);
    }
}
