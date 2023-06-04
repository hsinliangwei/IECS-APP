package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
  private Button btnMenuCarts;
  private TextView tvMeal1;
  private TextView tvMeal2;
  private TextView tvMeal3;
  private TextView tvMeal4;
  private TextView tvMeal5;
  private TextView tvMeal6;
  private TextView tvMeal7;
  private TextView tvMeal8;
  private TextView tvMeal9;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);

    btnMenuCarts = findViewById(R.id.btn_menu_carts);
    tvMeal1 = findViewById(R.id.meal_1);
    tvMeal2 = findViewById(R.id.meal_2);
    tvMeal3 = findViewById(R.id.meal_3);
    tvMeal4 = findViewById(R.id.meal_4);
    tvMeal5 = findViewById(R.id.meal_5);
    tvMeal6 = findViewById(R.id.meal_6);
    tvMeal7 = findViewById(R.id.meal_7);
    tvMeal8 = findViewById(R.id.meal_8);
    tvMeal9 = findViewById(R.id.meal_9);


    Button.OnClickListener listener = new Button.OnClickListener(){

      @Override
      public void onClick(View v) {
        if(v.getId() == R.id.btn_menu_carts){
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          startActivity(intent);
        }
      }
    };

    View.OnClickListener listener1 = new View.OnClickListener(){

      @Override
      public void onClick(View view) {
        if(view.getId() == R.id.meal_1){
          String selectedMeal = tvMeal1.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_2){
          String selectedMeal = tvMeal2.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_3) {
          String selectedMeal = tvMeal3.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_4){
          String selectedMeal = tvMeal4.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_5){
          String selectedMeal = tvMeal5.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_6){
          String selectedMeal = tvMeal6.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_7){
          String selectedMeal = tvMeal7.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_8){
          String selectedMeal = tvMeal8.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        } else if(view.getId() == R.id.meal_9){
          String selectedMeal = tvMeal9.getText().toString();
          Intent intent = new Intent(MenuActivity.this, NavActivity.class);
          intent.putExtra("selectedMeal", selectedMeal);
          startActivity(intent);
        }
      }
    };

    btnMenuCarts.setOnClickListener(listener);
    tvMeal1.setOnClickListener(listener1);
    tvMeal2.setOnClickListener(listener1);
    tvMeal3.setOnClickListener(listener1);
    tvMeal4.setOnClickListener(listener1);
    tvMeal5.setOnClickListener(listener1);
    tvMeal6.setOnClickListener(listener1);
    tvMeal7.setOnClickListener(listener1);
    tvMeal8.setOnClickListener(listener1);
    tvMeal9.setOnClickListener(listener1);

  }
}