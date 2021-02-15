package ru.ITMO;
// 1. Написать итератор по массиву (одномерному, потом обобщить до двумерного)
public class Main {

    public static void main(String[] args) {
	Integer [] arr1 = {0,12,5,65,1,0,550,202,212,21,2,15,45,56};
	Integer [][] arr2 = {{0,1,120,0,21,2},
						 {12,12,1,3,56,5}};


	IteratorOne<Integer> iteratorOne = new IteratorOne<>(arr1);
	while (iteratorOne.hasNext())
		System.out.print(iteratorOne.next() + "  ");

	System.out.println();

	IteratorTwo<Integer> iteratorTwo = new IteratorTwo<>(arr2);
	while (iteratorTwo.hasNext())
		System.out.print(iteratorTwo.next() + "  ");

    }
}
