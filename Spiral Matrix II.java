class Solution 
{ 
    ArrayList<ArrayList<Integer>> generateSpiralMatrix(int N) 
    { 
        // code here
        int r=N;
        int [][]mat=new int[r][r];
        int leftCol=0,rightCol=r-1,topRow=0,bottomRow=r-1,count=1;
        while(leftCol<=rightCol && topRow<=bottomRow){
            for(int i=leftCol;i<=rightCol;i++){
                mat[topRow][i]=count;
                count++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow;i++){
                mat[i][rightCol]=count;
                count++;
            }
            rightCol--;
            if(topRow>bottomRow){
                break;
            }
            for(int i=rightCol;i>=leftCol;i--){
                mat[bottomRow][i]=count;
                count++;
            }
            bottomRow--;
            if(leftCol>rightCol){
                break;
            }
            for(int i=bottomRow;i>=topRow;i--){
                mat[i][leftCol]=count;
                count++;
            }
            leftCol++;
        }
        
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<r;i++){
            list.add(new ArrayList<>());
            for(int j=0;j<r;j++){
                list.get(i).add(mat[i][j]);
            }
        }
        return list;
        
    }
} 
