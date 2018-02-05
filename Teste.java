import javax.swing.*;
class Teste {
    public static void main(String[] args) {
        Conta gilver;
        gilver = new Conta();
        int quantidade;
        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite"));
       
        gilver.getFibonacci(quantidade);
    }
}
