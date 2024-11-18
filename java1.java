Class Arraydemo1
{
    public static void main(String[] args)
    {
        intx[]= new int[4];
        System.out.println(x);
        System.out.println("Size of array:" x.length);
        System.out.println(x[1]);
        System.out.println(x[x.length-1]);
        for(int i=0;i<x.length;i++);
        {
            x[i]=i*i;
        }
        system.out.println();
        for(int j=0;j<x.length;j++)
        {
            System.out.println("x[" + j +"]" + x[j]);
        }
    }
} 