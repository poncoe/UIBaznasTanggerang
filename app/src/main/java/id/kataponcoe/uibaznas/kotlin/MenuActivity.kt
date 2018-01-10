package id.kataponcoe.uibaznas.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast

import id.kataponcoe.uibaznas.R

/**
 * Created by Poncoe on 10/01/18.
 */


class MenuActivity : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.menu_main)

        findViewById<View>(R.id.menu1).setOnClickListener(this)
        findViewById<View>(R.id.menu2).setOnClickListener(this)
        findViewById<View>(R.id.menu3).setOnClickListener(this)
        findViewById<View>(R.id.menu4).setOnClickListener(this)
        findViewById<View>(R.id.menu5).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // TODO Auto-generated method stub

        if (v.id == R.id.menu1) {
            Toast.makeText(applicationContext, "Masuk ke Menu1", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MenuActivity, TidakTersedia::class.java))
        }
        if (v.id == R.id.menu2) {
            Toast.makeText(applicationContext, "Masuk ke Menu2", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MenuActivity, TidakTersedia::class.java))
        }
        if (v.id == R.id.menu3) {
            Toast.makeText(applicationContext, "Masuk ke Menu3", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MenuActivity, TidakTersedia::class.java))
        }
        if (v.id == R.id.menu4) {
            Toast.makeText(applicationContext, "Masuk ke Menu4", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MenuActivity, TidakTersedia::class.java))
        }
        if (v.id == R.id.menu5) {
            Toast.makeText(applicationContext, "Masuk ke Menu5", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MenuActivity, TidakTersedia::class.java))
        }
    }

    override fun onBackPressed() {
        this.finish()

    }
}
