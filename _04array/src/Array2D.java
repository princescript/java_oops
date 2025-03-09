public class Array2D {
    public static void main(String[] args) {

//    int[][] arr = new int[3][3];
//    int [][] num = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(num[1][1]);
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num.length ; j++) {
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//        }

//        char arr[][] = new char[3][2];
//        arr[0][0] = 'A';
//        arr[0][1] = 'B';
//        arr[1][0] = 'C';
//        arr[1][1] = 'D';
//        arr[2][0] = 'E';
//        arr[2][1] = 'F';
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
    int[][] jaggedArray = {
            {1, 2},      // First row[0] has 2 elements
            {3, 4, 5},   // Second row[1] has 3 elements
            {6, 7, 8, 9} // Third row[2] has 4 elements
        };
        for (int i = 0; i <jaggedArray.length ; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j]+ " ");
            }
            System.out.println();
        }


    }
}











    /*for (int i = 0; i < num.length; i++) {
        System.out.println(num[i]); // 1 layer address print
    }*/
    /*int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for(int[] val : myNumbers){
        for (int value : val){
            System.out.println(value);
        }
    }*/