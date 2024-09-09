package Instrucoes1e2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Esfera esfera = new Esfera(5.0f);


        float volume = esfera.calcularVolume();
        float area = esfera.calcularArea();

        System.out.println("Volume: " + volume);
        System.out.println("Area da esfera: " + area);
    }
}