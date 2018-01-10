package id.kataponcoe.uibaznas.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast

import id.kataponcoe.uibaznas.R

class MainActivity : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnMasuk).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // TODO Auto-generated method stub

        if (v.id == R.id.btnMasuk) {
            Toast.makeText(applicationContext, "Hai Selamat Datang", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity, MenuActivity::class.java))
        }
    }

    override fun onBackPressed() {
        this.finish()

    }
}
