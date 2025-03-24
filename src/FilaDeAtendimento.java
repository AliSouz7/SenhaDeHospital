import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class FilaDeAtendimento {
    private Queue<String> filaDePacientes;
    private List<String> históricoDeChamadas;
    private GeradorDeSenha geradorDeSenha;

    public FilaDeAtendimento() {
        this.filaDePacientes = new LinkedList<>();
        this.históricoDeChamadas = new ArrayList<>();
        this.geradorDeSenha = new GeradorDeSenha();
    }

    //Adicionar paciente na fila
    public void adicionarPaciente(){
        String novaSenha = geradorDeSenha.gerarSenha();
        filaDePacientes.add(novaSenha);
        System.out.println("Senha para o paciente: " + novaSenha);
    }
}
