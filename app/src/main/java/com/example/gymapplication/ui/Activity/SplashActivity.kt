package com.example.gymapplication.ui.Activity


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gymapplication.ui.Activity.HomeActivity
import com.example.gymapplication.R
import com.example.gymapplication.databinding.ActivityEditableHomeBinding
import com.example.gymapplication.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
   companion object{
       const val STATUS_LOGIN="login"
   }

    val MyPREFERENCES = "MyPREFERENCE"

    val sharedPreferences : SharedPreferences by lazy {
        getSharedPreferences(MyPREFERENCES , Context.MODE_PRIVATE)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(sharedPreferences.getBoolean(STATUS_LOGIN, false)){
            startActivity(Intent(this , HomeActivity::class.java))
            finish()
//            val intent = Intent(this, ECGgraphActivity::class.java)
//            intent.putExtra("result1", 3L)
//            intent.putExtra("result2", 4L)
////            intent.putExtra("result3", viewmodel.result3)
////            intent.putExtra("result4", viewmodel.result4)
//
//            finish()
        }
        else{
            startActivity(Intent(this , LoginActivity::class.java))
            finish()
        }

    }

}


























//        window.setFlags(
//                WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN
//        )

// we used the postDelayed(Runnable, time) method
// to send a message with a delayed time.
//        Handler().postDelayed({
//            // This method will be executed once the timer is over
//            // Start your app main activity
//
//            startActivity(Intent(this,LoginActivity::class.java))
//
//            // close this activity
//            finish()
//        }, SPLASH_TIME_OUT)

//        Handler().postDelayed({
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//            finish()
//        }, 3000) // 3000 is the delayed time in milliseconds.