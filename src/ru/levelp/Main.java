package ru.levelp;

/**
 * Created by natalie on 20.02.16.
 */

 /*
Домашнее задание
ax + b = 0
1) Линейные уравнения
2) Найти как пользователю вводить в командную строку данные
3) Пользователь вводит a и b с клавиатуры, после чего выводится ответ:
    x = ответ
4) Читать: Типы данных и диапазоны значений
 */

import java.util.Scanner; // class import
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner
        System.out.println("Вас приветствует программа вычисления линейного уравнения ax + b = 0");
        double a = 1;
        System.out.println("Введите значение \"a\": ");
        if (sc.hasNextDouble()) { // возвращает истину, если с потока ввода можно считать целое число
            a = sc.nextDouble(); // считывает целое число с потока ввода и сохраняет в переменную
            double b = 2;
            System.out.println("Введите значение \"b\": ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                System.out.println("Искомое значение x = "+(-b/a));
            }

        } else {
            System.out.println("Введенное значение не является числом");

        }
    }
}
