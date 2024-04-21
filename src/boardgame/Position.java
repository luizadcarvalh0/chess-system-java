package boardgame;

public class Position {

	private int row; //encapsulamento
	private int column;
	
	//construtores
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() { //ToString - a classe object é a super classe
		return row + ", " + column;
	}
	
}

