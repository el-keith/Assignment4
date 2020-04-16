public class CatTest {
    public static void main(String[] args) {

        Cat cat [] = new Cat [5];

        Cat cat1 = new Cat("Telly", 3, "happy", "Tabby");
        Cat cat2= new Cat("Div", 3, "happy", "Tabby");
        Cat cat3 = new Cat("Mike", 3, "happy", "Tabby");
        Cat cat4 = new Cat("Keith", 3, "happy", "Tabby");
        Cat cat5 = new Cat("Lucie", 3, "happy", "Tabby");

        cat1 = cat[0];
        cat2 = cat[1];
        cat3 = cat[2];
        cat4 = cat[3];
        cat5 = cat[4];

        System.out.print(cat[1].toString());

//        for (int i = 0; i < cat.length ; i ++) {
//            System.out.print(cat[i].getName() + " ");
//        }

    }
}
