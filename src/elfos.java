
    public class elfos extends heroes {

        public elfos(String nombre){
            super(250, 60, nombre);
        }
    
        @Override
        public void saludar(){
            System.out.println("Hola soy elfo y mi nombre es  " + this.nombre);
        }
    
        @Override
        public int obtenerAtaque(hpersonaje defensor){
            if (defensor instanceof orcos){
                System.out.println(" "+ this.getNombre() + " furia elfica ");
                return this.getAtaque() + 10;
    
            }
            
            return this.getAtaque();
        }
    }

