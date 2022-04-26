package game_1;

import java.util.ArrayList;

public class Tablero {

	private char[][] table;
	private int largo, ancho;
	private ArrayList<Monstruo> monstruos = new ArrayList<Monstruo>();
	byte x, y;
	private int orden = 0;

	public Tablero(int largo, int ancho) {

		this.ancho = ancho;
		this.largo = largo;
		table = new char[largo][ancho];
		fillBoard();
	}

	public int getLargo() {
		return this.largo;
	}

	public int getAncho() {

		return this.ancho;
	}

	public ArrayList<Monstruo> getListMonsters() {
		return this.monstruos;
	}

	public void drawTable() {

		byte k = 1;
		while (k < getAncho() *3/6) {
			System.out.print("-");
			k++;
		}
		System.out.println();

		for (int i = 0; i < getLargo() - 1; i++) {

			for (int j = 0; j < getAncho() - 1; j++) {

				System.out.print("|" + table[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while (k < getAncho() * 3) {
			System.out.print("-");
			k++;
		}

	}

	private void fillBoard() {

		for (int i = 0; i < getLargo() - 1; i++) {

			for (int j = 0; j < getAncho() - 1; j++) {

				table[i][j] = (char) '*';
			}
		}

	}

	public void addMonTable(Monstruo ms) {

		boolean save = false;
		do {

			x = (byte) (Math.random() * ancho - 1);
			y = (byte) (Math.random() * largo - 1);

			if (table[y][x] == '*') {

				table[y][x] = ms.getnameI();
				monstruos.add(ms);
				ms.setOrden(orden);
				orden++;
				save = true;
				ms.setX(x);
				ms.setY(y);
			}

		} while (!save);

	}

	private boolean checkSpace(int y, int x) {

		boolean empty = false;
		try {
			if (table[y][x] == '*')
				empty = true;
		} catch (ArrayIndexOutOfBoundsException e) {
			if (y > largo - 1) {
				if (table[largo - 1][x] == '*')
					empty = true;

			} else if (y < 0) {
				if (table[0][x] == '*')
					empty = true;

			} else if (x > ancho - 1) {
				if (table[y][ancho - 1] == '*')
					empty = true;

			} else {
				if (table[y][0] == '*')
					empty = true;
			}
		}
		return empty;
	}

	public void moveMonstersRand() {

		for (Monstruo m : monstruos) {

			boolean repetir = true;
			int direccion;
			int distancia;

			// 0:up 1:down 2:right 3:left
			while (repetir) {

				direccion = (int) (Math.random() * 4);
				distancia = (int) (Math.random() * m.getMaxMovement()) + 1;

				// System.out.println("direccion: " + direccion + " distancia: " + distancia);
				switch (direccion) {
				case 0: {
					if (checkSpace(m.gety() - distancia, m.getX())) {

						if (m.gety() - distancia > 0) {
							table[m.gety()][m.getX()] = '*';
							table[m.gety() - distancia][m.getX()] = m.getnameI();
							m.setY(m.gety() - distancia);
							repetir = false;
						} else {
							table[m.gety()][m.getX()] = '*';
							table[0][m.getX()] = m.getnameI();
							m.setY(0);
							repetir = false;
						}
					}
					break;
				}
				case 1: {
					// System.out.println("entering case 1");
					if (checkSpace(m.gety() + distancia, m.getX())) {

						if (m.gety() + distancia < largo - 1) {
							table[m.gety()][m.getX()] = '*';
							table[m.gety() + distancia][m.getX()] = m.getnameI();
							m.setY(m.gety() + distancia);
							repetir = false;
						} else {
							table[m.gety()][m.getX()] = '*';
							table[largo - 1][m.getX()] = m.getnameI();
							m.setY(largo - 1);
							repetir = false;
						}
					}
					break;
				}
				case 2: {
					// System.out.println("entering case 2");

					if (checkSpace(m.gety(), m.getX() + distancia)) {

						if (m.getX() + distancia < ancho - 1) {
							table[m.gety()][m.getX()] = '*';
							table[m.gety()][m.getX() + distancia] = m.getnameI();
							m.setX(m.getX() + distancia);
							repetir = false;
						} else {
							table[m.gety()][m.getX()] = '*';
							table[m.gety()][ancho - 1] = m.getnameI();
							m.setX(ancho - 1);
							repetir = false;
						}
					}
					break;
				}
				case 3: {
					// System.out.println("entering case 3");

					if (checkSpace(m.gety(), m.getX() - distancia)) {

						if (m.getX() - distancia > 0) {
							table[m.gety()][m.getX()] = '*';
							table[m.gety()][m.getX() - distancia] = m.getnameI();
							m.setX(m.getX() - distancia);
							repetir = false;
						} else {
							table[m.gety()][m.getX()] = '*';
							table[m.gety()][0] = m.getnameI();
							m.setX(0);
							repetir = false;
						}
					}
					break;
				}
				}
			} // END OF WHILE LOOP
		}

	}

}
