import java.util.Scanner;
import java.util.ArrayList;
/// bug de salvar os novos dados em cima dos dodos do antigo///
public class SistemaHospitalar {
    private ArrayList<Cadastro> pacientes = new ArrayList<>();


   public void cadastrarPaciente (){
       Scanner sc = new Scanner(System.in);
       Cadastro c = new Cadastro();


       System.out.println("Cadastrando novo paciente");
       System.out.println("Digite o nome do paciente");
       c.setNome(sc.nextLine());
       System.out.println("Digite a idade do paciente");
       c.setIdade(sc.nextInt());
       sc.nextLine();
       System.out.println("Digite o CPF de" + c.getNome() + " : " );
       c.setCpf(sc.nextLine());

       pacientes.add(c);
    }


    public void listarPaciente(){


        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        System.out.println("\n Pacientes Cadastrados (" + pacientes.size() + ") ");
        for (int i = 0; i < pacientes.size(); i++) {
            Cadastro c = pacientes.get(i);
            System.out.println((i + 1) + " - " + c.getNome()
                    + " | CPF: " + c.getCpf()
                    + " | Idade: " + c.getIdade());
        }

    }

    public void buscarPaciente(){
       Scanner sc = new Scanner(System.in);
       String pesquisa;
        boolean procura = true;


        System.out.println("Buscando pacientes");
       System.out.println("Digite o nome do paciente que deseja verificar");
       pesquisa = sc.nextLine();
       System.out.println("Verificando se " + pesquisa + "existe");

       for (int i =0; i < pacientes.size();i++){
           Cadastro c = pacientes.get(i);
           if(pesquisa.equals(c.getNome())){
               System.out.println("Encontrado \n Nome: \t" +c.getNome() + " \n Idade: \t"+ c.getIdade() + "\n CPF: \t " + c.getCpf());
               procura = false;

           }
       }
        if(procura == true) {
            System.out.println( pesquisa +" não esta no sistema");
        }
   }

    public void deletarPaciente(){
        Scanner sc = new Scanner(System.in);
        String pesquisa;
        boolean procura = true;;


        System.out.println("Delantando Paciente");
        System.out.println("Digite o nome do paciente que deseja deletar");
        pesquisa = sc.nextLine();
        System.out.println("Verificando se " + pesquisa + " existe.\n");

        for (int i =0; i < pacientes.size();i++){
            Cadastro c = pacientes.get(i);
            if(pesquisa.equals(c.getNome())){
                System.out.println("Encontrado \n Nome: \t" +c.getNome() + " \n Idade: \t"+ c.getIdade() + "\n CPF: \t " + c.getCpf());
                System.out.println("Deletando " + c.getNome() + " do sitema.\n");
                pacientes.remove(i);
                procura = false;

            }
        }
        if(procura == true) {
            System.out.println( pesquisa +" não esta no sistema.\n ");
        }


    }
    public void mostraMensagem(){
       String Mesagem = " Bem vindo ao prototipo de um sistema hospitalar. \n Digite 1 para cadastrar novo paciente. \n " +
               "Digite 2 para listar todos os paciente. \n Digite 3 para buscar um paciente. \n " +
               "Digite 4 para deletar um paciente. \n Digite 5 para encerrar o programa." ;
        System.out.println(Mesagem);

    }

}
