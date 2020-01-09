package Dijsktra;

public class App {
	public static void main(String[] args) {
		Vertex pointA = new Vertex("A");
		Vertex pointB = new Vertex("B");
		Vertex pointC = new Vertex("C");
		Vertex pointD = new Vertex("D");
		Vertex pointE = new Vertex("E");
		Vertex pointF = new Vertex("F");
		
		pointA.addNeighbour(new Edge(7, pointA, pointB));
		pointA.addNeighbour(new Edge(5, pointA, pointC));
		pointA.addNeighbour(new Edge(2, pointA, pointD));
		
		pointB.addNeighbour(new Edge(7, pointB, pointA));
		pointB.addNeighbour(new Edge(8, pointB, pointF));
		pointB.addNeighbour(new Edge(3, pointB, pointE));
		
		pointC.addNeighbour(new Edge(5, pointC, pointA));
		pointC.addNeighbour(new Edge(10, pointC, pointD));
		pointC.addNeighbour(new Edge(4, pointC, pointE));
		
		pointD.addNeighbour(new Edge(2, pointD, pointA));
		pointD.addNeighbour(new Edge(10, pointD, pointC));
		pointD.addNeighbour(new Edge(2, pointD, pointF));
		
		pointE.addNeighbour(new Edge(3, pointE, pointB));
		pointE.addNeighbour(new Edge(4, pointE, pointC));
		pointE.addNeighbour(new Edge(2, pointE, pointF));
		
		pointF.addNeighbour(new Edge(2, pointE, pointD));
		pointF.addNeighbour(new Edge(8, pointE, pointB));
		pointF.addNeighbour(new Edge(6, pointE, pointE));
		
		DijsktraAlgorithm algorithm = new DijsktraAlgorithm();
		algorithm.computePaths(pointA);
		System.out.println(algorithm.getShortestPathTo(pointE));
	}
}
