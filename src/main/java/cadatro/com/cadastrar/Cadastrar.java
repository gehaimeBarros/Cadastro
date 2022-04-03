package cadatro.com.cadastrar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import cadastro.informacoes.Endereco;
import cadastro.informacoes.Pessoa;

/**
 * 
 * @author Gehaime B.
 *
 */

public class Cadastrar {

	private static Pessoa userinfo = new Pessoa();
	private static Endereco userEndereco = new Endereco();

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		List<Pessoa> listaUsuario = new ArrayList<Pessoa>();
		List<Endereco> listaEndereco = new ArrayList<Endereco>();

		Object[] sexo = { "Masculino", "Feminino" };
		Object sexo2;
		Object menu2;
		Calendar c1;
		String nome;
		int hora;
		c1 = Calendar.getInstance();
		hora = c1.get(Calendar.HOUR_OF_DAY);
		String link = ("C:\\JavaProjetos\\cadatro.com\\src\\main\\java\\img\\icons-empresa.png");

		nome = JOptionPane.showInputDialog(null, "Digite seu nome.", "Super Registration", JOptionPane.CLOSED_OPTION);

		if (hora > 6 && hora < 12) {
			JOptionPane.showMessageDialog(null, "Olá, bom dia.", "Super Registration", JOptionPane.CLOSED_OPTION);
		} else if (hora > 12 && hora < 18) {
			JOptionPane.showMessageDialog(null, "Olá, boa Tarde.", "Super Registration", JOptionPane.CLOSED_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "Olá, boa noite.", "Super Registration", JOptionPane.CLOSED_OPTION);
		}

		do {

			Object[] menu = { "cadastrar", "cadastrados", "sair" };
			menu2 = JOptionPane.showInputDialog(null, "menu", "Super Registration", JOptionPane.CLOSED_OPTION, null,
					menu, menu[0]);

			if (menu2.equals("cadastrar")) {

				userinfo.setNome(JOptionPane.showInputDialog(null, "Seu nome.", nome));
				userinfo.setEmail(JOptionPane.showInputDialog(null, "Seu E-mail.", "Super Registration",
						JOptionPane.CLOSED_OPTION));
				userinfo.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Sua idade.", "Super Registration",
						JOptionPane.CLOSED_OPTION)));
				userinfo.setSexo(sexo2 = JOptionPane.showInputDialog(null, "Sexo.", "Super Registration",
						JOptionPane.CLOSED_OPTION, null, sexo, sexo[0]));
				JOptionPane.showMessageDialog(null, "Agora " + nome + ", vamos colocar seu endereço.",
						"Super Registration", JOptionPane.CLOSED_OPTION);
				userEndereco.setRua(
						JOptionPane.showInputDialog(null, "Rua.", "Super Registration", JOptionPane.CLOSED_OPTION));
				userEndereco.setBairro(
						JOptionPane.showInputDialog(null, "Bairro.", "Super Registration", JOptionPane.CLOSED_OPTION));
				userEndereco.setEstado(
						JOptionPane.showInputDialog(null, "Estado.", "Super Registration", JOptionPane.CLOSED_OPTION));
				userEndereco.setNumeroRecidencial(Integer.parseInt(
						JOptionPane.showInputDialog(null, "Numero.", "Super Registration", JOptionPane.CLOSED_OPTION)));

				listaUsuario.add(userinfo);
				listaEndereco.add(userEndereco);
				
			} else if (menu2.equals("cadastrados")) {
				if (listaUsuario.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum usuario, cadastrado. Cadastre um.",
							"Super Registration", JOptionPane.CLOSED_OPTION);
				} else {
					JOptionPane.showMessageDialog(null, listaUsuario.toString() + listaEndereco.toString(),
							"Super Registration", JOptionPane.CLOSED_OPTION, new ImageIcon(link));
				}
			} else if (menu2.equals("sair")) {
				JOptionPane.showMessageDialog(null, "Sistema Encerrado.", "Super Registration",
						JOptionPane.CLOSED_OPTION);
				System.exit(0);
			}
		} while (menu2 != "0");

	}
}