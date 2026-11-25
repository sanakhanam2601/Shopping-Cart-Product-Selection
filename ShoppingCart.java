import java.util.Scanner;

class ShoppingCart {
    public static void main(String[] args) {
        String products[] = {"Laptop", "Mobile", "Headphones", "Keyboard", "Mouse"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product position (0 to 4):");
        int position = sc.nextInt();

        try {
            System.out.println("Selected product: " + products[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product position");
        }
    }
}