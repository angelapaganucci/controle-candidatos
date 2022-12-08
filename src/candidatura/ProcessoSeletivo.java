package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("**Processo Seletivo**");
        System.out.println();
        analisarCandidato(1900.0);
        analisarCandidato(2200.00);
        analisarCandidato(2000.0);

    }

    static void analisarCandidato(Double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
