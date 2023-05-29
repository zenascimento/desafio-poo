import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Lições");
        mentoria.setDescricao("Sobre Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devZe = new Dev();
        devZe.setNome("Ze");
        devZe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ze" + devZe.getConteudosInscritos());
        devZe.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ze" + devZe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ze" + devZe.getConteudosConcluidos());
        System.out.println("XP:" + devZe.calcularTotalXp());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devZe.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("--------");

    }
}
