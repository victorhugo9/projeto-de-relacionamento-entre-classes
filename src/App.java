public class App {
    public static void main(String[] args) throws Exception {
        
        lutador l[] = new lutador[3];
        
        l[0] = new lutador("Victor Belord","Brazil", 29, 1.75f, 66.2f, 11, 0, 2);

        l[1] = new lutador("Putscript", "Belgica", 29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new lutador("Snapshadow", "EUA", 35, 1.65f, 100.9f, 12, 2, 1);

        luta UFC01 = new luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();
        
        l[0].status();
        l[1]. status();
    }
}
