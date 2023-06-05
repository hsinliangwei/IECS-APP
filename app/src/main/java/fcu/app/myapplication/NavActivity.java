package fcu.app.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import fcu.app.myapplication.databinding.ActivityNavBinding;

public class NavActivity extends AppCompatActivity {
  private Button btnStore;
  private Button btnToMenu;
  private ActivityNavBinding binding;

  private Button btnAdd;
  private Button btnMinus;

  private EditText etNumber;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.fragment_dashboard);

    // 获取传递的目标目的地
    int destination = getIntent().getIntExtra("destination", -1);

    // 设置NavController
    //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_nav);




    binding = ActivityNavBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    BottomNavigationView navView = findViewById(R.id.nav_view);
    // Passing each menu ID as a set of Ids because each
    // menu should be considered as top level destinations.
    AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
      R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
      .build();
    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_nav);
    /*NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);*/
    NavigationUI.setupWithNavController(binding.navView, navController);



    // 导航到目标目的地
    if (destination != -1) {
      navController.navigate(destination);
    }



    NavDestination currentDestination = navController.getCurrentDestination();
    if (currentDestination.getId() == R.id.navigation_home) {
      btnStore = findViewById(R.id.btn_store);
      btnToMenu = findViewById(R.id.btn_toMenu);
      Button.OnClickListener listener = new Button.OnClickListener() {

        @Override
        public void onClick(View view) {
          if (view.getId() == R.id.btn_store) {
            Intent intent = new Intent(NavActivity.this, StoreActivity.class);
            startActivity(intent);
          } else if (view.getId() == R.id.btn_toMenu) {
            Intent intent = new Intent(NavActivity.this, MenuActivity.class);
            startActivity(intent);
          }
        }


      };
      btnStore.setOnClickListener(listener);
      btnToMenu.setOnClickListener(listener);


    } else if (currentDestination.getId() == R.id.navigation_dashboard) {
      btnAdd = findViewById(R.id.btn_add);
      btnMinus= findViewById(R.id.btn_minus);
      etNumber=findViewById(R.id.et_number);
      Button.OnClickListener listener1 = new Button.OnClickListener() {

        @Override
        public void onClick(View view) {
          if (view.getId() == R.id.btn_add) {
            String numberString = etNumber.getText().toString();
            int number = Integer.parseInt(numberString);
            number += 1;
            etNumber.setText(String.valueOf(number));

          } else if (view.getId() == R.id.btn_minus) {
            Intent intent = new Intent(NavActivity.this, MenuActivity.class);
            startActivity(intent);
          }
        }


      };
      //btnAdd.setOnClickListener(listener1);
      //btnMinus.setOnClickListener(listener1);

//      String selectedMeal = getIntent().getStringExtra("selectedMeal");
//      TextView displayTextView = findViewById(R.id.tv_display_menu);
//      displayTextView.setText(selectedMeal);





    }else if (currentDestination.getId() == R.id.navigation_notifications) {
      // 處理 NotificationsFragment 上的按鈕點擊事件
    }




  }


}