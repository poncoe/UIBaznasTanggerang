package id.kataponcoe.uibaznas.kotlin

import android.app.Activity
import android.os.Bundle
import android.view.View

import id.kataponcoe.uibaznas.R

/**
 * Created by Poncoe on 10/01/18.
 */

class TidakTersedia : Activity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tidak_tersedia)
    }

    fun onClick(arg0: View) {
        // TODO Auto-generated method stub
        finish()
    }
}