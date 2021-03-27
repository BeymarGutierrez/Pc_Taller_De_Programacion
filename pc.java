public clase pc{

    public static void public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor para n:");
        n= leer.nextInt();
        int matriz [][] = new int [n][n];

         for (int i=1;i<=n;i++)
         {
             System.out.println();
             for(int j=1;j<=n;j++)
             {
                 matriz [i][j]=j*2;

                 System.out.println(matriz [i][j]+" ");
             }
         }
        
    }
}