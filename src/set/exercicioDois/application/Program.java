package set.exercicioDois.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        // Em um portal de cursos online, cada usuário possui um código único,
        // representado por um número inteiro.
        // Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno
        // pode se matricular em quantos cursos quiser. Assim, o número total de alunos
        // de um
        // instrutor não é simplesmente a soma dos alunos de todos os cursos que ele
        // possui, pois pode
        // haver alunos repetidos em mais de um curso.
        // O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total
        // de alunos.
        // Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois
        // mostrar a quantidade total e alunos dele.
        Set<Integer> students = new HashSet<>();
        Set<Integer> class1 = new HashSet<>();
        Set<Integer> class2 = new HashSet<>();
        Set<Integer> class3 = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Quantos estudantes para o curso %d? ", i);
            int quantityOfStudents = sc.nextInt();

            for (int j = 1; j <= quantityOfStudents; j++) {
                System.out.printf("Codigo do %do estudante: ", j);
                int student = sc.nextInt();
                if(i == 1){
                    class1.add(student);
                }else if(i == 2){
                    class2.add(student);
                }else{
                    class3.add(student);
                }
            }
        }

        students.addAll(class1);
        students.addAll(class2);
        students.addAll(class3);

        System.out.print("\nTotal de estudantes: " + students.size());
    }
}
