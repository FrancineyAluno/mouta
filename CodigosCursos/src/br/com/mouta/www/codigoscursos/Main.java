package br.com.mouta.www.codigoscursos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno alu = new Aluno();
        
        /*System.out.println("Qual o nome do professor");
        String nomeProf = entrada.nextLine();
        prof.setNome(nomeProf);
        System.out.println("Qual o CPF do professor");
        String cpfProf = entrada.nextLine();
        prof.setCpf(cpfProf);
        System.out.println("Qual o endereço do professor");
        String endProf = entrada.nextLine();
        prof.setEndereco(endProf);
        System.out.println("Qual a disciplina do professor");
        String disp = entrada.nextLine();
        prof.setDiscplina(disp);
        System.out.println("Qual a área de atuação do professor");
        String area = entrada.nextLine();
        prof.setAreaAtuacao(area);
        System.out.println("Qual a idade do professor");
        int idadeProf = entrada.nextInt();
        prof.setIdade(idadeProf);
        System.out.println("Qual o salário do professor");
        float sal = entrada.nextFloat();
        prof.setSalario(sal);*/
        
        //prof.ExibirDados();
        
        System.out.println("Qual o nome do aluno");
        String nomeAlu = entrada.nextLine();
        alu.setNome(nomeAlu);
        System.out.println("Qual a idade do aluno");
        int idadeAlu = entrada.nextInt();
        alu.setIdade(idadeAlu);
        String limpa = entrada.nextLine();
        alu.setLimpa(limpa);
        System.out.println("Qual o CPF do aluno");
        String cpfAlu = entrada.nextLine();
        alu.setCpf(cpfAlu);
        System.out.println("Qual o endereço do aluno");
        String endAlu = entrada.nextLine();
        alu.setEndereco(endAlu);
        System.out.println("Qual a matricula do aluno");
        String matricula = entrada.nextLine();
        alu.setMatricula(matricula);
        System.out.println("Qual o curso do aluno");
        String curso = entrada.nextLine();
        alu.setCurso(curso);
        
        
        alu.ExibirDados();
    }
}
