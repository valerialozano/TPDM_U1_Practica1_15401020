package mx.edu.ittepic.tpdm_u1_practica1_15401020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    var btImg1: ImageButton?=null
    var btImg2: ImageButton?=null
    var btImg3: ImageButton?=null
    var btImg4: ImageButton?=null
    var btImg5: ImageButton?=null
    var btImg6: ImageButton?=null
    var btImg7: ImageButton?=null
    var btImg8: ImageButton?=null
    var btImg9: ImageButton?=null
    var btImg10: ImageButton?=null
    var btImg11: ImageButton?=null
    var btImg12: ImageButton?=null
    var btImg13: ImageButton?=null
    var btImg14: ImageButton?=null
    var btImg15: ImageButton?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btImg1 = findViewById(R.id.btImg1)
        btImg2 = findViewById(R.id.btImg2)
        btImg3 = findViewById(R.id.btImg3)
        btImg4 = findViewById(R.id.btImg4)
        btImg5 = findViewById(R.id.btImg5)
        btImg6 = findViewById(R.id.btImg6)
        btImg7 = findViewById(R.id.btImg7)
        btImg8 = findViewById(R.id.btImg8)
        btImg9 = findViewById(R.id.btImg9)
        btImg10 = findViewById(R.id.btImg10)
        btImg11 = findViewById(R.id.btImg11)
        btImg12 = findViewById(R.id.btImg12)
        btImg13 = findViewById(R.id.btImg13)
        btImg14 = findViewById(R.id.btImg14)
        btImg15 = findViewById(R.id.btImg15)

        btImg1?.setOnClickListener{
            var actImg1 = Intent(this, activityImg1::class.java)
            startActivity(actImg1)
        }
        btImg2?.setOnClickListener{
            var actImg2 = Intent(this, activityImg2::class.java)
            startActivity(actImg2)
        }
        btImg3?.setOnClickListener{
            var actImg3 = Intent(this, activityImg3::class.java)
            startActivity(actImg3)
        }
        btImg4?.setOnClickListener{
            var actImg4 = Intent(this, activityImg4::class.java)
            startActivity(actImg4)
        }
        btImg5?.setOnClickListener{
            var actImg5 = Intent(this, activityImg5::class.java)
            startActivity(actImg5)
        }
        btImg6?.setOnClickListener{
            var actImg6 = Intent(this, activityImg6::class.java)
            startActivity(actImg6)
        }
        btImg7?.setOnClickListener{
            var actImg7 = Intent(this, activityImg7::class.java)
            startActivity(actImg7)
        }
        btImg8?.setOnClickListener{
            var actImg8 = Intent(this, activityImg8::class.java)
            startActivity(actImg8)
        }
        btImg9?.setOnClickListener{
            var actImg9 = Intent(this, activityImg9::class.java)
            startActivity(actImg9)
        }
        btImg10?.setOnClickListener{
            var actImg10 = Intent(this, activityImg10::class.java)
            startActivity(actImg10)
        }
        btImg11?.setOnClickListener{
            var actImg11 = Intent(this, activityImg11::class.java)
            startActivity(actImg11)
        }
        btImg12?.setOnClickListener{
            var actImg12 = Intent(this, activityImg12::class.java)
            startActivity(actImg12)
        }
        btImg13?.setOnClickListener{
            var actImg13 = Intent(this, activityImg13::class.java)
            startActivity(actImg13)
        }
        btImg14?.setOnClickListener{
            var actImg14 = Intent(this, activityImg14::class.java)
            startActivity(actImg14)
        }
        btImg15?.setOnClickListener{
            var actImg15 = Intent(this, activityImg15::class.java)
            startActivity(actImg15)
        }

    }
}
