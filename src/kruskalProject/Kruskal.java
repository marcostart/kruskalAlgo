package kruskalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortByWeight implements Comparator<Sommet>{

	@Override
	public int compare(Sommet o1, Sommet o2) {
		// TODO Auto-generated method stub
		return o1.getW()-o2.getW();
	}
	
}
public class Kruskal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//On déclare les variables d'entrées
		int nbAr, nbSom, a, b, w;
		System.out.println("Entrer le nombre d'arêtes et le nombre de sommets (entiers)");
		nbAr = input.nextInt();
		nbSom = input.nextInt();
		SomParent parentOb = new SomParent(nbSom+1);
		for (int i=0; i<nbSom; i++) {
			parentOb.parents[i]=i;
		}
		ArrayList<Sommet> edges = new ArrayList<Sommet>();
		System.out.println("Entrer respectivement les sommets et les poids de chaque arête");
		for (int i=0; i<nbAr; i++) {
			a = input.nextInt();
			b = input.nextInt();
			w = input.nextInt();
			edges.add(new Sommet(a, b, w));
		}
		
		int arpm_weight = 0, arpm_edges= 0, arpm_par=0;
		Collections.sort(edges, new SortByWeight());
		while ( (arpm_edges<nbSom-1) || (arpm_par< nbAr) ) {
			a= edges.get(arpm_par).getPrev();
			b= edges.get(arpm_par).getNext();
			w= edges.get(arpm_par).getW();
			if (parentOb.find(a) != parentOb.find(b)) {
				parentOb.setParent(a, b);
				arpm_weight += w;
				System.out.println(a+ "----"+b+"----w= "+w);
				arpm_edges++;
			}
			arpm_par++;
		}
		System.out.println("Le poids de l'ARPM est : "+arpm_weight);
		
	}

}


/////////////////////////////////////////
/*
1 2 4
7 2 2
6 2 3
6 5 1
5 3 20
4 3 6
1 4 7
2 5 2
2 3 1
*/
