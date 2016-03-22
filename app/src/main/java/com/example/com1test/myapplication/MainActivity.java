package com.example.com1test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Explict
    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private String userString, passwordString;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        bindWidget();

        //Button Controller
        buttonController();


    }// Main Method

    private void buttonController() {
      loginButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              // Receive value from Edit Text

              userString = userEditText.getText().toString().trim();
              passwordString = passwordEditText.getText().toString().trim();
              //Check Space
              if (userString.equals("")  || passwordString.equals("")) {
                  // Have Space
                  MyAlertDialog myAlertDialog = new MyAlertDialog();
                  myAlertDialog.myDialog(MainActivity.this,
                          "Emepty Row", " Please Fill the Rows Completely");

              } else {
                  // No Space
              }
          }// onClick
      });
    } //buttonController

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);

    }

}// Main Class
