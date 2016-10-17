package Figuras;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    protected static Figura figura;
    protected static List<Figura> figuras = new ArrayList<Figura>();
    protected static String answer;


    static void menu() {
        System.out.println("A. Texto\n" +
                "B. Punto\n" +
                "C. Linea\n" +
                "D. Círculo\n" +
                "E. Cuadrado\n" +
                "F. Rectángulo\n" +
                "G. Polígono\n\n" +
                "H. Dibujar el historial de figuras\n" +
                "I. Salir\n");

        System.out.print("Elige --> ");
        answer = sc.nextLine();

        switch (answer) {
            case "A":
                figura = new Text();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "B":
                figura = new Dot();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "C":
                figura = new Line();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "D":
                figura = new Circle();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "E":
                figura = new Square();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "F":
                figura = new Rectangle();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "G":
                figura = new Poligon();
                figura.read();
                figuras.add(figura);

                callWindow();
                break;
            case "H":
                callWindow();
                break;
            case "I":
                return;

        }

        menu();

    }

    static void callWindow() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Window frame = new Window();
                    frame.setVisible(true);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        menu();
    }

}
