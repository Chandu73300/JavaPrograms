package programlist;

import java.io.*;

public class CollectionArray1 {
	int id;
	String name;
	
	CollectionArray1 (int n, String x) {
		id=n;
		name=x;
	}
	
	void display() {
		System.out.println(id+"\t"+name);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		CollectionArray1 arr[]=new CollectionArray1[2];
		for (int i=0;i<2;i++) {
			System.out.println("Enter ID:");
			int d=Integer.parseInt(br.readLine());
			System.out.println("Enter name:");
			String s=br.readLine();
			arr[i]=new CollectionArray1(d,s);
		}
		for (int i=0;i<2;i++){
			arr[i].display();
		}

	}

}
