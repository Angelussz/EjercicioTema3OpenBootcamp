// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int valor1 = 12;
        int valor2 = 10;
        int valor3 = 33;
        Coche MiCoche = new Coche();
        MiCoche.IncrementarPuertas();
        MiCoche.IncrementarPuertas();
        MiCoche.IncrementarPuertas();
        MiCoche.IncrementarPuertas();
        System.out.println(suma(valor1,valor2,valor3));
        System.out.println(MiCoche.NumeroPuertas);

    }
    public static int suma(int valor1,int valor2,int valor3){
        return  valor1+valor2+valor3;
    }
}

class Coche{
    public int NumeroPuertas=0;
    public void IncrementarPuertas(){
        this.NumeroPuertas++;
    }

}