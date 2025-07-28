/* 12 4 8
    5 7 6
    4 8 13
    
    Maxumum prime of the 2 diagonals 13
*/ 


        int col=sc.nextInt();
        int mat [][]=new mat[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        int maxprime=-1;
        //going thriugh first diagonal,and if we are using Condition: The loop runs as long as i is less than the smaller of row or col (i.e., Math.min(row, col)).
        //This is because in a non-square matrix, one dimension (either rows or columns) may be smaller than the other. 
        //We can only go as far as the minimum of these two dimensions to stay within the bounds of the matrix.

        for(int i=0;i<Math.min(row,col);i++)
        {
            int primdiag=matrix[i][i];
            int secondaydiag=matrix[i][col-1-j]
            if(isPrime(primdiag) && primdiag>maxprime)
            {
                maxprime=primdiag;
            }

        }



    }
}
