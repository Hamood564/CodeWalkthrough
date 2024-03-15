package part;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import de.javagl.obj.Obj;
import de.javagl.obj.ObjReader;

public class partread {
	public static void main(String[] args) throws Exception {
		//read obj file
		InputStream objInputStream = new FileInputStream("./src/data/simpleSample.obj");
		Obj obj = ObjReader.read(objInputStream);
		
		//Accessing elements of obj files
		System.out.println(obj.getVertex(0));
		System.out.println(obj.getTexCoord(0));
		System.out.println(obj.getNormal(0));
		System.out.println(obj.getFace(0));
        System.out.println(obj.getGroup(0));
        System.out.println(obj.getMaterialGroup(0));
	}

}
