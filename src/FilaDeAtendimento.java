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

    //Chamar o proximo paciente da fila
    public void chamarProximoPaciente(){
        if(!filaDePacientes.isEmpty()) {
            String senhaChamada = filaDePacientes.poll();// Esse metodo remove e retorna o primeiro elemento da fila (FIFO - First In, First Out)
            históricoDeChamadas.add(senhaChamada);
            System.out.println("Chamando o paciente: " + senhaChamada);
        } else {
            System.out.println("Nenhum paciente adicionado na fila.");
        }
    }


}
