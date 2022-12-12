package myapp;

public class demomultiuser {
    public static void main(String[] args) {
        System.out.println("welcome to multi user shopping cart");


        ShoppingCartDB cart = new ShoppingCartDB(); // default folder is "DB"
        cart.setup();
        cart.startShell(); 



    
}

}