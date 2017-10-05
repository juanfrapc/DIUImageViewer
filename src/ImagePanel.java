
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(String path) {
        System.out.println("esto es una prueba");
        try {
            this.image = ImageIO.read(new File(path));
        } catch (IOException ex) {
            System.out.println("NO existe la imagen");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("hola");
        g.drawImage(image, 0, 0, null);
    }

    
    
}
