package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Board extends JPanel{

    /*
    board size:
        cell size:
        rows:
        columns:
        height:
        width:

    cell:
        numbers: 1 - 8, # of mines in the neighboring cells(3 x 3 grid)
        mines: 9
        covered cell:
        marked cell
        covered mines
        covered marked mines



    int[] board = new int[]
    mine count:
    mine left:
    Image[] img
    Boolean inGame
 */

    //board size
    private final int cellSize = 15;
    private final int rows = 16;
    private final int cols = 15;
    private final int height = rows * cellSize + 1;
    private final int width = cols * cellSize + 1;

    //cell
    private final int mine = 9;
    private final int covered = 10;
    private final int marked = 10;
    private final int empty = 0;
    private final int coveredMine = mine + covered;
    private final int coveredMarked = coveredMine + marked;

    private final int images = 13;
    private int[] board;
    private int mineCount;
    private Image[] img;
    private Boolean inGame;
    private int allCells;

    //import image
    //new game
    //paintComponenet
    //mouseListener
    //findEmptyCell
    private void imageImport() {

    }

    private void newGame() {

    }

    @Override
    private void paintComponent(Graphics g) {

    }

    private void mouseListener() {

    }

    private void findEmptyCell(int x) {


    }

}
