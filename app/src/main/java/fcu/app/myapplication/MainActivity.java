package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button btnSignin;
  private Button btnSignup;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnSignin = findViewById(R.id.btn_signin);
    btnSignup = findViewById(R.id.btn_signup);

    Button.OnClickListener listener = new Button.OnClickListener(){

      @Override
      public void onClick(View v) {
        if(v.getId() == R.id.btn_signin){
          Intent intent = new Intent(MainActivity.this, NavActivity.class);
          startActivity(intent);
        } else if(v.getId() == R.id.btn_signup){
          Intent intent = new Intent(MainActivity.this, SignupActivity.class);
          startActivity(intent);
        }
      }
    };
    btnSignin.setOnClickListener(listener);
    btnSignup.setOnClickListener(listener);


  }
}