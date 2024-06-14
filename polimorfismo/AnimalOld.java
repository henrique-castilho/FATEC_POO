public class AnimalOld {

    private String nome;
    //1: Gato
    //2: Cachorro
    //3: Pato
    private int tipo;

    public void falar(){
        //Esse código viola o princípio aberto/fechado
        if(getTipo() == 1)
            System.out.println("Miau");
        else if (getTipo() == 2)
            System.out.println("Au");
        else if (getTipo() == 3)
            System.out.println("Quack");
    }

    public int getTipo(){
        return tipo;
    }

    public void serTipo(int tipo){
        this.tipo = tipo;
    }
}