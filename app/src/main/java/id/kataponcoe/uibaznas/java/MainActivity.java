package id.kataponcoe.uibaznas.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import id.kataponcoe.uibaznas.R;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnMasuk).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        if (v.getId() == R.id.btnMasuk) {
            Toast.makeText(getApplicationContext(),"Hai Selamat Datang", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, MenuActivity.class));
        }
    }

    public void onBackPressed() {
        this. finish();

    }
}
