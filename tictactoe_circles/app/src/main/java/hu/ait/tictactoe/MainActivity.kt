package hu.ait.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.ait.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClear.setOnClickListener {
            binding.ticTacToeView.resetGame()
        }
    }

    public fun showMessage(msg: String) {
        // show a Toas.. or Snackbar..
    }

    public fun isFlagModeOn() : Boolean {
        return true
        // binding.cbFlag.isChecked
    }
}

/**
 * We added the shimmer to the gradle scripts (Module:app) in the dependencies
 * Then created an xml object for it, in which we embedded the text
 * For more: github.com/wasabeef/awesome-android-ui/
 *
 *
 */