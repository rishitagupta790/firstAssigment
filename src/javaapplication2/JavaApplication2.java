package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == (n - 1) && i < (n - 1) / 2 || i == (n - 1) / 2 || i == j && i > (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i < (n - 1) / 2 || i == (n - 1) / 2 || j == (n - 1) && i > (n - 1) / 2 || i == (n - 1)) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == (n - 1) / 2 || j == n - 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }

            System.out.println(" ");

        }
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || i == n - 1 || j == 0) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n - 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == (n - 1) && i < (n - 1) / 2 || i == (n - 1) / 2 || i == j && i > (n - 1) / 2) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.print(" ");

            System.out.println(" ");
        }
        System.out.println(" ");
// 2nd program code
        int m = 5;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
// 3rd program code
        int ri = 20;
        for (int i = 0; i < ri; i++) {
            for (int j = 0; j < ri; j++) {
                if (i == 0 || i == ri - 1 || j == 0 || j == (ri - 1) ||i+j<=(ri-1)/2 || j-i>(ri-1)/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
//4th program code
        int shi = 11;
        for (int i = 0; i < shi; i++) {
            for (int j = 0; j < shi; j++) {
                if (i - j >= (shi - 1) / 2 || i == shi - 1 || i == shi - 2 || i + j >= (shi - 1) / 2 + shi - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");

        // 5th program code
        int fif = 10;
        for (int i = 0; i < fif; i++) {
            for (int j = 0; j < fif; j++) {
                if (i==0||i==fif-1||j==0 ||i+j<=(fif-1)/2 ||  i-j>(fif-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println(" ");
        }
    }

}
