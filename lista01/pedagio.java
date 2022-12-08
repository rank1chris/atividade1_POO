package lista01;

public class pedagio {
    private float taxa;
    private int numeroCarros;
    private float valorColetado;


    /* construtor */
    public pedagio (float taxa, int numeroCarros){
        this.taxa = taxa;
        this.numeroCarros = numeroCarros;
        this.valorColetado = 0;
    }


    /* funcao somatória */
    public void passaCarro(){
        numeroCarros++;
        valorColetado += taxa;
    }


    /* exibir valores */
    public void exibe(){
       System.out.format("Numero de carros: %d\n", numeroCarros);
       System.out.format("Valo coletado: R$ %.2f", valorColetado);
    }
}
