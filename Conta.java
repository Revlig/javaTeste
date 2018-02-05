class Conta {
    int a = 0;
    int b = 1;
    int c;



    void getFibonacci(int quantidade) {
        int[] lista = new int [quantidade];
        for (int count = 0; count < 10; count++) {
            c = a + b;
            lista[count] = c;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
