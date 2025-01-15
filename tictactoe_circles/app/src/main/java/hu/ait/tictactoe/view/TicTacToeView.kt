package hu.ait.tictactoe.view

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import hu.ait.tictactoe.MainActivity
import hu.ait.tictactoe.R
import hu.ait.tictactoe.model.TicTacToeModel

/**
 * We used "new package" to create the view folder
 * Settings button above our class >> Tree Appearance >> Compact Middle Packages
 * Alt+Enter to automatically add constructor
 * Build > Clean Project to reset stuff
 * Text has a default padding on top, of different sizes (to accomodate for accents)
 * Contact Ekler for fix
 *
 * We can use drawble/images, color hashes for background by adding to Linear Layout elements
 */
class TicTacToeView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    lateinit var paintBackground: Paint
    lateinit var paintLine: Paint
    lateinit var paintText: Paint

    var bitmapBackground = BitmapFactory.decodeResource(resources, R.drawable.img)

    init {
        paintBackground = Paint()
        paintBackground.setColor(Color.BLACK)
        paintBackground.style = Paint.Style.FILL

        paintLine = Paint()
        paintLine.setColor(Color.WHITE)
        paintLine.style = Paint.Style.STROKE
        paintLine.strokeWidth = 5f

        paintText = Paint()
        paintText.textSize = 100f
        paintText.setColor(Color.GREEN)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        // we init the text size here not in init{}
        // because the height of the block is 0 at that point
        paintText.textSize = height/3f
        // to make the image fit within the view
        bitmapBackground = Bitmap.createScaledBitmap(bitmapBackground, width/3, height/3, false)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // elements are drawn in the order we write them
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paintBackground)
        canvas.drawBitmap(bitmapBackground, width/3f, height/3f, null)
        drawGameArea(canvas)
        drawPlayers(canvas)

        // the xy coordinates in draw Text is the bottom of the text
        // it is usually the top for other elements
        canvas.drawText("3", 0f, 120f, paintText)
    }

    private fun drawPlayers(canvas: Canvas) {
        for (i in 0..2) {
            for (j in 0..2) {
                if (TicTacToeModel.getFieldContent(i, j) == TicTacToeModel.CIRCLE) {
//                    val centerX = (i * width / 3 + width / 6).toFloat()
//                    val centerY = (j * height / 3 + height / 6).toFloat()
//                    val radius = height / 6 - 2
//                    canvas.drawCircle(centerX, centerY, radius.toFloat(), paintLine)

                    // can use bitmap instead of circles, so cats vs crosses
                    canvas.drawBitmap(bitmapBackground, (i * width / 3).toFloat(),
                        (j * height / 3).toFloat(), null)
                }
                else if (TicTacToeModel.getFieldContent(i, j) == TicTacToeModel.CROSS) {
                    canvas.drawLine((i * width / 3).toFloat(), (j * height / 3).toFloat(),
                        ((i + 1) * width / 3).toFloat(),
                        ((j + 1) * height / 3).toFloat(), paintLine)
                    canvas.drawLine(((i + 1) * width / 3).toFloat(), (j * height / 3).toFloat(),
                        (i * width / 3).toFloat(), ((j + 1) * height / 3).toFloat(), paintLine)
                }
            }
        }
    }

    private fun drawGameArea(canvas: Canvas) {
        // border
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paintLine)
        // two horizontal lines
        canvas.drawLine(0f, (height / 3).toFloat(), width.toFloat(), (height / 3).toFloat(), paintLine)
        canvas.drawLine(0f, (2 * height / 3).toFloat(), width.toFloat(), (2 * height / 3).toFloat(), paintLine)
        // two vertical lines
        canvas.drawLine((width / 3).toFloat(), 0f, (width / 3).toFloat(), height.toFloat(), paintLine)
        canvas.drawLine((2 * width / 3).toFloat(), 0f, (2 * width / 3).toFloat(), height.toFloat(), paintLine)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // ACTION_MOVE lets us drag the circle around the screen
        if (event.action == MotionEvent.ACTION_DOWN) {
            // the coordinates in this view where the user clicked
            val tX = event.x.toInt() / (width / 3)
            val tY = event.y.toInt() / (height / 3)

            if ((context as MainActivity).isFlagModeOn()) {
                // place flag
            }else {
                // try field
            }

            if (tX < 3 && tY < 3 && TicTacToeModel.getFieldContent(tX, tY) == TicTacToeModel.EMPTY) {
                TicTacToeModel.setFieldContent(tX, tY, TicTacToeModel.getNextPlayer())
                TicTacToeModel.changeNextPlayer()

                // if (TicTacToeModel.getWinner() == TicTacToeModel.CROSS) {
                //  // show win, access main activity, getContext, context as MainActivity (casting)
                //  (context as MainActivity).showMessage("cross won")
                // }

                var nextPlayer = "0"
                if (TicTacToeModel.getNextPlayer() == TicTacToeModel.CROSS) {
                    nextPlayer = "X"
                }

                // to tell the system it needs to redraw the view when it can
                invalidate()
            }
        }
        return true
    }

    fun resetGame() {
        TicTacToeModel.resetModel()
        invalidate()
    }

}