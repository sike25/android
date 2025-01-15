package hu.ait.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import hu.ait.tictactoe.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClear.setOnClickListener {
            binding.ticTacToeView.resetGame()
        }
    }

    fun showMessage(msg: String) {
        Snackbar.make(binding.root, msg, Snackbar.LENGTH_LONG).show()
    }

    fun startXTimer(){
        binding.xChronometer.start()
    }

    fun startOTimer(){
        binding.oChronometer.start()
    }
    fun stopXTimer(){
        binding.xChronometer.stop()
    }

    fun stopOTimer(){
        binding.oChronometer.stop()

    }




}