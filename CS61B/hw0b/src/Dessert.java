public class Dessert {
    int flavor, price;
    static int numDesserts = 0;
    int index = numDesserts + 1;
    public Dessert(int flavorInput, int priceInput) {
        flavor = flavorInput;
        price = priceInput;
        numDesserts++;
    }

    public void printDessert(){
        System.out.println(this.flavor + " " + this.price + " " + index);
    }

    public static void main(String[] args){
        System.out.println("I love dessert!");
        Dessert cheese = new Dessert(3,4);
        Dessert apple = new Dessert(5,4);
        cheese.printDessert();
        apple.printDessert();
        System.out.println(numDesserts);
    }
}
