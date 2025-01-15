package hu.ait.tictactoe.model

import android.util.Log

object TicTacToeModel {
    const val EMPTY: Short = 0
    const val CIRCLE: Short = 1
    const val CROSS: Short = 2

    private var nextPlayer = CIRCLE
    private val model = arrayOf(
        shortArrayOf(EMPTY, EMPTY, EMPTY),
        shortArrayOf(EMPTY, EMPTY, EMPTY),
        shortArrayOf(EMPTY, EMPTY, EMPTY))
    fun resetModel() {
        for (i in 0..2) {
            for (j in 0..2) {
                model[i][j] = EMPTY
            }
        }
        nextPlayer = CIRCLE
    }
    fun getFieldContent(x: Int, y: Int) = model[x][y]
    fun setFieldContent(x: Int, y: Int, content: Short) { model[x][y] = content }
    fun getNextPlayer() = nextPlayer
    fun changeNextPlayer() { nextPlayer = if (nextPlayer == CIRCLE) CROSS else CIRCLE }
    fun getWinner() : Short {
        val rowOne: ShortArray  = model[0]
        val rowTwo: ShortArray = model[1]
        val rowThr: ShortArray  = model[2]
        val colOne = shortArrayOf(model[0][0], model[1][0], model[2][0])
        val colTwo = shortArrayOf(model[0][1], model[1][1], model[2][1])
        val colThr = shortArrayOf(model[0][2], model[1][2], model[2][2])
        val diaOne = shortArrayOf(model[0][0], model[1][1], model[2][2])
        val diaTwo = shortArrayOf(model[0][2], model[1][1], model[2][0])
        val winConfigs = listOf(rowOne, rowTwo, rowThr, colOne, colTwo, colThr, diaOne, diaTwo)

        var gameDone = true
        for (win in winConfigs) {
            val isGameWon = (win[0] == win[1]) && (win[2] == win[1] && win[0] != EMPTY)
            if (isGameWon) {
                Log.d("TAG_GAME_WON", "Game is won" )
                return win[0]
            }
            if ((win[0] == EMPTY) || (win[1] == EMPTY) || (win[2] == EMPTY)) {
                gameDone = false
            }
        }
        if (gameDone) {
            Log.d("TAG_GAME_DONE", "Game is done" )
            return EMPTY
        }
        return -1
    }
}