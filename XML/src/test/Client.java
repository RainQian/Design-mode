package test;

import java.io.IOException;

public class Client {
public static void main(String[] args) throws IOException {
	ReadXML parser = new ReadXML();
	parser.parse();
	parser.result();
}
}
