package br.projeto.modelo;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class FormMenu {
	public static void main(String args[]) {
		int opcaoMenu = 0;
		int codigoPaciente;
		String nome;
		Paciente paciente;
		Queue<Paciente> fila = new LinkedList<Paciente>();
		do {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"**********************\n" + "Menu Opções: \n" 
							+ "1 - Inserir paciente \n"
							+ "2 - Chamar paciente para ser atendido: \n" 
							+ "3 - Existem pacientes na fila? \n" 
							+ "4 - Proximo paciente a ser atendido: \n"
							+ "5 - Quantos pacientes estão na fila? \n"
							+ "6 - Sair",
					"Consultório Médico", JOptionPane.INFORMATION_MESSAGE));
			switch (opcaoMenu){
			case 1:
				codigoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do "
						+ "paciente: ",
						"Consultorio Medico"));
				paciente = new Paciente();
				paciente.setCodigoPaciente(codigoPaciente);
				paciente.setNome (nome);
				fila.offer(paciente);
							
			break;
			case 2:
				paciente = fila.poll();
				Integer.parseInt(JOptionPane.showMessageDialog(null,(codigoPaciente)));
				System.out.println(fila.peek());
			
			break;
			case 3:
				codigoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do paciente: ",
						"Consultorio Medico"));
				fila.offer(codigoPaciente);
			
			break;
			case 4: 
				codigoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do paciente: ",
						"Consultorio Medico"));
				fila.offer(codigoPaciente);
				
				break;
				
			case 5: 
				codigoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do paciente: ",
						"Consultorio Medico"));
				fila.offer(codigoPaciente);
				
				break;
			case 6: 
				
			
			default: {
				for (Paciente umPaciente : fila){
					System.out.println(umPaciente);
				}
			}
				
			
		
			}
		} while (opcaoMenu != 6);

	
	}
}

