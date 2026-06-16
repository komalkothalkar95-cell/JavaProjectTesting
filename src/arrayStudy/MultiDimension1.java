package arrayStudy;

public class MultiDimension1 {
    public static void main(String[] args) {
        String subject[][] = {{"ab", "bc", "cd"}
                              ,{"cd","de","ef"}};

        for(int i=0;i<=subject.length-1;i++)//for row
        {
            for(int j=0;j<=subject[i].length-1;j++) // for column
            {
                System.out.print(subject[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
