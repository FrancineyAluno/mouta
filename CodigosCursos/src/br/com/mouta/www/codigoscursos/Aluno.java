package br.com.mouta.www.codigoscursos;

public class Aluno extends Pessoa{
	private String matricula;
    private String curso;
    private String limpa;
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }
    public void setLimpa(String limpa){
        this.limpa = limpa;
    }
    public String getLimpa(){
        return limpa;
    }
    
    @Override
    public void ExibirDados() {
        System.out.println("========Dados do Aluno========"); 
        System.out.println("| Nome do Aluno "+getNome());
        System.out.println("| Idade do Aluno "+getIdade());
        System.out.println("| CPF do Aluno "+getCpf());
        System.out.println("| Endereço do Aluno "+getEndereco());
        System.out.println("| Matricula do Aluno "+getMatricula());
        System.out.println("| Curso do Aluno "+getCurso());
        
    }
}
