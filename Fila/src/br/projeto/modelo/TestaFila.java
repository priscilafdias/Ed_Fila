package br.projeto.modelo;

public class TestaFila {
	public static void main(String[] args) {
		Fila umaFila = new Fila(5); // fila de itens
		umaFila.insert(10); // insert 4 itens
		umaFila.insert(20);
		umaFila.insert(30);
		umaFila.insert(40);
		umaFila.mostraFila();
		System.out.println(" ");
		umaFila.remove(); // remove 3 itens
		umaFila.remove(); // (10, 20, 30)
		umaFila.remove();
		umaFila.mostraFila();
		System.out.println(" ");
		umaFila.insert(50); // insert 4 itens
		umaFila.insert(60); // (wraps around)
		umaFila.insert(70);
		umaFila.insert(80);
		umaFila.mostraFila();
		System.out.println(" ");
		while (!umaFila.isEmpty()) // remove and display
		{ // all items
			long n = umaFila.remove(); // (40, 50, 60, 70, 80)
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println(" ");
	} // end main()

}
