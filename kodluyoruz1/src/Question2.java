public class Question2 {


        public static void main(String[]args){
            int total = 0;

            for (int i = 3; i <= 100; i++) {

                boolean Control = true;

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        Control= false;
                        break;
                    }
                }
                if (Control) {
                    total += i;
                }
            }
            System.out.println(total);
        }
    }



