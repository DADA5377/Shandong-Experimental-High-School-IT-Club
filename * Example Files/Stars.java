//Sample code for activity on loops

public class Stars {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            for (int n = 1; n <= i; ++n) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
