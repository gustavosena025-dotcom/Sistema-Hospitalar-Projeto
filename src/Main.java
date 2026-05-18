import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    SistemaHospitalar sh =new SistemaHospitalar();

    boolean loop = true;


    while (loop) {
        sh.mostraMensagem();
        switch (sc.nextInt()) {
            case 1:
                sh.cadastrarPaciente();
                break;
            case 2:
                sh.listarPaciente();
                break;
            case 3:
                sh.buscarPaciente();
                break;
            case 4:
                sh.deletarPaciente();
                break;
            case 5:
                System.out.println("Encerrando");
                loop = false;
                break;

        }

    }


    }
}