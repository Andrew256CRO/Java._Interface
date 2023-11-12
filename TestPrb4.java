public class TestPrb4 {
    TestPrb4(){
        System.out.println("Constructor TestPrb4.");
    }
    public static void main(String[] args) {
        Interf1 obj=new ClasaA();
        obj.metoda1();
        ((Interf2) obj).metoda2();
        ((Interf3) obj).metoda3();
        ((Interf4) obj).metoda4();
    }
}

//Output:
        /*Metoda 1.
        Metoda 2.
        Metoda 3.
        Metoda 4.*/