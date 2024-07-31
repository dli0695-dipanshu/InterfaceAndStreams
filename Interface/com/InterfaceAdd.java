package Interface.com;

public abstract class InterfaceAdd implements FunctionalImplementation{


    public static void main(String[] args) {

        FunctionalImplementation h =(int a, int b) -> {
            return a + b;
        };
        int ans = h.add(3, 4);
        System.out.println(ans);
    }
}
