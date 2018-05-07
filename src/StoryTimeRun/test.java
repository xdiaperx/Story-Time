package StoryTimeRun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {
	
	private static int mem = 3;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
			Member newMemb = new Member("fuck", "shit", "crack", "mate");
			Member newMemb2 = new Member("ass", "brown", "poop", "wtf");
			Member newMemb3 = new Member("pussy", "popper", "supreme", "garb");
			FileOutputStream strm = new FileOutputStream("membs.txt", true);
			ObjectOutputStream out = new ObjectOutputStream(strm);
			out.writeObject(newMemb);
			out.writeObject(newMemb2);
			out.writeObject(newMemb3);
			out.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("membs.txt"));
		for(int i = 0; i < mem; i++) {
			Member p2 = (Member) in.readObject();
			System.out.println(p2.getfName());
		}
		in.close();
	}
}
