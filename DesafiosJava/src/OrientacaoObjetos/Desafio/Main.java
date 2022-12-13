package OrientacaoObjetos.Desafio;

import java.time.LocalDate;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp QA para mulheres");
        bootcamp.setDescricao("Descrição Bootcamp QA para mulheres");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRebeca = new Dev();
        devRebeca.setNome("Rebeca");
        devRebeca.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devRebeca.getConteudosInscritos());
        devRebeca.progredir();
        System.out.println("Conteudos Concluidos" + devRebeca.getConteudosConcluidos());
        System.out.println("XP" + devRebeca.calcularTotalXP());

        Dev devJuan = new Dev();
        devJuan.setNome("Juan");
        devJuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJuan.getConteudosInscritos());
        devJuan.progredir();
        System.out.println("Conteudos Concluidos" + devRebeca.getConteudosConcluidos());
        System.out.println("XP" + devJuan.calcularTotalXP());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         */

    }

}
