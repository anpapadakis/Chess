package chess;

import java.awt.Color;
import javax.swing.*;

/**
 * This is the class for the King pawn. Is used to calculate the possible moves
 * of the pawn.
 * 
 * @author Antonis Papadakis
 * @see <a href="https://en.wikipedia.org/wiki/King_(chess)">Wikipedia</a>
 *
 */
public class King {

	private JPanel pos;

	public King() {
		pos = new JPanel();
	}

	/**
	 * Calculates the possible moves of the King
	 * 
	 * @param name the char of the King pawn
	 * @param x    the x coordinate
	 * @param y    the y coordinate
	 * @param pa   the panel of the board
	 */
	public void moveKing(String name, int x, int y, JPanel pa[][]) {

		if (x + 1 < 8 && y + 1 < 8) {
			pos = pa[y + 1][x + 1];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}

		}

		if (y + 1 < 8) {
			pos = pa[y + 1][x];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (y + 1 < 8 && x - 1 >= 0) {
			pos = pa[y + 1][x - 1];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (x + 1 < 8) {
			pos = pa[y][x + 1];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (x - 1 >= 0) {
			pos = pa[y][x - 1];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (x + 1 < 8 && y - 1 >= 0) {
			pos = pa[y - 1][x + 1];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (x - 1 >= 0 && y - 1 >= 0) {
			pos = pa[y - 1][x - 1];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}

		}

		if (y - 1 >= 0) {
			pos = pa[y - 1][x];

			if (name.equals("WK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BK")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}
	}

}
