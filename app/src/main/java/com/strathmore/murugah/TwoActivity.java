package com.strathmore.murugah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    private static final String LOG_TAG = "activity_main" ;

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        Intent intent = getIntent();

        if (intent.hasExtra("message")) {
            String text = getIntent().getStringExtra("message");
            TextView txt_message= findViewById(R.id.txt_message);
            txt_message.setText(text);
        }
    }

    public void activity_three(View view) {
        EditText message=findViewById(R.id.type_area);
        String text = message.getText().toString();

        if (!text.isEmpty()){
            message.setError(null);
            Intent intent = new Intent(this, ThreeActivity.class);
            intent.putExtra("message", text);
            startActivity(intent);

        }else {
            message.setError("Can not send an empty message");
        }
    }
}
