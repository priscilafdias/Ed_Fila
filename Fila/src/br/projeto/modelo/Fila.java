package br.projeto.modelo;

public class Fila {
	private int maxSize;
	private long[] filaArray;
	private int front;
	private int rear;
	private int nItems;

	public Fila(int s) {// construtor
		maxSize = s;
		filaArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) { // coloca um item no fim da fila
		if (rear == maxSize - 1) // lida com a fila circular
			rear = -1;
		filaArray[++rear] = j; // incrementa o final e insere
		nItems++; // incrementa a quantidade de itens
	}

	public long remove() { // remove um item da frente da fila
		long temp = filaArray[front++]; // obtem o item a ser removido e
		// incrementa
		if (front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}

	public long peekFront() { // peek at front of queue
		return filaArray[front];
	}

	public boolean isEmpty() { // true if queue is empty
		return (nItems == 0);
	}

	public boolean isFull() { // true if queue is full
		return (nItems == maxSize);
	}

	public int size() { // number of items in queue
		return nItems;
	}

	public void mostraFila() {
		for (int i = 0; i < filaArray.length; i++) {
			System.out.print(filaArray[i]);
			System.out.print(" ");
		}
		System.out.print("inicio = " + front + " - " + "fim = " + rear);
	}

}
