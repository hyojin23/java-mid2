package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        String result = (String) integerBox.get();
        System.out.println("result = " + result);
    }
}
