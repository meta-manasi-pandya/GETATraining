package main.pf.pf1;

/**
 * @author Manasi Pandya
 * @version 1.0
 * Assignment - 4
   A class to implement FCFS scheduler which returns a 2-D array containing wait time, start time
   finish time, etc.
 */
public class FCFS {
	/**
	 * A function to create a 2-D array and calculate its respective values. Waiting time is the
	 * duration between the job arrives and when it starts. Finish time is the entire duration
	 * from which the job starts and completes.
	 */
	public int [][]FCFSMethod( int arrivalTime[], int jobSize[] ) {
		int[][] result = new int[arrivalTime.length][5];
		int waitingTime = 0, startTime = 1, finishTime = jobSize[0], colCounter = 0;
		for(int rowCounter=0 ; rowCounter<arrivalTime.length ; rowCounter++) {
			colCounter = 0;
			if(startTime < arrivalTime[rowCounter]) {	//When scheduler is free but job has not arrived
				startTime = arrivalTime[rowCounter];
			}
			finishTime = startTime + jobSize[rowCounter] - 1;
			waitingTime = startTime - arrivalTime[rowCounter];
			
			/*Filling 2-D array 'result'*/ 
			
			result[rowCounter][colCounter++] = rowCounter+1;			//Job Number
			result[rowCounter][colCounter++] = arrivalTime[rowCounter];	//Job Arrival
			result[rowCounter][colCounter++] = waitingTime;				//Job Wait
			result[rowCounter][colCounter++] = startTime;				//Job Start
			result[rowCounter][colCounter++] = finishTime;				//Job Finish
			startTime = finishTime + 1;									//Start time for next job
		}
		
		return result;
	}
}
