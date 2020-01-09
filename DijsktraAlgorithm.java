package Dijsktra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijsktraAlgorithm {

	public void computePaths(Vertex sourceVertex) {
		sourceVertex.setDistance(0);
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();
		priorityQueue.add(sourceVertex);

		while (!priorityQueue.isEmpty()) {
			Vertex actualVertex = priorityQueue.poll();
			for (Edge edge : actualVertex.getAdjacenciesList()) {

				Vertex targetVertex = edge.getTargetVertex();
				double newDistance = actualVertex.getDistance() + edge.getWeight();

				if (newDistance < targetVertex.getDistance()) {
					priorityQueue.remove(targetVertex);
					targetVertex.setDistance(newDistance);
					targetVertex.setPredecessor(actualVertex);
					priorityQueue.add(targetVertex);
				}
			}
		}
	}

	public List<Vertex> getShortestPathTo(Vertex targetVertex) {
		List<Vertex> shortestPathToTarget = new ArrayList<Vertex>();
		for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) {
			shortestPathToTarget.add(vertex);
		}
		Collections.reverse(shortestPathToTarget);
		return shortestPathToTarget;
	}
}
