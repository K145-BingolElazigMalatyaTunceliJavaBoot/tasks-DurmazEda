public class Question3 {
    public static void main(String[]args){

        int total = 0;

        for(int i = 200; i < 500 ; i++){
            if(i%3 == 0){
                continue;
            }
            total += i;
        }System.out.println(total);

    }
}
