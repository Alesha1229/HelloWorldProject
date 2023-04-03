package classwork.c5;

public class Cw55 {
    public static void main(String[] args) {

        int[][][] superArr = new int[11][11][11];
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                for (int k = 0; k < superArr[i][j].length; k++) {
                    System.out.print(" arr["+i+"]["+j+"]["+k+"] = " + superArr[i][j][k]);
                }
            }
            System.out.println();
        }



    }
}
