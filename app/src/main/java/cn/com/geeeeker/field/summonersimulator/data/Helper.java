package cn.com.geeeeker.field.summonersimulator.data;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Helper {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<Object> readSer(String fileName) {
		
		ArrayList o = new ArrayList();

		try {
			FileInputStream fileStream = new FileInputStream(fileName);
			ObjectInputStream os = new ObjectInputStream(fileStream);
			o =  (ArrayList) os.readObject();
			os.close();
		} catch (Exception e) {
//			e.printStackTrace();
			
		}

		return o;
	}

	@SuppressWarnings("rawtypes")
	public void saveSer(String fileName, ArrayList o) {
		try {
			FileOutputStream fileStream = new FileOutputStream(fileName);
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(o);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
