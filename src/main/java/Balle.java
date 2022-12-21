public class Balle {

    private int x;
    private int y;
    private int vitesseHorizontal;
    private int vitesseVertical;

    private int diametre;

    public Balle(int x, int y, int diametre , int vitesseHorizontal, int vitesseVertical) {
        this.x = x;
        this.y = y;
        this.diametre = diametre;
        this.vitesseHorizontal = vitesseHorizontal;
        this.vitesseVertical = vitesseVertical;
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
