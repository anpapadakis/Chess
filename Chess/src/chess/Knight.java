package chess;

import java.awt.Color;
import javax.swing.*;

/**
 * This is the class for the Knight pawn. Is used to calculate the possible
 * moves of the pawn.
 * 
 * @author Antonis Papadakis
 * @see <a href="https://en.wikipedia.org/wiki/Knight_(chess)">Wikipedia</a>
 *
 */
public class Knight {

	private JPanel pos;

	public Knight() {
		pos = new JPanel();
	}

	/**
	 * Calculates the possible moves of the Knight
	 * 
	 * @param name the char of the Knight pawn
	 * @param x    the x coordinate
	 * @param y    the y coordinate
	 * @param pa   the panel of the board
	 */
	public void moveKnight(String name, int x, int y, JPanel pa[][]) {

		if (y - 1 >= 0 && x + 2 < 8) {
			pos = pa[y - 1][x + 2];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (y - 2 >= 0 && x + 1 < 8) {
			pos = pa[y - 2][x + 1];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (y - 2 >= 0 && x - 1 >= 0) {
			pos = pa[y - 2][x - 1];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (y - 1 >= 0 && x - 2 >= 0) {
			pos = pa[y - 1][x - 2];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}

		}

		if (y + 1 < 8 && x - 2 >= 0) {
			pos = pa[y + 1][x - 2];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (y + 2 < 8 && x - 1 >= 0) {
			pos = pa[y + 2][x - 1];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (y + 2 < 8 && x + 1 < 8) {
			pos = pa[y + 2][x + 1];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}

		if (x + 2 < 8 && y + 1 < 8) {
			pos = pa[y + 1][x + 2];

			if (name.equals("WKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.white)) {
					pos.setBackground(Color.green);
				}
			} else if (name.equals("BKN")) {
				if (((JLabel) pos.getComponent(0)).getBackground() != (Color.black)) {
					pos.setBackground(Color.green);
				}
			}
		}
	}

}
