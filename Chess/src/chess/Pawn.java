package chess;

import java.awt.Color;
import javax.swing.*;

/**
 * This is the class for the Pawn. Is used to calculate the possible moves of
 * the pawn.
 * 
 * @author Antonis Papadakis
 * @see <a href="https://en.wikipedia.org/wiki/Pawn_(chess)">Wikipedia</a>
 *
 */
public class Pawn {

	private JPanel pos;
	private int k = 0;

	public Pawn() {
		pos = new JPanel();
	}

	/**
	 * Calculates the possible moves of the Pawn
	 * 
	 * @param name the char of the Pawn
	 * @param x    the x coordinate
	 * @param y    the y coordinate
	 * @param pa   the panel of the board
	 */
	public void movePawn(String name, int x, int y, JPanel pa[][]) {

		if (name.equals("BP")) {

			if (y + 1 < 8 && x + 1 < 8) {
				pos = pa[y + 1][x + 1];

				if (pos.getComponent(0).getBackground().equals(Color.white)) {
					pos.setBackground(Color.green);
				}
			}

			if (y + 1 < 8 && x - 1 >= 0) {
				pos = pa[y + 1][x - 1];

				if (pos.getComponent(0).getBackground().equals(Color.white)) {
					pos.setBackground(Color.green);
				}
			}

			if (pa[y][x] == pa[1][x]) {
				pos = pa[y + 1][x];

				if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
					pos.setBackground(Color.green);
				} else {
					k = 1;
				}

				if (k == 0) {
					pos = pa[y + 2][x];

					if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
						pos.setBackground(Color.green);
					}
				}

			} else {

				if (y + 1 < 8) {
					pos = pa[y + 1][x];

					if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
						pos.setBackground(Color.green);
					}
				}

			}

		} else if (name.equals("WP")) {

			if (y - 1 >= 0 && x + 1 < 8) {
				pos = pa[y - 1][x + 1];

				if (pos.getComponent(0).getBackground().equals(Color.black)) {
					pos.setBackground(Color.green);
				}
			}

			if (y - 1 >= 0 && x - 1 >= 0) {
				pos = pa[y - 1][x - 1];

				if (pos.getComponent(0).getBackground().equals(Color.black)) {
					pos.setBackground(Color.green);
				}
			}

			if (pa[y][x] == pa[6][x]) {
				pos = pa[y - 1][x];

				if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
					pos.setBackground(Color.green);
				} else {
					k = 1;
				}

				if (k == 0) {
					pos = pa[y - 2][x];

					if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
						pos.setBackground(Color.green);
					}
				}

			} else {

				if (k == 0) {
					if (y - 1 >= 0) {
						pos = pa[y - 1][x];

						if (((JLabel) pos.getComponent(0)).getBackground().equals(Color.yellow)) {
							pos.setBackground(Color.green);
						}
					}
				}
			}
		}
	}

}
