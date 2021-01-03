package MusicTag; // Ŭ����(interface, enum..)�� �������μ� �ϳ��� ���丮(����)�̴�.

import java.io.File;
import java.util.Scanner;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.id3.ID3v1Tag;


public class Music {
	public static String decoding = "ISO-8859-1";  
	public static String encoding = "EUC-KR"; 
	
	public static void main(String args[]){
		//renameFile("NAAN.mp3","aa.mp3");
		
		/* get input from std
		Scanner console = new Scanner(System.in);
		System.out.print("Enter song name: ");
		String song = console.nextLine();	  
		File file = new File("C:\\Users\\82107\\Desktop\\Github\\Music_Tag_Editor\\MusicTagEditor\\"+ song + ".mp3");  // MP3 ������ ��θ� �̿��Ͽ� File Object�� �����Ѵ�.  		  
		*/
		
		String path = "C:\\Users\\82107\\Desktop\\Github\\Music_Tag_Editor\\MusicTagEditor\\BRLLNT - Blessed.mp3";
		rewriteTag(path);
		
	}
    
   
	
	public static void renameFile(String filename, String newFilename) {
	    File file = new File( filename );
	    File fileNew = new File( newFilename );
	    if( file.exists() ) file.renameTo( fileNew );
	}
	
	public static void rewriteTag(String path) {
		File file = new File(path);  // MP3 ������ ��θ� �̿��Ͽ� File Object�� �����Ѵ�.  		  
		try {  
		    MP3File audioFile = (MP3File)AudioFileIO.read(file);  
		    ID3v1Tag tag = new ID3v1Tag();  
		      
		 //   tag.setTitle(" ");
		 //   tag.setArtist(" ");
		 //   audioFile.setTag(tag);  
		//    AudioFileIO.write(audioFile);
		    
		    
		    tag.setTitle("big");
		    tag.setArtist(new String("��".getBytes(encoding), decoding));      
		    audioFile.setTag(tag);  
		    AudioFileIO.write(audioFile); // ����� ���� write ����� ���������� ����ȴ�. 
		   
		    /*
		    System.out.println("Tag : " + tag);
		    String artist = tag.getFirst(FieldKey.ARTIST);
		    System.out.println("Artist : " + artist);
		    String title = tag.getFirst(FieldKey.TITLE);
		    System.out.println("Title : " + title);
		    */
		} catch (Exception e) {  
		    e.printStackTrace();  
		}  

	}
}
