package com.example.admin.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        EditText editText;
        Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            editText=findViewById(R.id.editText);
            button=findViewById(R.id.button);
        }
        public void msg(View view)
        {
            Toast.makeText(MainActivity.this,"Hello "+editText.getText().toString(),Toast.LENGTH_SHORT).show();
        }
    }
