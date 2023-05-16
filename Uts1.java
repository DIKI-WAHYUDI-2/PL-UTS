import java.util.Scanner;

public class Uts1 {

    public void mencariAngkaSama(int[] data) {
        boolean bl = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    bl = true;
                }
            }
        }

        if (bl){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int[] data = new int[n];
        for(int i = 0; i < data.length; i++){
            data[i] = input.nextInt();
        }

        Uts1 test = new Uts1();
        test.mencariAngkaSama(data);


    }
    
}