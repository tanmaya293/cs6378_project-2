import java.io.*;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Node {

	private final int id;

	private final String hostname;

	private final int port;

	private HashMap<Integer, Neighbor> neighbors;

	private HashMap<Integer, Socket> neighborSockets;

	private ConcurrentLinkedQueue<Message> messageQueue;

	public Node(int id, String hostname, int port) {
		this.id = id;
		this.hostname = hostname;
		this.port = port;

		this.neighbors = new HashMap<>();
		this.neighborSockets = new HashMap<>();
	}

	public void addNeighbor(int id, String hostname, int port) {
		this.neighbors.put(id, new Neighbor(id, hostname, port));
	}

	public int getId() {
		return this.id;
	}

	public String getHostname() {
		return this.hostname;
	}

	public int getPort() {
		return this.port;
	}

}
