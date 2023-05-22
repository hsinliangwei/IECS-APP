package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
  private Button btnMenuCarts;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);

    btnMenuCarts = findViewById(R.id.btn_menu_carts);

    Button.OnClickListener listener = new Button.OnClickListener(){

      @Override
      public void onClick(View v) {
        if(v.getId() == R.id.btn_menu_carts){
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          startActivity(intent);
        }
      }
    };
    btnMenuCarts.setOnClickListener(listener);
  }
}