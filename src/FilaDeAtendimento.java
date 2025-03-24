import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class FilaDeAtendimento {
    private Queue<String> filaDePacientes;
    private List<String> historicoDeChamadas;
    private GeradorDeSenha geradorDeSenha;

    public FilaDeAtendimento() {
        this.filaDePacientes = new LinkedList<>();
        this.historicoDeChamadas = new ArrayList<>();
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
            historicoDeChamadas.add(senhaChamada);
            System.out.println("Chamando o paciente: " + senhaChamada);
        } else {
            System.out.println("Nenhum paciente adicionado na fila.");
        }
    }

    //Historico ade chamadas
    public void mostrarHistorico(){
        if (historicoDeChamadas.isEmpty()) {
            System.out.println("Nenhum paciente foi chamado ainda");
        } else {
            System.out.println("Historico de chamadas: " + historicoDeChamadas);
        }
    }

    //Reiniciar a fila e a contagem de senhas
    public void reiniciarFila() {
        filaDePacientes.clear();
        historicoDeChamadas.clear();
        geradorDeSenha.reiniciarContadorSenha();
        System.out.println("Fila e historico de senhas reiniciado com sucesso.");
    }

    //verificar se ainda tem pacientes na fila
    public boolean temPacientesNaFilaa (){
        return !filaDePacientes.isEmpty();
    }


}
