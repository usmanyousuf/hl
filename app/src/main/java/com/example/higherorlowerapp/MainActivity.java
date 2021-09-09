package com.example.higherorlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void generateRandomnumber(){
        Random rand = new Random();
        randomnumber = rand.nextInt(20)+ 1;
    }

public void guess(View view)
{
   String message;
    EditText editText = (EditText)findViewById(R.id.editText);
    int guessvalue = Integer.parseInt(editText.getText().toString());
    if(guessvalue>randomnumber)
    {
        message = " Guess little bit lower!";
    }
    else
        if(guessvalue<randomnumber)
    {
        message = "Guess little bit higher";
    }
    else
        {
            message = "Congrats you have guessed the correct number";

            generateRandomnumber();

        }

    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomnumber();
    }
}
