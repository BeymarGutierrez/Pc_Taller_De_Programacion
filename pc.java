public clase pc{

    public static void public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor para n:");
        n= leer.nextInt();
        int matriz [][] = new int [n][n];
        int matrizA [][] = new int [m][m];
        int matrizS [][] = new int [k][k];
         for (int i=1;i<=n;i++)
         {
             System.out.println();
             for(int j=1;j<=n;j++)
             {
                 matriz [i][j]=j*2;

                 System.out.println(matriz [i][j]+" ");
             }
         }
         //Matriz suma
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) 
            {
                matrizS [i][j]=matrizA[i][j]+matriz[i][j];
            }  
        }
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) 
            {
                System.out.println(matrizS[i][j]+" ");
            }  
        }
    }
}