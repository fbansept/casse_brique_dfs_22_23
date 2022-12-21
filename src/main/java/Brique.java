import java.awt.*;

public class Brique extends Rectangle{

    protected int points = 100;
    protected int vie = 1;

    public final static int LARGEUR_DEFAUT = 40;
    public final static int HAUTEUR_DEFAUT = 30;

    public Brique(int x, int y , Color couleur) {
        this.x = x;
        this.y = y;
        this.largeur = LARGEUR_DEFAUT;
        this.hauteur = HAUTEUR_DEFAUT;
        this.couleur = couleur;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }
}
