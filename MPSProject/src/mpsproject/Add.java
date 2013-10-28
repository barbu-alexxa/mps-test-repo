public class addMatrix {
	public static int[][] matrixAdd(int[][] A, int[][] B)
	{
	    // Check if matrices have contents
	    if ((A.length < 0) || (A[0].length < 0)) return B;
	    if ((B.length < 0) || (B[0].length < 0)) return A;
	
	    // create new matrix to store added values in
	    int[][] C = new int[A.length][A[0].length];
	
	    for (int i = 0; i < A.length; i++)
	    {
	        for (int j = 0; j < A[i].length; j++)
	        {
	            C[i][j] = A[i][j] + B[i][j];
	        }
	    }
	    return C;
	}
}