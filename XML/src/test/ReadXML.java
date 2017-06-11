package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadXML {
//	String path = "D:\\workspace\\XML\\test.xml";
	String path = "D:\\test.xml";
	String text = "";
	Node root = new Node();
	Node currentNode = null;
	public void parse() throws IOException{
		File xmlFile = new File(path);
		InputStream in = new FileInputStream(xmlFile);
		int len;
		byte []buff = new byte[1024];
		while ((len=in.read(buff))>0){
			text+=new String(buff);
		}
		System.out.println("text:   "+text);
//		in.close();
		root.setParent(null);
		parseText(root, text);
	}
	private void parseText(Node root,String text){
		currentNode = root;
		boolean isFirst = true;
		while(!text.trim().equals("")){
			if(text.startsWith("<")&&!text.startsWith("</")){
				int head_begin = text.indexOf("<");
				int head_end = text.indexOf(">");
				String name = text.substring(head_begin, head_end+1);
				if(currentNode.getParent()==null&&isFirst){
					currentNode.setName(name);
					isFirst=false;
				}else{
					Node child = new Node();
					child.setName(name);
					child.setParent(currentNode);
					currentNode.getChild().add(child);
					currentNode = child;
				}
				text = text.substring(head_end+1).trim();
				continue;
			}else if(!text.startsWith("</")&&!text.startsWith("<")){
				int head_begin = text.indexOf("</");
				String value = text.substring(0, head_begin).trim();
				currentNode.setValue(value);
				text = text.substring(head_begin).trim();
				continue;
			}else if(text.startsWith("</")){
				
				Node temp = currentNode.getParent();
				if(temp!=null){
					currentNode=temp;	
				}
				int end_end=text.indexOf(">");
				text=text.substring(end_end+1).trim();
				continue;
			}
		}
	}
	public void printGivenNumBlank(int blank){
		for(int i=0;i<blank;i++){
			System.out.print("  ");
		}
	}
	
	//深度遍历结果
	private  void show(Node srcNode,int blank){
		System.out.println("\n");
		if(srcNode!=null){
			printGivenNumBlank(blank);
			System.out.print(srcNode.getName());
			if(srcNode.getValue()!=null && !srcNode.getValue().equals("")){
				System.out.print("    "+srcNode.getValue());
			}
			for(Node child:srcNode.getChild()){
				show(child,blank*2);
			}
		}
	}
	
	public void result(){
		show(root,2);
	}
}


