package th.ac.su.ict.amaraphon.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewColor = findViewById<TextView>(R.id.viewColor)

        var bt1 = findViewById<Button>(R.id.bt1)
        var bt2 = findViewById<Button>(R.id.bt2)
        var bt3 = findViewById<Button>(R.id.bt3)
        var bt4 = findViewById<Button>(R.id.bt4)
        var bt5 = findViewById<Button>(R.id.bt5)
        var bt6 = findViewById<Button>(R.id.bt6)

        bt1.setOnClickListener(){
            viewColor.setText("235-255-221")
            viewColor.setBackgroundColor(Color.parseColor("#ebe1dd"))
        }
        bt2.setOnClickListener(){
            viewColor.setText("236-203-202")
            viewColor.setBackgroundColor(Color.parseColor("#eccbca"))
        }
        bt3.setOnClickListener(){
            viewColor.setText("117-131-156")
            viewColor.setBackgroundColor(Color.parseColor("#75839c"))
        }
        bt4.setOnClickListener(){
            viewColor.setText("153-169-191")
            viewColor.setBackgroundColor(Color.parseColor("#99a9bf"))
        }
        bt5.setOnClickListener(){
            viewColor.setText("195-204-216")
            viewColor.setBackgroundColor(Color.parseColor("#c3ccd8"))
        }
        bt6.setOnClickListener(){
            viewColor.setText("221-226-269")
            viewColor.setBackgroundColor(Color.parseColor("#dee2e5"))
        }

    }
}
