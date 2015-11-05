package com.bayviewglen.nqueens;

import java.util.Scanner;
import java.util.Stack;

public class NQueens {
	static Stack<Queen> queenStack = new Stack<Queen>();
	
	public static void displayBoard(){

	}
	
	public static boolean conflict(Queen q1, Stack<Queen> queenStack){
		Stack<Queen> tempStack = new Stack<Queen>();
		while(!queenStack.isEmpty()){
		Queen q2 = queenStack.pop();
		tempStack.add(q2);
		if (conflictCheck(q1,q2))
			return true;
		}
		return false;
	}
	
	public static boolean conflictCheck(Queen q1, Queen q2){
		int DeltaY = q1.getCol()-q2.getCol();
		int DeltaX = q1.getRow()-q2.getRow();
		if(q1.getRow() == q2.getRow()) {
			return true;
		} else if(q1.getCol() == q2.getCol()) {
			return true;
		} else if(Math.abs(DeltaY/(double)DeltaX)==1) {
			return true;
		} else {
		return false;
		}
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter integer 'n', for 'n' queens and an n*n board: ");
		int N = s.nextInt();
		int filled = 0;
		Queen Q = new Queen();
		
		/*
		 * OK, SO FOR SOME REASON
		 * THE FIRST LOOP {while((filled!=N || [Other Stuff])}
		 * IS NOT ACTUALLY WORKING
		 * I SWEAR I DID EVERYTHING RIGHT
		 * I EVEN USED THE ECLIPSE DEBUGGER
		 * THE LOOP IS JUST DEFYING LOGIC
		 * BECAUSE NGAHHH I HATE MY LIFE
		 * (Currently, at least on my Eclipse, the loop runs indefinitely,
		 * despite being perfectly well defined. WELL OKAY THEN)
		 * So if this doesn't work that's what's exploding
		 */
		while((filled!=N) || (Q.getCol()!=N-1 && Q.getRow()!=N-1)){
			if(!conflict(Q,queenStack)) {
				queenStack.push(Q);
				filled++;
			} else if (conflict(Q,queenStack) && Q.getCol()!=N-1)
				Q.setCol(Q.getCol() + 1);
			else if (conflict(Q,queenStack)) {
				Q = queenStack.pop();
				filled--;
			}
		}
		if(filled!=N){
		System.out.println("There is no solution.");
		} else {
		System.out.println("Solution is:");
		while(queenStack.isEmpty()){
			{
			System.out.println();
				Queen temp = queenStack.pop();
				for(int i=0; i<temp.getCol(); i++) {
					System.out.print(".");
				} System.out.print("Q");
				for(int i=temp.getCol(); i<N; i++) {
					System.out.print(".");
				}
			}
		}
		s.close();
	}
}
}
