package logicalProgram;

public class RemoveDuplicatesAndCount {
    public static void main(String[] args) {
        int ar[]={2,4,6,2,7,8,4,4,3,2,2};
        int count=0;
        for (int i=0;i<=ar.length-1;i++)
        {
           for (int j=i+1;j<=ar.length-1;j++)
           {
               if(ar[i]==ar[j])
               {
                   System.out.println("duplicate found are "+ar[i]);
               }
               count++;


           }

        }
        System.out.println("dupicates count are "+count);
    }
}
