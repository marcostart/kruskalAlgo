package kruskalProject;

public class SomParent {
	public int parents[];
	public SomParent(int n) {
		parents = new int[n];
	}
	public int find(int x) {
		if (parents[x] == x) {
			return x;
		}
		return find(parents[x]);
	}
	
	public void setParent(int x, int y) {
		int px= find(x);
		int py= find(y);
		parents[px]=py;
	}
}
