//Создать класс, который выводит значение выражения 2*х+3/y. Создать можно только один объект данного класса

package com.company;
import java.util.Scanner;

class Calculate{
    private static Calculate calculate= new Calculate();   //объект класса
    private double x;
    private double y;
    private Calculate(){}

    public static Calculate getInstanse(){
        return calculate;                }                //возвращает объект класса для взаимодействия
    public double Math() {
        return 2 * x + 3 / y;
                         }
    public void setConstr(double x, double y) {
        this.x = x;
        this.y = y;                           }
               }

public class Main {
    public static void main(String[] args) {
        Calculate calc = Calculate.getInstanse();
        System.out.println((char) 27 + "[45m2x + 3/y " + (char)27 + "[0m");

        Scanner sc = new Scanner(System.in);

        System.out.println((char) 27 + "[34mEnter x: " + (char)27 + "[0m");
        double x= sc.nextDouble();

        System.out.println((char) 27 + "[34mEnter у: " + (char)27 + "[0m");
        double y = sc.nextDouble();

        calc.setConstr(x, y);
        System.out.println((char) 27 + "[45mAnswer:" +  (char)27 + "[0m");
        System.out.println((char) 27 + "[32m"+calc.Math() +  (char)27 + "[0m");
                                            }
                  }
