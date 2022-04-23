package inc.calc.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvResult=findViewById<TextView>(R.id.tvResult)
        var tvInput=findViewById<TextView>(R.id.tvInput)

        var btn1=findViewById<Button>(R.id.btn1)
        var btn2=findViewById<Button>(R.id.btn2)
        var btn3=findViewById<Button>(R.id.btn3)
        var btn4=findViewById<Button>(R.id.btn4)
        var btn5=findViewById<Button>(R.id.btn5)
        var btn6=findViewById<Button>(R.id.btn6)
        var btn7=findViewById<Button>(R.id.btn7)
        var btn8=findViewById<Button>(R.id.btn8)
        var btn9=findViewById<Button>(R.id.btn9)
        var btn0=findViewById<Button>(R.id.btn0)

        var btnC=findViewById<Button>(R.id.btnC)
        var btnBack=findViewById<ImageButton>(R.id.btnBack)
        var btnOpenB=findViewById<Button>(R.id.btnOpenB)
        var btnCloseB=findViewById<Button>(R.id.btnCloseB)
        var btnDiv=findViewById<Button>(R.id.btndiv)
        var btnTimes=findViewById<Button>(R.id.btnTimes)
        var btnDot=findViewById<Button>(R.id.btnDot)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSub=findViewById<Button>(R.id.btnSub)
        var btnEqual=findViewById<Button>(R.id.btnEqual)

        btn1.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"1"
        }
        btn2.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"2"
        }
        btn3.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"3"
        }
        btn4.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"4"
        }
        btn5.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"5"
        }
        btn6.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"6"
        }
        btn7.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"7"
        }
        btn8.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"8"
        }
        btn9.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"9"
        }
        btn0.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"0"
        }
        btnAdd.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"+"
            btnDot.isClickable=true
        }
        btnSub.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"-"
            btnDot.isClickable=true
        }
        btnDiv.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"/"
            btnDot.isClickable=true
        }
        btnTimes.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"*"
            btnDot.isClickable=true
        }
        btnCloseB.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+")"
            btnDot.isClickable=true
        }
        btnOpenB.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"("
            btnDot.isClickable=true
        }
        btnDot.setOnClickListener {
            var data=tvInput.text.toString()
            if(data.length<=38)
                tvInput.text = data+"."
            btnDot.isClickable=false
        }
        btnBack.setOnClickListener{
            var data=tvInput.text.toString()
            tvInput.text=data.dropLast(1)
            btnDot.isClickable=true
        }
        btnC.setOnClickListener {
            var data= tvInput.text.toString()
            var r= tvResult.text.toString()
            tvInput.text=data.drop(data.length)
            tvResult.text=r.drop(r.length)
            btnDot.isClickable=true
        }
        btnEqual.setOnClickListener {
            try{
                val input= ExpressionBuilder(tvInput.text.toString()).build()
                val output=input.evaluate().toFloat()
                tvResult.text=output.toString()
            }catch (e:Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}