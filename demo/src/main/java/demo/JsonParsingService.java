package demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParsingService {
	
	public String parseToService(Student stud) {
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(stud);
	}
	
//	public Student jsonToJava(String str) {
//		Gson gson=new Gson();
//		return gson.fromJson(str);
//		
//	}
}
