class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        
        int r= matrix.length;
        int c = matrix[0].length;
        
        for(int i=0;i<r;i++)
        {
            
            for(int j=0;j<c;j++)
            {
                
                if(matrix[i][j]==1)
                {
                    s1.add(i);
                    s2.add(j);
                    
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(s1.contains(i)||s2.contains(j))
                {
                    matrix[i][j]= 1;
                    
                }
                
            }
        }
        
    }
    
}
