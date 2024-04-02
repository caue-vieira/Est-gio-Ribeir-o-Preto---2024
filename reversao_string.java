import javax.swing.JOptionPane;

public class reversao_string {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para ser invertida");

        char[] letras = new char[palavra.length()];
        int numLetras = palavra.length() - 1;

        for(int i = 0; i < palavra.length(); i++) {
            letras[numLetras - i] = palavra.charAt(i);
        }
        String revertida = new String(letras);
        System.out.println(revertida);
    }
}
