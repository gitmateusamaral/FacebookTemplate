package com.example.mauriciosilva.fb_interface;

import android.app.Activity;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final TextView textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view)
            {
                String login = editText.getText().toString();
                String pass = editText2.getText().toString();

                if(login.equals("Jamv") && pass.equals("TimTim"))
                {
                    Toast.makeText(view.getContext(), "Login Confirmed", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(view.getContext(), "Incorrect Data", Toast.LENGTH_SHORT).show();
                }

            }
        });

        textView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                startActivity(new Intent(view.getContext(), Main2Activity.class));
            }

        });
    }
}
