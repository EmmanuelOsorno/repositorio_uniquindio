package ejercicios;

public class RepasoEjercicio6 {


    // Función para encontrar el número menor en un arreglo

    public static int encontrarMenor(int []numeros){
        int auxiliarMenor=0; // int auxiliarMenor=numeros[0]    el primer número del arreglo
        int numeroMenor=0;
        int contador=0;
        while (contador<numeros.length){
            if(numeros[contador]<auxiliarMenor){
                numeroMenor=numeros[contador];
            }
            contador++;
        }
        return numeroMenor;
    }

}
