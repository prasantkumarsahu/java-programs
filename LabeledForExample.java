public class LabeledForExample {
    public static void main(String[] args) {
        firstLoop:
        for(int i = 0; i < 5; i++){
            secondLoop:
            for(int j = 0; j < 5; j++){
                if(i == 2 && j == 2)
                    break firstLoop;

                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        firstLoop:
        for(int i = 0; i < 5; i++){
            secondLoop:
            for(int j = 0; j < 5; j++){
                if(i == 2 && j == 2)
                    continue firstLoop;

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
