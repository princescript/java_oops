public class Loops {
    public static void main(String[] args) {
        //while loop
        int i = 1;
        while(i <= 5){
            //System.out.println("Hello World" + " " +i);
            String result = String.format("Hello World %d",i);
            System.out.println(result);
            i++;
        }

        //do while loop
        int j= 1;
        do{
            System.out.println("Hello Do Loop" + " " + j);
            j++;
        }while (j<=5);

        //for loop
        for (int k = 1 ; k <=10 ; k++){
            System.out.print(k +"\'" + "\t"); //1'	2'	3'	4'	5'	6'	7'	8'	9'	10'
        }

    }
}
