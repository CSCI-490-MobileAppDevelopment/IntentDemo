package edu.cofc.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate", "**********************************************I made it to onCreate ******************************************");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);

        forceError();

        i = new Intent(this, SecondActivity.class);
        i.putExtra("testString", "This is a test string");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //startActivity(i);

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kabriggs.people.cofc.edu"));
                startActivity(i);
            }
        });





    }

    public void forceError() {
        if(true) {
            throw new Error("********************** WHOOPS ***********************");
        }
    }
}
