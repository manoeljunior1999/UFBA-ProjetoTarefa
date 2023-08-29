package ProjetoTarefa;

public class main {
    public static void main(String[] args) {
        Projeto projeto = new Projeto("Projeto Teste");

        Tarefa tarefa1 = new Tarefa("Desenvolver funcionalidade A");
        Tarefa tarefa2 = new Tarefa("Testar funcionalidade B");

        projeto.adicionarTarefa(tarefa1, "Vanessa");
        projeto.adicionarTarefa(tarefa2);

        tarefa1.finalizarTarefa(8, "Implementação Realizada");
        tarefa2.finalizarTarefa(4, "Testes finalizados");

        System.out.println(projeto);
    }
}
