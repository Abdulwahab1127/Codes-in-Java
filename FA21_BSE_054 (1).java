import java.io.*;
import java.lang.Runnable;
import java.util.*;
import java.util.concurrent.*;

public class FA21_BSE_054
{
	public static Scanner sc;
	private static int sqMatrixSize;
	private static int[][] store;
	private static int[][] resultantMatrix;
	
	public static void main(String[] args)
	{		
		try
		{   
			File matrixFile = new File(args[0]);
			Scanner sc = new Scanner(matrixFile);
			sqMatrixSize = Integer.parseInt(sc.nextLine());
			store = new int[sqMatrixSize][sqMatrixSize];
			resultantMatrix = new int[sqMatrixSize][sqMatrixSize];
			
			int i = 0;
			
			while (sc.hasNextLine())
			{
				int j = 0;
				for (String matrixData : sc.nextLine().split(" ")) 
				{
					store[i][j] = Integer.parseInt(matrixData);
					j++;
				}
				i++;
			}
			sc.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		ExecutorService executorService  = Executors.newCachedThreadPool();
		
		for(int i = 0 ; i < sqMatrixSize ; i++){
			executorService.execute(new sqMatrix(sqMatrixSize, resultantMatrix, store, i));
		}
		
		executorService.shutdown();
		
		System.out.println("\n");
		
		for (int i = 0; i < sqMatrixSize; i++)
		{
			for (int j = 0; j < sqMatrixSize; j++) 
			{
				System.out.printf("%02d ", resultantMatrix[i][j]);
			}
			
			System.out.println(" ");
		}
	}
}

class sqMatrix implements Runnable{
	private final int sqMatrixSize;
	private final int[][] store ;
	private final int[][] resultantMatrix;
	private final int row1;

	public sqMatrix(int sqMatrixSize, int[][] resultantMatrix, int[][] store, int row1)
	{
		this.sqMatrixSize = sqMatrixSize;		
		this.store = store;
		this.resultantMatrix = resultantMatrix;
		this.row1 = row1;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < sqMatrixSize; i++)
		{
			resultantMatrix[row1][i] = 0;

			for(int j = 0; j < sqMatrixSize; j++)
			{
				resultantMatrix[row1][i] += store[row1][j] * store[j][i];
			}
		}
	}
}