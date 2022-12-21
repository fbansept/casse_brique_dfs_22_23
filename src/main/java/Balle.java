import java.awt.*;

public class Balle {

    private int x;
    private int y;
    private int vitesseHorizontal;
    private int vitesseVertical;
    private int diametre;
    private Color couleur;

    public static final int BALLE_DIAMETRE_DEFAUT = 20;
    public static final int BALLE_VITESSE_DEFAUT = 5;
    public static final Color BALLE_COULEUR_DEFAUT = Color.RED;

    public Balle(int x, int y, int diametre , int vitesseHorizontal, int vitesseVertical) {
        this.x = x;
        this.y = y;
        this.diametre = diametre;
        this.vitesseHorizontal = vitesseHorizontal;
        this.vitesseVertical = vitesseVertical;
        this.couleur = BALLE_COULEUR_DEFAUT;
    }

    public Balle(int x, int y, int diametre, Color couleur, int vitesseHorizontal, int vitesseVertical) {
        this.x = x;
        this.y = y;
        this.vitesseHorizontal = vitesseHorizontal;
        this.vitesseVertical = vitesseVertical;
        this.diametre = diametre;
        this.couleur = couleur;
    }

    public Balle(int x, int y) {
        this.x = x;
        this.y = y;
        this.couleur = BALLE_COULEUR_DEFAUT;
        this.vitesseVertical = -BALLE_VITESSE_DEFAUT;
        this.vitesseHorizontal = BALLE_VITESSE_DEFAUT;
        this.diametre = BALLE_DIAMETRE_DEFAUT;
    }

    public void mouvement() {
        x += vitesseHorizontal;
        y += vitesseVertical;

        if(x >= Fenetre.LARGEUR - diametre || x <= 0) {
            vitesseHorizontal = -vitesseHorizontal;
        }

        if(y >= Fenetre.HAUTEUR - diametre || y <= 0) {
            vitesseVertical = -vitesseVertical;
        }
    }

    public void dessiner(Graphics2D dessin) {
        dessin.fillOval(x, y, diametre, diametre);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVitesseHorizontal() {
        return vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }
}
