/* Classe para tocar a doce musica dos anjos */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class musicStuff{
    void playMusic(String musicLocation)
    {
            try
            {
                    File musicPath = new File(musicLocation);
                    if(musicPath.exists())
                    {
                            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                            Clip clip = AudioSystem.getClip();
                            clip.start();
                    }
                    else
                    {
                            System.out.println("Cant find file");
                    }
            }
            catch(Exception ex)
            {
                    ex.printStackTrace();
            }
    }
}

//TODO: Should go into the main:
//      String filepath = "adventure-theme.wav";
//		musicStuff musicObject = new musicStuff();
//		musicObject.playMusic(filepath);