package com.example.cathy.myfirstapp;
/* Author Cathy Lane */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMe (View view){
        Toast myToast = Toast.makeText(this, "Hello Toast! ", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void countMe (View view){
        TextView showCountTextView = (TextView) findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();    //storing as string
        Integer count = Integer.parseInt(countString);          //converting to integer
        count++;

        showCountTextView.setText(count.toString());
    }
    private static final String TOTAL_COUNT = "total_count";

    public void randomMe(View view){
        Intent randomIntent = new Intent(this, SecondActivity.class); //creates intent
        TextView showCountTextView = (TextView) findViewById(R.id.textView); //gets the textview showing the count
        String countString = showCountTextView.getText().toString(); //gets value of count of the textview
        int count = Integer.parseInt(countString); //converts count to int
        randomIntent.putExtra(TOTAL_COUNT, count); //passes count as an extra through intent
        startActivity(randomIntent);
    }
}
