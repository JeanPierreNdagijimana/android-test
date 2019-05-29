package com.strathmore.murugah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView; //defining_a_text_view
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.num); //initialising_a_text_view
    }

    public void show_toast(View view) {

        String count= textView.getText().toString(); //getting_a_text_from_textview_and_assigning_it_to_the_string_count
        Toast.makeText(this,count, Toast.LENGTH_LONG).show(); //displaying_the_count
    }

    public void show_count(View view) {
        mCount++;
        if (textView != null)
            textView.setText(Integer.toString(mCount));
    }

    public void next(View view) {
        Intent newspage = new Intent(this, Scroll_View.class);
        startActivity(newspage);
    }

    public void activity_two(View view) {
        startActivity( new Intent(this, TwoActivity.class));
    }
}
