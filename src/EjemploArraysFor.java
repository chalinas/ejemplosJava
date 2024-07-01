import java.util.Arrays;

public class EjemploArraysFor {
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

        System.out.println("=======Usando For=======");
        for (int i = 0; i < count; i++){
            System.out.println("para indice"+ i + ":" + productos[i]);
        }
        System.out.println("========Usando ForEach=========");
        for(String prod: productos){
            System.out.println("proud= " + prod);
        }
        System.out.println("==========Usando While=======");
        int i = 0;
        while (i < count){
            System.out.println("para indice"+ i + ":" + productos[i]);
            i++;
        }
        System.out.println("==========Usando Do-While=======");
        int j = 0;
        do {
            System.out.println("para indice" + j + ":" + productos[j]);
            j++;
        }
        while (j < count);



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
