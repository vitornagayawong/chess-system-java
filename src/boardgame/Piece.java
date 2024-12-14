package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;		
	}

	//SOMENTE CLASSES DENTRO DO MESMO PACOTE E SUBCLASSES É QUE VAO PODER ACESSAR O TABULEIRO DE UMA PEÇA
	protected Board getBoard() {
		return board;
	}

	/* NAO PODE PERMITIR QUE O TABULEIRO SEJA ALTERADO
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
	
}
