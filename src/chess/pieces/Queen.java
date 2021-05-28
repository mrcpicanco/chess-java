package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Q";
		
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		//verificação acima
		
		p.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//verificação para a esquerda
		
				p.setValues(position.getRow(), position.getColumn() - 1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
					mat[p.getRow()][p.getColumn()] = true;
					p.setColumn(p.getColumn() - 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					
				}
				//verificação para a direita
				
				p.setValues(position.getRow(), position.getColumn() + 1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
					mat[p.getRow()][p.getColumn()] = true;
					p.setColumn(p.getColumn() + 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					
				}
				
				//verificação abaixo
				
				p.setValues(position.getRow() + 1, position.getColumn());
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
					mat[p.getRow()][p.getColumn()] = true;
					p.setRow(p.getRow() + 1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					
				}	
				//Lógica das diagonais
				
				//verificação Noroeste - NW
				
				p.setValues(position.getRow() - 1, position.getColumn() -1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
					mat[p.getRow()][p.getColumn()] = true;
					p.setValues(p.getRow() -1, p.getColumn() -1);
				}
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
					
				}
				
				//verificação Nordeste - NE
				
						p.setValues(position.getRow() -1 , position.getColumn() + 1);
						while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
							mat[p.getRow()][p.getColumn()] = true;
							p.setValues(p.getRow() -1, p.getColumn() +1);
						}
						if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
							mat[p.getRow()][p.getColumn()] = true;
							
						}
						//verificação Sudeste - SE
						
						p.setValues(position.getRow() +1, position.getColumn() + 1);
						while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
							mat[p.getRow()][p.getColumn()] = true;
							p.setValues(p.getRow() +1, p.getColumn() + 1);
						}
						if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
							mat[p.getRow()][p.getColumn()] = true;
							
						}
						
						//verificação Sudoeste - SW
						
						p.setValues(position.getRow() + 1, position.getColumn() -1);
						while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
							mat[p.getRow()][p.getColumn()] = true;
							p.setValues(p.getRow() + 1, p.getColumn() -1);
						}
						if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
							mat[p.getRow()][p.getColumn()] = true;
							
						}	
				
				
		
		return mat;

		}
}
