package edu.cofc.intentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kbriggs on 1/25/17.
 */
public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        String intentString = extras.getString("testString");

        textView = (TextView) findViewById(R.id.intentText);
        textView.setText(intentString);

    }
}
