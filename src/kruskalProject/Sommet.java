package kruskalProject;

public class Sommet {
	
	private int w, prev, next;
	
	public Sommet(int a, int b, int w) {
		this.w= w;
		this.next= b;
		this.prev=a;
	}
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}
}
