public class lutador {
    
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    // Métodos
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " Anos");
        System.out.println(getAltura() + " M de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias() + " Lutas");
        System.out.println("Perdeu: " + getDerrotas() + " Lutas");
        System.out.println("Empatou: " + getEmpate() + " Lutas" );
    
    };
    public void status(){
        System.out.println("----------------------------------");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpate() + " Empates" );
    };
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    };
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    };
    public void empatarLuta(){
        setEmpate(getEmpate()+1);
    };
   
    // Métodos especiais
    public lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empate = em;

    };
    
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido!";
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpate(){
        return empate;
    }
    public void setEmpate(int em){
        this.empate = em;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(int al){
        this.altura = al;
    }
}
