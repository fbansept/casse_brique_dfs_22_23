import java.awt.*;

public abstract class Rectangle extends Sprite{

    protected int largeur = 200;
    protected int hauteur = 30;

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect(x,y,largeur,hauteur);
    }
}
