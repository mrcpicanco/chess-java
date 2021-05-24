package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	//método get do moveCount
	public int getMoveCount() {
		return moveCount;
	}
	
	
	//métodos para incremento e decremento
	public void increaseMoveCount() {
		moveCount++;
		
	}
	
	public void decreaseMoveCount() {
		moveCount--;
		
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
		
	}
	
	//Método para retornar uma posição no formato do xadrez

		
	//O set será eliminado para que a cor da peça não seja modificada.
	
	/* 
	public void setColor(Color color) {
		this.color = color;
	}
	*/
	
	protected boolean isTheOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
		 
	}

}
