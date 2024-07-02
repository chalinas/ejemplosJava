import java.util.Arrays;

public class EjemploArraysForInverso {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int count = productos.length;

        productos[0]="Kingston 64gb";
        productos[1]="Galaxy 4";
        productos[2]="MSI portatil";
        productos[3]="Cosa 3";
        productos[4]="Tele";
        productos[5]="Mac";
        productos[6]="Bicicleta";
        Arrays.sort(productos);

        System.out.println("=======Usando For iNVERSO=======");
        for (int i = 0; i < count; i++){
            System.out.println("para indice"+ (count-i-1) + ":" + productos[count-i-1]);
        }



        int[] numeros = new int[10];
        int largo = numeros.length;
        for (int k = 0; k < largo; k++){
            numeros[k]=k*3;
        }
        for(int k = 0; k < largo; k++){
            System.out.println("El numero en la posicion " + k + " es:" + numeros[k]);
        }

    }

}
