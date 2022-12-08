import lista01.*;

public class testaPedagio{
    public static void main(String[] args) throws Exception{
        pedagio p = new pedagio(5.3f, 5);
        for(int i = 0; i < 10; i++){
            p.passaCarro();
        }
        p.exibe();
    }
}
