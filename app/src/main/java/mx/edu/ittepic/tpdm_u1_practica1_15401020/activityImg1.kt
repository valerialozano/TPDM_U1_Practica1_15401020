package mx.edu.ittepic.tpdm_u1_practica1_15401020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityImg1 : AppCompatActivity() {

    var atras: Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img1)

        atras = findViewById(R.id.atras)

        atras?.setOnClickListener {
            finish()
        }
    }
}
