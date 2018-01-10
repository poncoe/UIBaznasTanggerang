package id.kataponcoe.uibaznas.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import id.kataponcoe.uibaznas.R;

/**
 * Created by Poncoe on 10/01/18.
 */



public class MenuActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu_main);

        findViewById(R.id.menu1).setOnClickListener(this);
        findViewById(R.id.menu2).setOnClickListener(this);
        findViewById(R.id.menu3).setOnClickListener(this);
        findViewById(R.id.menu4).setOnClickListener(this);
        findViewById(R.id.menu5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        if (v.getId() == R.id.menu1) {
            Toast.makeText(getApplicationContext(),"Masuk ke Menu1", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MenuActivity.this, TidakTersedia.class));
        }
        if (v.getId() == R.id.menu2) {
            Toast.makeText(getApplicationContext(),"Masuk ke Menu2", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MenuActivity.this, TidakTersedia.class));
        }
        if (v.getId() == R.id.menu3) {
            Toast.makeText(getApplicationContext(),"Masuk ke Menu3", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MenuActivity.this, TidakTersedia.class));
        }
        if (v.getId() == R.id.menu4) {
            Toast.makeText(getApplicationContext(),"Masuk ke Menu4", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MenuActivity.this, TidakTersedia.class));
        }
        if (v.getId() == R.id.menu5) {
            finish();
        }
    }
}
