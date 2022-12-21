public class Balle {

    private int x;
    private int y;
    private int vitesseHorizontal;
    private int vitesseVertical;

    public Balle(int x, int y, int diametre , int vitesseHorizontal, int vitesseVertical) {
        this.x = x;
        this.y = y;
        this.vitesseHorizontal = vitesseHorizontal;
        this.vitesseVertical = vitesseVertical;
    }

    public void mouvement() {
        x += vitesseHorizontal;
        y += vitesseVertical;

        if(x >= Fenetre.LARGEUR - 50 || x <= 0) {
            vitesseHorizontal = -vitesseHorizontal;
        }

        if(y >= Fenetre.HAUTEUR - 50 || y <= 0) {
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
}
