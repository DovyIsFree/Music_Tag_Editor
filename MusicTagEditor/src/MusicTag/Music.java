package MusicTag; // Ŭ����(interface, enum..)�� �������μ� �ϳ��� ���丮(����)�̴�.

import java.io.File;

import javax.swing.text.html.HTML.Tag;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
public class Music {
    File fs;
    
    public static void main(String args[]){
    	//fs = new File("C:\\Users\\82107\\Desktop\\Github\\Plz");
         SearchMp3("C:\\Users\\82107\\Desktop\\Github\\Plz\\NAAN.mp3");//.go();
    	
    }
    
   
    
    public void go(){
        if(fs.isDirectory()){ //�ش� �н����� ���丮(����)�� �����ϴ��� Ȯ��. ������ false ����
            File list[] = fs.listFiles();
            for(File f : list){
                try{
                    MP3File mp3 = (MP3File) AudioFileIO.read(f);
                    AbstractID3v2Tag tag2 = mp3.getID3v2Tag();
                    
                    Tag tag = mp3.getTag();
                    String title = tag.getFirst(FieldKey.TITLE);
                    String artist = tag.getFirst(FieldKey.ARTIST);
                    String album = tag.getFirst(FieldKey.ALBUM);
                    String year = tag.getFirst(FieldKey.YEAR);
                    String genre = tag.getFirst(FieldKey.GENRE);
             
                    System.out.println("Tag : " + tag2);
                    System.out.println("Song Name : " + title);
                    System.out.println("Artist : " + artist);
                    System.out.println("Album : " + album);
                    System.out.println("Year : " + year);
                    System.out.println("Genre : " + genre);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    public void SearchMp3(String path) {
        fs = new File(path);
    }
    
}
