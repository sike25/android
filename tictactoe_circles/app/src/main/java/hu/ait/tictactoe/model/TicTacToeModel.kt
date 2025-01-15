package hu.ait.tictactoe.model

/**
 * This class exists because we want to (and ought to) separate the design of the view
 * from its logic.
 * It is a singleton, so if we change the orientation of the screen, it persists
 * Can control+V images into drawable
 */

object TicTacToeModel {
    public val EMPTY: Short = 0
    public val CIRCLE: Short = 1
    public val CROSS: Short = 2

    private var nextPlayer = CIRCLE.toShort()
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
        return EMPTY
    }
}