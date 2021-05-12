package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //mesmo não colando nada aqui, o java atribui null por padrão.
		
	}


	protected Board getBoard() { //Somente classes do mesmo pacote e subclasses é que poderão acessar o tabuleiro de uma peça;
		return board;
	}

	/* - O método set é retirado para que o tabuleiro não seja alterado.
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
	
	
	

}
