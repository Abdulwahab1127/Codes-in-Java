import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.lang.Runnable;

public class FA21_BSE_111 {
    public static void main(String args[]) {
		int MatrixSize = 0;
		int[][] MatrixArray = new int[0][0];
		int[][] SquaredMatrixArray = new int[0][0];
		
		try {
			File myObj = new File(args[0]);
			Scanner myReader = new Scanner(myObj);
			MatrixSize = Integer.parseInt(myReader.nextLine());
			MatrixArray = new int[MatrixSize][MatrixSize];
			SquaredMatrixArray = new int[MatrixSize][MatrixSize];
			
			int Row = 0;
			while (myReader.hasNextLine()) {
				int Column = 0;
				for (String Number : myReader.nextLine().split(" ")) {
					MatrixArray[Row][Column] = Integer.parseInt(Number);
					Column++;
				}
				Row++;
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for (int i = 0; i < MatrixSize; i++) {
			executorService.execute(new SolveRowOfMatrix(MatrixArray, MatrixSize, i, SquaredMatrixArray));
		}
		
		executorService.shutdown();
		
		try {
			boolean tasksEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);
			
			if (tasksEnded) {
				for (int i = 0; i < MatrixSize; i++) {
					for (int v = 0; v < MatrixSize; v++) {
						System.out.printf("%04d ", SquaredMatrixArray[i][v]);
					}
					System.out.println("");
				}
			}
			else {
				System.out.println("Timed out while waiting for tasks to finish.");
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}

class SolveRowOfMatrix implements Runnable {
	private final int[][] MatrixArray;
	private final int[][] SquaredMatrixArray;
	private final int RowToSolve;
	private final int MatrixSize;
	
	public SolveRowOfMatrix(int[][] MatrixArray, int MatrixSize, int RowToSolve, int[][] SquaredMatrixArray) {
		this.MatrixArray = MatrixArray;
		this.MatrixSize = MatrixSize;
		this.RowToSolve = RowToSolve;
		this.SquaredMatrixArray = SquaredMatrixArray;
	}
	
	public int returnCalculcatedCell(int ColumnIndex) {
		int CalculcatedCell = 0;
		for (int i = 0; i < MatrixSize; i++) {
			CalculcatedCell = CalculcatedCell + (MatrixArray[RowToSolve][i] * MatrixArray[i][ColumnIndex]);
		}
		return CalculcatedCell;
	}
	
	public void run(){
		for (int i = 0; i < MatrixSize; i++) {
			SquaredMatrixArray[RowToSolve][i] = returnCalculcatedCell(i);
		}
	}
}