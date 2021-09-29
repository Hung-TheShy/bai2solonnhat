
package bai2;

import java.util.Scanner;
public class Bai2 {

    
    public static void main(String[] args) {
    int a , b , c ;
    int max;
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap vao so dau tien:");
    a = scanner.nextInt();
    System.out.print("nhap vao so thu 2:");
    b = scanner.nextInt();
    System.out.print("nhap vao so thu 3:");
    c = scanner.nextInt();
    if (a >= b) {
            if (a >= c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b >= c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println("Số lớn nhất là: " + max);
    
    }
    
}
