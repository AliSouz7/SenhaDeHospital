public class GeradorDeSenha {
    private int contadorsenha; //só será acessada dentro dessa classe

    public GeradorDeSenha() {
        this.contadorsenha = 1;
    }

    public String gerarSenha() {
        return "SENHA" + contadorsenha++;
    }

    public void reiniciarContadorSenha(){
        contadorsenha = 1; //senhas recomeçarão a partir do 1
    }
}
