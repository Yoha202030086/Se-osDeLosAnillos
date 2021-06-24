
    public class heroes extends hpersonaje {

        private static int ataqueMaximo = 100;
    
        private static int instanciasHeroes;
    
        public heroes(int vida, int armadura, String nombre){
            super(vida, armadura, ataqueMaximo, nombre, true);
            heroes.instanciasHeroes++;
        }
    
        public static int getInstancias(){
            return heroes.instanciasHeroes;
        }
    
        @Override
        public int getAtaque(){
            return dados.tirarDado(0, heroes.ataqueMaximo, 2, true);
        }
        
    }

