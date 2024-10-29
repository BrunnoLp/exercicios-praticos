import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IdadeExpressa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite sua data de nascimento (AAAA-MM-DD)");
            String dataNascimentoStr = scanner.nextLine();

            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
            LocalDate dataAtual = LocalDate.now();

            Period periodo = Period.between(dataNascimento, dataAtual);

            int anos = periodo.getYears();
            int meses = periodo.getMonths();
            int dias = periodo.getDays();

            System.out.println("Você tem : " +anos+" anos "+meses+" meses "+dias+" dias ");
        }
    }
}