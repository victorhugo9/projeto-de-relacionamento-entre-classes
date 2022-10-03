import java.util.Random;

public class luta {
    // Atributos
    private lutador desafiado;
    private lutador desafiante;
    private int rounds;
    private boolean aprovada; 

    // Métodos
    public void marcarLuta(lutador l1, lutador l2){
        if(l1.getCategoria() == (l2.getCategoria()) 
            && l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
            } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            }
    };

    public void lutar(){

        if(this.aprovada){
            System.out.println("--------- DESAFIADO --------");
            desafiado.apresentar();
            System.out.println("--------- DESAFIANTE -------");
            desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 ou 2
            System.out.println("=========== RESULTADO DA LUTA ===========");
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria de " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                   
                    break;
                case 2:
                    System.out.println("Vitória de " + desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                     
                    break;
            }
            System.out.println("=========== =================== ===========");

        } else{
            System.out.println("A luta não pode acontecer!");
        }

    };

    // Métodos especiais
    public void setDesafiado(lutador dd){
        this.desafiado = dd;
    };
    public lutador getDesafiado(){
        return desafiado;
    };
    public void setDesafiante(lutador df){
        this.desafiante = df;
    }
    public lutador getDesafiante(){
        return desafiante;
    }
    public void setRounds(int r){
        this.rounds = r;
    }
    public int getRounds(){
        return rounds;
    }
    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }
    public boolean getAprovada(){
        return aprovada;
    }
}
