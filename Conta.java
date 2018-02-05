class Conta {
    int a = 0;
    int b = 1;
    int c;



    void getFibonacci(int pato) {
        int[] lista = new int [pato];
        for (int count = 0; count < pato; count++) {
            c = a + b;
            lista[count] = c;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
