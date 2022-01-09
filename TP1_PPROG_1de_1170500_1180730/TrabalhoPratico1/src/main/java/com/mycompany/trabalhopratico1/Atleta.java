package com.mycompany.trabalhopratico1;

/**
 *
 * @author Hugo
 */
public abstract class Atleta {

    private String nome;
    private int ID;
    private String genero;
    private int idade;
    private String atividade;   
    private double valorMensal;
    
    private final String CAMINHADA = "Caminhada";
    private final String CORRIDA = "Corrida";
    private final String CICLISMO = "Ciclismo";
    private final String NATACAO = "Natação";

    private static final String NOME_BY_OMISSION = "Sem nome";
    private static final int ID_BY_OMISSION = 0;
    private static final String GENERO_BY_OMISSION = "Sem género";
    private static final int IDADE_BY_OMISSION = 0;
    private static final String ATIVIDADE_BY_OMISSION = "Sem atividade";
    private static final double VALORMENSAL_BY_OMISSION = 0;
    private static int totalAtletas = 0;
    private static int FCRPadrao = 80;
    private static double ITQueimaGordura = 0.6;
    private static double ITCapacidadeCardio = 0.75;
    

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
     * Método para mudar o valor do FCR.
     * @param FCRPadrao - Frequência cardiaca em repouso
     */
    public static void setFCRPadrao(int FCRPadrao) {
        Atleta.FCRPadrao = FCRPadrao;
    }

    /**
     * Método para mudar o valor do IT para queima de gordura
     * @param ITQueimaGordura - Valor de IT (intensidade de treino) para a queima de gordura
     */
    public static void setITQueimaGordura(double ITQueimaGordura) {
        Atleta.ITQueimaGordura = ITQueimaGordura;
    }

    /**
     * Método para mudar o valor do IT para a capicade da cardio
     * @param ITCapacidadeCardio - Valor de IT (intensidade de treino) para a capacidade de cardio
     */
    public static void setITCapacidadeCardio(double ITCapacidadeCardio) {
        Atleta.ITCapacidadeCardio = ITCapacidadeCardio;
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
     * @param it - Intensidade de treino
     * @return o valor do FCT.
     */
    public double calcFCT(double it){
        return FCRPadrao + (it * (calcFCM() - FCRPadrao));
    }
    @Override
    /**
     * Metodo para imprimir os dados de um atleta
     */
    public String toString() {
        return "Atleta:" + "nome=" + nome + ", ID=" + ID + ", genero=" + genero + ", idade=" + idade + 
                ", atividade=" + atividade + ", FCM=" + calcFCM() + ", FCT para queima de gordura=" + calcFCT(ITQueimaGordura)
                + ", FCT para capacidade cardiorrespiratória=" + calcFCT(ITQueimaGordura);
    }
    /**
     * Método para calcular o valor mensal de um atleta.
     * @return o valor de pagamento mensal.
     */
    
     abstract double calcularPagamentoMensal();
       
}

    

