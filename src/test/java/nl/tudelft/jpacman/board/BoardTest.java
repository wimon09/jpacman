package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void validBoardShouldNotThrow() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();

        // Should not throw, since every square is non-null
        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }

    @Test
    void invalidBoardShouldThrow() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;   // <-- invalid: one null square

        Board board = new Board(grid);          // <-- fails right here
        board.squareAt(0, 0);                   // never actually reached
    }
}
