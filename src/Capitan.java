public class Capitan {

        private String nombre;
        private String apellido;
        private String matriculaNav;

        public Capitan(String nombre, String apellido, String matriculaNav) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.matriculaNav = matriculaNav;
        }

        public String muestraDatos(){
                return "Nombre: "+ this.nombre + "\nApellido: "+ this.apellido + "\nMatricula navegación: "+ this.matriculaNav;
        }

}
