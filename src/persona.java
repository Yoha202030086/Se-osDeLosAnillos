
    public class persona extends heroes {

        private static int contadorInstancias;
    
        public persona(String nombre){
            super(180,75,nombre);
            persona.contadorInstancias++;
        }
    
        public static int getInstancias(){
            return contadorInstancias;
        }
        
    
        
    }

