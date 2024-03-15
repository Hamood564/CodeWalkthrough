package part;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import de.javagl.obj.Obj;
import de.javagl.obj.ObjReader;
import de.javagl.obj.ObjUtils;
import de.javagl.obj.ObjWriter;

public class partwrite {
	
	public static void main(String[] args) throws Exception {
		//read obj file
		InputStream objInputStream = new FileInputStream("./src/data/simpleSample.obj");
		Obj obj = ObjReader.read(objInputStream);
		
		// Write an OBJ file
        OutputStream objOutputStream = 
            new FileOutputStream("./src/data/simpleSample.obj");
        ObjWriter.write(obj, objOutputStream);
        
       //  triangulates
        System.out.println("Faces before triangulating");
        for (int i = 0; i < obj.getNumFaces(); i++)
        {
            System.out.println(
                "Face " + i + " of " + obj.getNumFaces() + 
                ": " + obj.getFace(i));
        }

        // Triangulate the OBJ
        Obj triangulated = ObjUtils.triangulate(obj);
        
        System.out.println("Faces after triangulating");
        for (int i = 0; i < triangulated.getNumFaces(); i++)
        {
            System.out.println(
                "Face " + i + " of " + triangulated.getNumFaces() + 
                ": " + triangulated.getFace(i));
        }
        
        
        
        
        
	}

	
}
