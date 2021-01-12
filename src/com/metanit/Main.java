package com.metanit;
/*Создать квадратный двумерный целочисленный массив (количество строк и
столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
элементы единицами;*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Insert size of array:");
	int size = input.nextInt();
	int[][] arr = new int[size][size];
	for (int i = 0; i < arr.length; i++) {
	    arr[i][i] = 1;
        }
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr.length; j++) {
	        System.out.print(arr [i][j] + "\t");
        }
		System.out.println();
    }
    }
}
