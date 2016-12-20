package com.example.hb.newclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_class);
        Button writeButton,printButton;
         TextView textView;

            writeButton = (Button)findViewById(R.id.write);
            printButton= (Button)findViewById(R.id.print);
            textView =(TextView)findViewById(R.id.textView_);

            final ClasWork c = new ClasWork();

            writeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(c.write().toString());
                }
            });

            printButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(c.print().toString());
                }
            });

        }
}
