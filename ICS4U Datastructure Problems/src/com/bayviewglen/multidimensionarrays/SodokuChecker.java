package com.bayviewglen.multidimensionarrays;

import java.util.Scanner;

public class SodokuChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] row1 = new int[9]; //I should feel terrible for doing this
		int[] row2 = new int[9];
		int[] row3 = new int[9];
		int[] row4 = new int[9];
		int[] row5 = new int[9];
		int[] row6 = new int[9];
		int[] row7 = new int[9];
		int[] row8 = new int[9];
		int[] row9 = new int[9];
		System.out.println("Enter a Sodoku Puzzle solution: ");
		for(int i=0; i<9; i++){
			row1[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row2[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row3[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row4[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row5[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row6[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row7[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row8[i]=s.nextInt();
		}
		for(int i=0; i<9; i++){
			row9[i]=s.nextInt();
		}
		int[][] solution = new int[9][9];
		solution[0] = row1; //Arrays of arrays
		solution[1] = row2; //I feel terrible
		solution[2] = row3; //Except I don't
		solution[3] = row4;
		solution[4] = row5;
		solution[5] = row6;
		solution[6] = row7;
		solution[7] = row8;
		solution[8] = row9;

		//NOW COMES THE FUN PART
		int[] square1 = {solution[0][0],solution[0][1],solution[0][2],solution[1][0],solution[1][1],solution[1][2],solution[2][0],solution[2][1],solution[2][2]};
		int[] square2 = {solution[0][3],solution[0][4],solution[0][5],solution[1][3],solution[1][4],solution[1][5],solution[2][3],solution[2][4],solution[2][5]};
		int[] square3 = {solution[0][6],solution[0][7],solution[0][8],solution[1][6],solution[1][7],solution[1][8],solution[2][6],solution[2][7],solution[2][8]};
		int[] square4 = {solution[3][0],solution[3][1],solution[3][2],solution[4][0],solution[4][1],solution[4][2],solution[5][0],solution[5][1],solution[5][2]};
		int[] square5 = {solution[3][3],solution[3][4],solution[3][5],solution[4][3],solution[4][4],solution[4][5],solution[5][3],solution[5][4],solution[5][5]};
		int[] square6 = {solution[3][6],solution[3][7],solution[3][8],solution[4][6],solution[4][7],solution[4][8],solution[5][6],solution[5][7],solution[5][8]};
		int[] square7 = {solution[6][0],solution[6][1],solution[6][2],solution[7][0],solution[7][1],solution[7][2],solution[8][0],solution[8][1],solution[8][2]};
		int[] square8 = {solution[6][3],solution[6][4],solution[6][5],solution[7][3],solution[7][4],solution[7][5],solution[8][3],solution[8][4],solution[8][5]};
		int[] square9 = {solution[6][6],solution[6][7],solution[6][8],solution[7][6],solution[7][7],solution[7][8],solution[8][6],solution[8][7],solution[8][8]};
		int[][] squareList = {square1,square2,square3,square4,square5,square6,square7,square8,square9};
		//I feel dirty for doing that
		//Time for less dirty part
		boolean isValid = true;
		int count = 0;
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				count = 0; //Resets count to zero for each iteration						
				for(int k=0; k<9; k++){
					if(solution[i][j]==solution[i][k]){
						count++;
						if(count>1){ //If there's more than one duplicate between j and k
							isValid = false; //ALRIGHT THAT'S ROWS
						} //TIME FOR COLUMNS
					}
				}
			}
		}
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				count = 0; //Resets count to zero for each iteration						
				for(int k=0; k<9; k++){
					if(solution[j][i]==solution[k][i]){
						count++;
						if(count>1){ //If there's more than one duplicate between j and k
							isValid = false; //ALRIGHT THAT'S COLUMNS
						} //TIME FOR SQUARES
					}
				}
			}
		}
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				count = 0; //Resets count to zero for each iteration						
				for(int k=0; k<9; k++){
					if(squareList[i][j]==squareList[i][k]){
						count++;
						if(count>1){ //If there's more than one duplicate between j and k
							isValid = false; //ALRIGHT THAT'S SQUARES
						} //WE'RE DONE
					}
				}
			}
		}
	if(isValid){
		System.out.println("Valid Solution");
	} else {
		System.out.println("Solution Invalid");
	}
	s.close();
}

}