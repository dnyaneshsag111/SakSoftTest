package org.acumos.cds;

public class TestAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hights= {9,10};
		int result=TestAssignment.totalNumberOfJumps(5, 1, 2, hights);
		System.out.println(result);
	}

	public static int totalNumberOfJumps(int climbUp, int climbDown, int noOfWalls, int[] wallhights) {
		
		int total = 0;
		for(int i=0; i<noOfWalls;i++) {
			int currWall = wallhights[i];
			int currClimb = climbUp;
			while(currClimb < currWall) {
				currClimb = currClimb - climbDown;
				total++;
				currClimb = currClimb + climbUp;
			}
			total++;
			
		}
		
		return total;
	}
}
