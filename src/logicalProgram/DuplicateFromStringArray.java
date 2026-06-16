package logicalProgram;

import java.util.Arrays;

public class DuplicateFromStringArray
{
    public static void main(String[] args) {
        String ar[]={"api","java","selenium","js","api","java"};
        int count=0;
        for(int i=0;i<=ar.length-1;i++)
        {
            for (int j=i+1;j<=ar.length-1;j++)
            { if (ar[i]==ar[j])

            {
                System.out.println("duplicat string are "+ar[i]);
                count++;
            }
            }

        }
        System.out.println("count of dupliacte string is "+count);
    }
}
