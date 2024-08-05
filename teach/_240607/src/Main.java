public class Main {
    public static void main(String[] args) {
        Tiger tiger;
        Cat cat;
        tiger = new Tiger();
        cat = new Cat();
        System.out.println("tigerµÄ×´Ì¬£º"+tiger.getState());
        System.out.println("catµÄ×´Ì¬£º"+cat.getState());
        tiger.start();
        cat.start();
        for(int i=1;i<=6;i++){
            System.out.printf("\n%s","tiger×´Ì¬£º"+tiger.getState());
            System.out.printf("\n%s","cat×´Ì¬£º"+cat.getState());
            System.out.printf("\n%s","Ö÷ÈË£º"+i);
        }
        System.out.printf("\n%s","tiger×´Ì¬£º"+tiger.getState());
        System.out.printf("\n%s","cat×´Ì¬£º"+cat.getState());
    }
}