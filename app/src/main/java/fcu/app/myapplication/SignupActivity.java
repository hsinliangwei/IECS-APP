package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

  private Button btnSignupEnter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_signup);

    btnSignupEnter = findViewById(R.id.btn_account_enter);

    Button.OnClickListener listener = new Button.OnClickListener(){

      @Override
      public void onClick(View v) {
        if(v.getId() == R.id.btn_account_enter){
          Intent intent = new Intent(SignupActivity.this, MainActivity.class);
          startActivity(intent);
        }
      }
    };
    btnSignupEnter.setOnClickListener(listener);
  }
}