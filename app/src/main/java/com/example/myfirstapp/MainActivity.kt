package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var points_A:Int=0
        var points_B:Int=0
        val pointsTeam_A :TextView=findViewById<TextView>(R.id.pointsA)
        val pointsTeam_B :TextView=findViewById<TextView>(R.id.pointsB)

        val buttonA_add3Points:Button =findViewById<Button>(R.id.add3Points_A)
        buttonA_add3Points.setOnClickListener{
            points_A+=3
            pointsTeam_A.setText(points_A.toString())
        }
        val buttonB_add3Points:Button =findViewById<Button>(R.id.add3Points_B)
        buttonB_add3Points.setOnClickListener{
            points_B+=3
            pointsTeam_B.setText(points_B.toString())
        }

        val buttonA_add2Points:Button =findViewById<Button>(R.id.add2Points_A)
        buttonA_add2Points.setOnClickListener{
            points_A+=2
            pointsTeam_A.setText(points_A.toString())
        }
        val buttonB_add2Points:Button =findViewById<Button>(R.id.add2Points_B)
        buttonB_add2Points.setOnClickListener{
            points_B+=2
            pointsTeam_B.setText(points_B.toString())
        }
        val buttonA_Throw:Button =findViewById<Button>(R.id.throw_A)
        buttonA_Throw.setOnClickListener{
            points_A++
            pointsTeam_A.setText(points_A.toString())
        }
        val buttonB_Throw:Button =findViewById<Button>(R.id.throw_B)
        buttonB_Throw.setOnClickListener{
            points_B++
            pointsTeam_B.setText(points_B.toString())
        }

          val button_Reset: Button =findViewById<Button>(R.id.Reset)
        button_Reset.setOnClickListener{
            points_A=0
            points_B=0
            pointsTeam_A.setText(points_A.toString())
            pointsTeam_B.setText(points_B.toString())
        }






    }

    override fun onClick(p0: View?) {

    }
}