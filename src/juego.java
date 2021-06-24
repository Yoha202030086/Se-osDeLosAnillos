public class juego {

    private bestias ejercitoBestias[];
    private heroes ejercitoHeroes[];

    private final int CANTIDAD = 5;

    public juego() {
        ejercitoBestias = new bestias[CANTIDAD];
        ejercitoHeroes = new heroes[CANTIDAD];
    }

    public void presentarPersonajes(hpersonaje ejercito[]) {

        if (ejercito.length > 0) {
            String tempo = "";
            if (ejercito[0] instanceof bestias) {
                tempo = "Bestia";
            } else {
                tempo = "Heroe";
            }

            System.out.println("\n Ejercito de " + tempo);

            for (int i = 0; i < ejercito.length; i++) {
                ejercito[i].saludar();
            }

        } else {
            System.out.println("No hay ejercito ");
        }
    }

    public void jugar() {
        System.out.println("Bienvenido-señor de los anillos: \n\n");

        this.inicializarHeroes();
        this.inicializarBestias();

        this.presentarPersonajes(ejercitoBestias);
        this.presentarPersonajes(ejercitoHeroes);

        System.out.println("\n\n\n");
        this.pelea();

    }

    public void pelea() {
        ejercitoBestias[0].recibirAtaque(ejercitoHeroes[0]);
        ejercitoHeroes[0].recibirAtaque(ejercitoBestias[0]);
    }

    public void inicializarHeroes() {
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = dados.tirarDado(0, 2, 1, false);
            switch (random) {
                case 0:
                    ejercitoHeroes[i] = new persona("Persona " + persona.getInstancias());
                    break;
                case 1:
                    ejercitoHeroes[i] = new elfos("Elfo " + elfos.getInstancias());
                    break;
                case 2:
                    ejercitoHeroes[i] = new hobbits("Hobbits " + hobbits.getInstancias());
                    break;
                default:
                    ejercitoHeroes[i] = new elfos("Elfo " + elfos.getInstancias());
                    break;
            }
        }
    }

    public void inicializarBestias() {
        int random = 0;
        for (int i = 0; i < ejercitoHeroes.length; i++) {
            random = dados.tirarDado(0, 1, 1, false);
            switch (random) {
                case 0:
                    ejercitoBestias[i] = new trasgo("Trasgo " + trasgo.getInstancias());
                    break;
                case 1:
                    ejercitoBestias[i] = new orcos("Orcos " + orcos.getInstancias());
                    break;
                default:
                    ejercitoBestias[i] = new orcos("Orcos " + orcos.getInstancias());
                    break;
            }
        }
    }
}