import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {
    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        
        Matriz adicao = new Matriz(3, 2);
        double[][] adc = adicao.getMatriz();
        adc[0][0] = 1.0;
        adc[0][1] = 1.0;
        adc[1][0] = 1.0;
        adc[1][1] = 1.0;
        adc[2][0] = 1.0;
        adc[2][1] = 1.0;
        
        Matriz prod = new Matriz(2, 3);
        double[][] produ = prod.getMatriz();
        produ[0][0] = 1.0;
        produ[0][1] = 2.2;
        produ[0][2] = 6.3;
        produ[1][0] = 5.0;
        produ[1][1] = 7.1;
        produ[1][2] = 2.3;
        
        Matriz transp = orig.getTransposta();
        Matriz soma = orig.soma(adicao);
        Matriz produto1 = orig.prod(prod);
        Matriz produto2 = prod.prod(orig);
        
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        System.out.println("Matriz Soma: " + soma);
        System.out.println("Matriz Produto 1: " + produto1);
        System.out.println("Matriz Produto 2: " + produto2);
    }
}
