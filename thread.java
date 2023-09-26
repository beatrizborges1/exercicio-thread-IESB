public class thread {

    public static void main(String[] args) {
        Thread nomeThread = new Thread(new NomeThread("Beatriz"));
        Thread idadeThread = new Thread(new IdadeThread(18));
        Thread cidadeThread = new Thread(new CidadeThread("Brasília"));

        nomeThread.start();
        idadeThread.start();
        cidadeThread.start();

        try {
            nomeThread.join();
            idadeThread.join();
            cidadeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fim do processo! :)");
    }
}

class NomeThread implements Runnable {
    private String nome;

    public NomeThread(String nome) {
        this.nome = nome;
    }

    public void run() {
        System.out.println("Meu nome é: " + nome);
    }
}

class IdadeThread implements Runnable {
    private int idade;

    public IdadeThread(int idade) {
        this.idade = idade;
    }

    public void run() {
        System.out.println("Tenho " + idade + " anos");
    }
}

class CidadeThread implements Runnable {
    private String cidade;

    public CidadeThread(String cidade) {
        this.cidade = cidade;
    }

    public void run() {
        System.out.println("Moro em: " + cidade);
    }
}
