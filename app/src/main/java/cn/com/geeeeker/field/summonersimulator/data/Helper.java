package cn.com.geeeeker.field.summonersimulator.data;


import android.content.Context;
import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Helper {

    Context context_this;
    public Helper(Context context){
        context_this=context;
    }

    public Helper(){}

	public ArrayList<Object> readSer(String fileName)  {
		
		ArrayList o = new ArrayList();

		try {
			FileInputStream fileStream = context_this.openFileInput(fileName);
			ObjectInputStream os = new ObjectInputStream(fileStream);
			o =  (ArrayList) os.readObject();
			os.close();
		} catch (FileNotFoundException e) {
//			新建一个文件
            FileOutputStream fileos = null;
            try{
                fileos=context_this.openFileOutput(fileName, Context.MODE_APPEND);
            }catch(FileNotFoundException f){
                Log.e("FileNotFoundException", "can't create FileOutputStream");
            }
		}catch (Exception e){

        }

		return o;
	}


	public boolean saveSer(String fileName, ArrayList o) {
		try {
			FileOutputStream fileStream = context_this.openFileOutput(fileName,Context.MODE_APPEND);
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(o);
			os.close();
            return true;
		} catch (Exception e) {
            return false;
		}
	}

}
