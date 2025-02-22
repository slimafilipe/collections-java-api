package set.OperacoesBasicas;

public class Palavras {
    private String palavras;

    public Palavras(String palavras) {
        this.palavras = palavras;
    }

    public String getPalavras() {
        return palavras;
    }

    @Override
    public String toString() {
        return  palavras +"\n";
    }
}
