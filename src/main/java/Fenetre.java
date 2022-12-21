import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fenetre extends Canvas {

    public static final int LARGEUR = 500;
    public static final int HAUTEUR = 600;

    public ArrayList<Balle> listeBalle = new ArrayList<>();

    Fenetre() throws InterruptedException {

        JFrame fenetre = new JFrame("Casse brique");
        //On récupère le panneau de la fenetre principale
        JPanel panneau = (JPanel) fenetre.getContentPane();
        //On définie la hauteur / largeur de l'écran
        panneau.setPreferredSize(new Dimension(LARGEUR, HAUTEUR));
        setBounds(0, 0, LARGEUR, HAUTEUR);
        //On ajoute cette classe (qui hérite de Canvas) comme composant du panneau principal
        panneau.add(this);

        fenetre.pack();
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenetre.requestFocus();

        //On indique que le raffraichissement de l'ecran doit être fait manuellement.
        createBufferStrategy(2);
        setIgnoreRepaint(true);
        setFocusable(false);

        demarrer();
    }

    public void demarrer() throws InterruptedException {

        for(int i = 0 ; i< 100; i++) {
            listeBalle.add(new Balle());
        }

        while(true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();
            //-----------------------------

            dessin.setColor(Color.WHITE);
            dessin.fillRect(0,0,LARGEUR,HAUTEUR);

            for(Balle balle : listeBalle) {
                balle.mouvement();
                balle.dessiner(dessin);
            }

            //-----------------------------
            dessin.dispose();
            getBufferStrategy().show();
            Thread.sleep(1000 / 60);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Fenetre();
    }

}
