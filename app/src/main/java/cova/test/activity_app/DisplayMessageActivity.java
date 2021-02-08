package cova.test.activity_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("ACTIVITY_CHANGE");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
}