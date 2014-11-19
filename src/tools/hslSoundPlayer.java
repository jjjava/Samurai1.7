package tools;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Hudson Schumaker
 */
public class hslSoundPlayer implements Runnable {

    private String name;

    public hslSoundPlayer(String name) {
        this.name = name;
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            URL url = this.getClass().getClassLoader().getResource("res/audio/" + name);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
        }
    }
}