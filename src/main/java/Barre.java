import java.awt.*;

public class Barre extends Rectangle {

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


}
