package nested;

public class H {
        public static void main(String[] args) {
                System.out.println("main begin");
                if(true) {
                        System.out.println("if1 begin");
                        if(true) {
                                System.out.println("if2 begin");
                        }
                        System.out.println("if1 end");
                }
                System.out.println("main end");
        }
}

