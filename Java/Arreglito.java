public class Arreglito {

    public static void main(String args[]) {

        int arreglo[] = {1,0,3,0,6,0,0,5,4};
        int auxiliar = 0;

        //Aplicando el metodo de la burbuja

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] < arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }

        //Mostrando los datos ordenados
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }
}
