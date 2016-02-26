package com.example.mauriciosilva.fb_interface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final TextView textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                String login = editText.getText().toString();
                String pass = editText2.getText().toString();
                String passC = editText3.getText().toString();

                if (pass.equals(passC))
                {
                    Toast.makeText(view.getContext(), "Account Created", Toast.LENGTH_SHORT).show();
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
                startActivity(new Intent(view.getContext(), MainActivity.class));
            }

        });
    }
}
