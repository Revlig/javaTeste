import javax.swing.*;
class Teste {
    public static void main(String[] args) {
        Conta gilver;
        gilver = new Conta();
        int quantidade;

        gilver.getFibonacci(quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite")));
    }
}
