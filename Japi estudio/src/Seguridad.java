import javax.swing.JOptionPane;

public class Seguridad {
    String res;
    public void validarUsuario(String usuarios[],String user,String pwd, int intentos) {
        boolean encontrado = false;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equals(pwd)) {
                res = "Bienvenido a Japi estudio"+user;
                encontrado=true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesión ", JOptionPane.INFORMATION_MESSAGE);
                Usuario frameUsuario = new Usuario();
                frameUsuario.setVisible(true);
            }
        }

        if (encontrado==false) {
            res="El usuario o la contraseña es incorrecto. \nIntento número "+intentos;
            JOptionPane.showMessageDialog(null, res, "Inicio de sesión ", JOptionPane.ERROR_MESSAGE);
        }
        if (intentos>4) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará", "Inicio de sesión ", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}