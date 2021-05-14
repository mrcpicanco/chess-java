package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //mesmo não colando nada aqui, o java atribui null por padrão.
		
	}


	protected Board getBoard() { //Somente classes do mesmo pacote e subclasses é que poderão acessar o tabuleiro de uma peça;
		return board;
	}
	
	
	//Operçaão de movimentos possíveis que depende de um método abstrato
	
	public abstract boolean [][] possibleMoves();
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
		
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	

	/* - O método set é retirado para que o tabuleiro não seja alterado.
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
	
	
	

}
