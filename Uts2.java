import java.util.Scanner;

public class Uts2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        Uts2 cariAngka = new Uts2();
        cariAngka.mencariAngkaKembar(data);
    }

    public void mencariAngkaKembar(int[] data){
        boolean angkaSama = false;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == -1) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    count++;
                    data[j] = -1;
                }
            }

            if (count > 1) {
                System.out.println("Angka " + data[i] + " ada " + count);
                angkaSama = true;
            }
        }

        if (!angkaSama) {
            System.out.println("Tidak ada angka yang sama.");
        }
    }
}
