package MusicTag; // Ŭ����(interface, enum..)�� �������μ� �ϳ��� ���丮(����)�̴�.

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//import java.io.File;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;

public class Music {
	//File fs;

	public static void main(String args[]){
		renameFile("NAAN.mp3","aa.mp3");
	
	}
	
	public static void renameFile(String filename, String newFilename) {
	    File file = new File( filename );
	    File fileNew = new File( newFilename );
	    if( file.exists() ) file.renameTo( fileNew );
	}
}
