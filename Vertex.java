package Dijsktra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
	private String name;
	private List<Edge> adjacenciesList;
	private boolean isVisited;
	private Vertex predecessor;
	private double distance = Double.MAX_VALUE;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "] + [distance=" + this.getDistance() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setAdjacenciesList(List<Edge> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Vertex vertex) {
		return Double.compare(this.distance, vertex.getDistance());
	}
	
	public void addNeighbour(Edge edge) {
		this.adjacenciesList.add(edge);
	}

}
