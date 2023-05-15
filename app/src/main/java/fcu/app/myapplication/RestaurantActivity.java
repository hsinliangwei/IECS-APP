package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantActivity extends AppCompatActivity {

    private Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        btnMenu = findViewById(R.id.r_btn_menu);

        Button.OnClickListener listener = new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.r_btn_menu){
                    Intent intent = new Intent(RestaurantActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
            }
        };
         btnMenu.setOnClickListener(listener);

    }
}