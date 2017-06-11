package test;

import java.util.HashSet;
import java.util.Set;

public class Node {
	private String name;
	private String value;
	private Set<Node> child = new HashSet<>();
	private Node parent = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Set<Node> getChild() {
		return child;
	}
	public void setChild(Set<Node> child) {
		this.child = child;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}

}
