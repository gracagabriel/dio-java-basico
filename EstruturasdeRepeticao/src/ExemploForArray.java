public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"JOAO", "JONAS", "JOREL", "JULIA"};

        
        for (int x = 0; x < alunos.length; x ++) {
            System.out.println("O aluno na posição x "+ x + " é: " + alunos [ x ]);
        }
         

         //USANDO FOR EACH
         for (String aluno : alunos) {
            System.out.println("Nome dos alunos da turma: " + aluno );
         }
    }
}
