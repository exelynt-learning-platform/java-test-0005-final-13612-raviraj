class JavaTest0005
{
    public static void main(String[] args)
    {
        int num = 1;

        for(int i = 1; i <= 5; i++)   // rows
        {
            for(int j = 1; j <= i; j++)   // numbers per row
            {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
