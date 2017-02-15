package wtf.log.unuseddestructuresimexception

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onStart() {
    super.onStart()
    Log.d("MainActivity", "Exposed: ${exposeBug()}")
  }

  fun worksFine(): Int {
    val (foo) = intArrayOf(1)
    val baz: Int = 1

    return baz
  }

  fun exposeBug(): Int {
    val (foo) = intArrayOf(1)
    val baz: Int
    baz = 1

    return baz
  }

}
