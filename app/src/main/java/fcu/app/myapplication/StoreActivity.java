package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

  private Button btnF;
  private Button btnD;
  private Button btnJ;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_store);

    btnF = findViewById(R.id.btn_f);
    btnD =findViewById(R.id.btn_d);
    btnJ = findViewById(R.id.btn_j);

    Button.OnClickListener listener = new Button.OnClickListener(){

      @Override
      public void onClick(View v) {
        if(v.getId() == R.id.btn_f){
          Intent intent = new Intent(StoreActivity.this, MenuActivity.class);
          startActivity(intent);
        } else if(v.getId() == R.id.btn_d){
          Intent intent = new Intent(StoreActivity.this, MenuActivity.class);
          startActivity(intent);
        }
        else if(v.getId() == R.id.btn_j){
          Intent intent = new Intent(StoreActivity.this, MenuActivity.class);
          startActivity(intent);
        }
      }
    };
   btnF.setOnClickListener(listener);
    btnD.setOnClickListener(listener);
    btnJ.setOnClickListener(listener);
  }
}