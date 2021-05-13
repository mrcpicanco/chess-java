package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) { //programação defensiva.
			throw new ChessException("Erro na posição do Xadrez. Valores válidos são de a1 a h8");
			
		}
		
		this.column = column;
		this.row = row;
	}


	public char getColumn() {
		return column;
	}

/* Não podemos deixar a coluna ser livremente alterada.
	public void setColumn(char column) {
		this.column = column;
	}

*/
	public int getRow() {
		return row;
	}

/* Não podemos deixar que a linha seja livremente alterada.
	public void setRow(int row) {
		this.row = row;
	}
	
*/	//Método para descobrir a posição na Matriz
	protected Position toPosition() {
		return new Position (8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}

}
