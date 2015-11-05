package com.bayviewglen.multidimensionarrays;

import java.util.Scanner;

public class GPSProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number of points: ");
		int nPoints = s.nextInt(); //YOU BETTER GIVE ME THE RIGHT INPUT
		System.out.print("Enter " + nPoints + " points: ");
		//Honestly it's much more efficient to create a point class with x and y properties
		//But I'm trying to demonstrate use of arrays so not this time
		double[][] points = new double[nPoints][2]; //Ummmmm
		double minDistance = Integer.MAX_VALUE;
		double minDistanceX1 = 0; //used later
		double minDistanceX2 = 0;
		double minDistanceY1 = 0;
		double minDistanceY2 = 0;
		for(int i = 0; i<nPoints; i++){
			points[i][0]=s.nextDouble();
			points[i][1]=s.nextDouble();
		}
		for(int i = 0; i<nPoints; i++){
			for(int j = i+1; j<nPoints-1; j++){ //Avoids testing pairs we already used, 
											//since the distance between point a and b 
											//is the same as between point b and a
				double deltaX = points[i][0] - points[j][0];
				double deltaY = points[i][0] - points[j][0];
				double distance = Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
				if(distance<minDistance) {
					minDistance = distance;
					minDistanceX1 = points[i][0];
					minDistanceY1 = points[i][1];
					minDistanceX2 = points[j][0];
					minDistanceY2 = points[j][1];
				}
			}
		}
		System.out.print("The closest two points are: (" + minDistanceX1 + "," + minDistanceY1 + ") and (" + minDistanceX2 + "," + minDistanceY2 + ").");
		s.close();
	}

}
