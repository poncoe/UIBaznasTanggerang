package id.kataponcoe.uibaznas.java;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import id.kataponcoe.uibaznas.R;

/**
 * Created by Poncoe on 10/01/18.
 */

public class TidakTersedia extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tidak_tersedia);
    }

    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        finish();
    }
}