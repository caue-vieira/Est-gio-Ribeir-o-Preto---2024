import javax.swing.JOptionPane;

public class fibonacci {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numAnterior = 0;
        int numAtual = 1;
        int proxNum;

        while (numAtual < num) {
            proxNum = numAtual + numAnterior;
            numAnterior = numAtual; 
            numAtual = proxNum;
            if(proxNum == num) {
                System.out.println("Seu número " + num + " pertence à sequência de Fibonacci");
                break;
            } else if(proxNum > num) {
                System.out.println("Seu número " + num + " não pertence à sequência de Fibonacci");
            }
        }
    }
}