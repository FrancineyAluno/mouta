package br.com.mouta.www.codigoscursos;

public class Professor extends Pessoa{
    private String Discplina;
    private float salario;
    private String AreaAtuacao;
    
    public void setDiscplina(String disciplina){
        this.Discplina = disciplina;
    }
    public String getDisciplina(){
        return Discplina;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
    public void setAreaAtuacao(String AreaAtuacao){
        this.AreaAtuacao = AreaAtuacao;
    }
    public String getAreaAtuacao(){
        return AreaAtuacao;
    }

    @Override
    public void ExibirDados() {
        System.err.println("========Dados do Professor========"); 
        System.out.println("| Nome do Professor "+getNome());
        System.out.println("| Idade do Professor "+getIdade());
        System.out.println("| CPF do Professor "+getCpf());
        System.out.println("| Endereço do Professor "+getEndereco());
        System.out.println("| Salário do Professor "+getSalario());
        System.out.println("");
        System.out.println("| Área de Atuação do Professor "+getAreaAtuacao());
    }
}
