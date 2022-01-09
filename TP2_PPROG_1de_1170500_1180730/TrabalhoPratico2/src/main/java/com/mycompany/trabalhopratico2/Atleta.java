package com.mycompany.trabalhopratico2;

import static com.mycompany.trabalhopratico2.InterfaceAtleta.CAMINHADA;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.CICLISMO;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.CORRIDA;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.IT1;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.IT2;
import static com.mycompany.trabalhopratico2.InterfaceAtleta.FCRPadrao;

/**
 *
 * @author Hugo
 */
public abstract class Atleta {
    /**
    * nome do atleta
    */
    private String nome;
    /**
     * ID do atleta
     */
    private int ID;
    /**
     * género do atleta
     */
    private String genero;
    /**
     * idade do atleta
     */
    private int idade;
    /**
     * atividade praticada pelo atleta
     */
    private String atividade;   
    /**
     * valor mensal arrecadado pelo atleta
     */
    private double valorMensal;
    
    /**
     * valor do nome por omissão
     */
    private static final String NOME_BY_OMISSION = "Sem nome";
    /**
     * valor do ID por omissão
     */
    private static final int ID_BY_OMISSION = 0;
    /**
    * valor do género por omissão
    */
    private static final String GENERO_BY_OMISSION = "Sem género";
    /**
     * valor da idade por omissão
     */
    private static final int IDADE_BY_OMISSION = 0;
    /**
     * valor da atividade por omissão
     */
    private static final String ATIVIDADE_BY_OMISSION = "Sem atividade";
    /**
     * valor do valor mensal por omissão
     */
    private static final double VALORMENSAL_BY_OMISSION = 0;
    /**
     * variavel que conta o número total de atletas
     */
    private static int totalAtletas = 0;
     

    /**
     * Construtor completo
     *
     * @param nome - nome do atleta
     * @param ID - ID do atleta
     * @param genero - genero do atleta
     * @param idade - idade do atleta
     * @param atividade - desporto que o atleta pratica
     * @param valorMensal - Valor mensal arrecadado em prémios pelo atleta
     */
    
    public Atleta(String nome, int ID, String genero, int idade, String atividade, double valorMensal ) {
        this.nome = nome;
        this.ID = ID;
        this.genero = genero;
        this.idade = idade;
        this.atividade = atividade;
        this.valorMensal = valorMensal;
        totalAtletas++;
    }

    /**
     * Construtor vazio
     */
    public Atleta() {
        nome = NOME_BY_OMISSION;
        ID = ID_BY_OMISSION;
        genero = GENERO_BY_OMISSION;
        idade = IDADE_BY_OMISSION;
        atividade = ATIVIDADE_BY_OMISSION;
        valorMensal = VALORMENSAL_BY_OMISSION;
        totalAtletas++;
            }

    /**
     * Metodo para obter o nome do atleta
     *
     * @return o nome do atleta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo para obter o ID do atleta
     *
     * @return o ID do atleta
     */

    public int getID() {
        return ID;
    }

    /**
     * Metodo para obter o genero do atleta
     * @return o genero do atleta
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Metodo para obter a idade do atleta
     * @return a idade do atleta
     */
    public int getIdade() {
        return idade;
    }
    /**
     * Metodo para obter o desporto praticado pelo atleta
     * @return o desporto praticado pelo atleta
     */
    public String getAtividade() {
        return atividade;
    }
    /**
     * Método para obter o valor mensal recebido pelo atleta.
     * @return o valorMensal
     */
    public double getValorMensal() {
        return valorMensal;
    }
    /**
     * Método para obter o total de atletas
     * @return O número total de atletas.
     */
    public static int getTotalAtletas(){
         return totalAtletas;
     }
    /**
     * MÃ©todo para mudar o nome do atleta
     * @param nome - nome do atleta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Metodo para mudar o ID do atleta
     * @param ID - ID do atleta
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Metodo para mudar o genero do atleta
     * @param genero - genero do atleta
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Metodo para mudar a idade do atleta
     * @param idade - idade do atleta
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * Metodo para mudar o desporto praticado pelo atleta
     * @param atividade - desporto praticado pelo atleta
     */
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    /**Método para mudar o valor mensal recebido pelo atleta
     * @param valorMensal - Valor mensal recebido em prémios pelo atleta
     */
    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }   

    /**
     * Metodo para imprimir os atributos de um atleta
     * @return 
     */
    @Override
    public String toString() {
        return "Atleta:" + "nome=" + nome + ", ID=" + ID + ", genero=" + genero + ", idade=" + idade + 
                ", atividade=" + atividade ;
    }

    
    /**
     * Metodo para calcular Frequencia Cardiaca Maxima
     * @return a FCM
     */
    public double calcFCM(){
        if (atividade.equals(CAMINHADA) || atividade.equals(CORRIDA)){
         return 208.75 - (0.73 * idade);   
        } else if(atividade.equals(CICLISMO) && genero.equals("feminino")) {
            return 189 - (0.56*idade);
        } else if (atividade.equals(CICLISMO) && genero.equals("masculino")){
            return 202 - (0.72 * idade);
        } else{
            return 204 - (1.7 * idade);
        }       
    }
    /**
     * Metodo para calcular a Frequencia Cardiaca de Trabalho     
     * @return o valor do FCT.
     */
    public String calcFCT(){
        return String.format("para queima : %f | para cardio : %f", FCRPadrao + (IT1 * (calcFCM() - FCRPadrao)), FCRPadrao + (IT2 * (calcFCM() - FCRPadrao)));
    }
    
    /**
     * Método para calcular o valor mensal de um atleta.
     * @param A1 Atleta
     * @return o valor de pagamento mensal.
     */
    
    public int compareTo(Atleta A1) {
      return nome.compareToIgnoreCase(A1.nome);
    }
     abstract double calcularPagamentoMensal();
       
}

    

