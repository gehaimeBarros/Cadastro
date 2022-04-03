import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Usuarios {

	private String email;
	private String nome;
	private Object sexo;
	private int idade;


	@Override
	public String toString() {
		return "\t\t\tInformação do Usuario\n\nE-mail: " + email + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: "
				+ idade + "\n\n\t\tAperte enter\n\n]";
	}

	public static void main(String[] args) {
		List<Usuarios> listaUsuario = new ArrayList<Usuarios>();
		Object[] sexo = { "Masculino", "Feminino" };
		Object sexo2;
		Object menu2;

		do {

			Object[] menu = { "cadastrar", "cadastrados", "sair" };
			menu2 = JOptionPane.showInputDialog(null, "menu", "", JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);

			if (menu2.equals("cadastrar")) {
				Usuarios userInfo = new Usuarios();

				userInfo.setNome(JOptionPane.showInputDialog("Seu nome"));
				userInfo.setEmail(JOptionPane.showInputDialog("Seu E-mail"));
				userInfo.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Sua idade")));
				userInfo.setSexo(sexo2 = JOptionPane.showInputDialog(null, "Sexo", "", JOptionPane.INFORMATION_MESSAGE,
						null, sexo, sexo[0]));

				listaUsuario.add(userInfo);
			} else if (menu2.equals("cadastrados")) {
				if (listaUsuario.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum usuario, cadastrado");
				} else {
					JOptionPane.showMessageDialog(null, listaUsuario.toString());
				}
			}
		} while (menu2 != "0");

	}

}
