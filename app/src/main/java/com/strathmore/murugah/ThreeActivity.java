package com.strathmore.murugah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        message= findViewById(R.id.type_area);

        Intent intent = getIntent();

        if (intent.hasExtra("message")) {
            String text = getIntent().getStringExtra("message");
            TextView txt_message= findViewById(R.id.txt_message);
            txt_message.setText(text);
        }
    }

    public void reply(View view) {
        String text = message.getText().toString();

        if (!text.isEmpty()){
            message.setError(null);
            Intent intent = new Intent(this, TwoActivity.class);
            intent.putExtra("message", text);
            startActivity(intent);

        }else {
            message.setError("Can not send an empty message");
        }


    }
}
