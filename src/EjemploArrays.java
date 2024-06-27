import java.util.Arrays;

public class EjemploArrays{
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0]="Kingston 64gb";
        productos[1]="Galaxy 4";
        productos[2]="MSI portatil";
        productos[3]="Cosa 3";
        productos[4]="Tele";
        productos[5]="Mac";
        productos[6]="Bicicleta";

        Arrays.sort(productos);

        String prod3 = productos[3];

        System.out.println("producto[0]" + productos[0]);
        System.out.println("producto[1]" + productos[1]);
        System.out.println("producto[2]" + productos[2]);
        System.out.println("producto[3]" + prod3);

        Arrays.sort(productos);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.parseInt("7");
        numeros[2] = 43;
        numeros[3] = -1;
        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i =" + i);
        System.out.println("j =" + j);
        System.out.println("k =" + k);
        System.out.println("l =" + l);
    }

}
