import java.awt.*;

public class Barre extends Sprite implements Dessinable {

    private int largeur = 200;
    private int hauteur = 30;

    public Barre() {
        x = Fenetre.LARGEUR / 2 - largeur / 2;
        y = Fenetre.HAUTEUR - 50;
        couleur = Color.BLUE;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect(x,y,largeur,hauteur);
    }
}
