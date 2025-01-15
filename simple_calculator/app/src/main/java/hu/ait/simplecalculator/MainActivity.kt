package hu.ait.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import hu.ait.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addButton.setOnClickListener {
            calculateValue(Int::plus)
        }
        binding.subtractButton.setOnClickListener {
           // The minus class is implemented in the Int class
           calculateValue(Int::minus)
            // If I wanted to use a custom function
            // calculateValue(::myCalc)
        }
    }

    private fun calculateValue(op: (Int, Int) -> Int) {
        val firstNumber = binding.firstNumber.text
        val secondNumber = binding.secondNumber.text
        // Try catch blocks are pivotal because users really hate it when your app crashes
        try {
            binding.resultView.text = getString(R.string.default_result_text)
            if (firstNumber.isEmpty() or secondNumber.isEmpty()) {
                Toast.makeText(this, "Fill in both inputs", Toast.LENGTH_LONG).show()
                // See? We do not even need a toast!
                binding.resultView.error = "This field can not be empty"
            } else {
                val sum = op(firstNumber.toString().toInt(), secondNumber.toString().toInt())
                binding.resultView.text =
                    binding.resultView.text.toString() + "" + sum.toString()
            }
        } catch (e: Exception) {
            binding.resultView.text = "Error: ${e.message}"
        }
    }
}

/**
 * DRY don't repeat yourself
 * The minus and plus buttons repeat code, not good SWE 
 * To extract a code block into its own function
 * Ctrl + Alt + M
 * To make the extracted function do add or minus, we pass in functions as parameres
 */