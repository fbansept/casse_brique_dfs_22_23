import java.awt.*;
import java.util.Random;

public class Balle extends Sprite {

    private int vitesseHorizontal;
    private int vitesseVertical;
    private int diametre;

    public static final int BALLE_DIAMETRE_DEFAUT = 20;
    public static final int BALLE_VITESSE_DEFAUT = 5;
    public static final Color BALLE_COULEUR_DEFAUT = Color.RED;

    public Balle() {

        diametre = (int)(Math.random() * 40 + 10);
        x = (int)(Math.random() * Fenetre.LARGEUR - diametre);
        y = (int)(Math.random() * Fenetre.HAUTEUR - diametre);

        setVitesseHorizontal((int)(Math.random() * 12 - 6));
        setVitesseVertical((int)(Math.random() * 12 - 6));

        couleur = new Color(
                (float)Math.random(),
                (float)Math.random(),
                (float)Math.random());
    }

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
        dessin.setColor(couleur);
        dessin.fillOval(x, y, diametre, diametre);
    }

    public int getVitesseHorizontal() {
        return vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        if(vitesseHorizontal == 0){
            vitesseHorizontal = 1;
        }
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        if(vitesseVertical == 0){
            vitesseVertical = 1;
        }
        this.vitesseVertical = vitesseVertical;
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }
}
