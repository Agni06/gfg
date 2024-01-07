 public static int findDouble(int a[], int n, int k)
    {
        //Your code here
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                
                k = k*2;
                
                continue;
            }
        }
        return k;
    }
