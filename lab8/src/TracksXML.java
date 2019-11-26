
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;
import java.util.List;



public class TracksXML {
    final static String FILENAME="src/lab8/TaskB/Tracks.xml";
    public static void serialize(List<Track> toys) throws FileNotFoundException{
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(FILENAME)));
        encoder.writeObject(toys);
        encoder.close();
    }
    public  static  List<Track> deserialize() throws FileNotFoundException {
        XMLDecoder decoder= new XMLDecoder(new BufferedInputStream(new FileInputStream(FILENAME)));
        return (List<Track>)decoder.readObject();
    }
}
