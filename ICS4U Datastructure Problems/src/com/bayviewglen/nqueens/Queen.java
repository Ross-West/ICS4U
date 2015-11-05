package com.bayviewglen.nqueens;

public class Queen {
	private int row;
	private int col;
	
	public Queen() {
	row = 0;
	col = 0;
	}
	
	public Queen(int row,int col) {
	row = this.row;
	col = this.col;
	}	
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}
	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}
	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}
	/**
	 * @param col the col to set
	 */
	public void setCol(int col) {
		this.col = col;
	}
}
