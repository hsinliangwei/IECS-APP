package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;

public class HomeActivity extends AppCompatActivity {
  private TabItem tbCarts;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    /*tbCarts = findViewById(R.id.tb_carts);
    TabItem.OnClickListener listener = new TabItem.OnClickListener(){

      @Override
      public void onClick(View v) {
        if(v.getId() == R.id.tb_carts){
          Intent intent = new Intent(HomeActivity.this, CartsActivity.class);
          startActivity(intent);
        }
      }
    };
    tbCarts.setOnClickListener(listener);*/
  }
}