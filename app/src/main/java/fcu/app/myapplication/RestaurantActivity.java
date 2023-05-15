package fcu.app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantActivity extends AppCompatActivity {

    private Button btnFcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        btnFcu = findViewById(R.id.btn_fcu);

        Button.OnClickListener listener = new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btn_fcu){
                    Intent intent = new Intent(RestaurantActivity.this, MenuActivity.class);
                    startActivity(intent);
                }
            }
        };
        btnFcu.setOnClickListener(listener);

    }
}