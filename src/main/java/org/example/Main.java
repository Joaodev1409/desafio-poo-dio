package org.example;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição Curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição Curso Js");
        curso2.setCargaHoraria(8);

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println("=========================");

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println("=========================");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao Bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos :" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("========================================");

        System.out.println("Conteudos Inscritos :" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos :" + devJoao.getConteudosConcluidos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("========================================");
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("========================================");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos :" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("========================================");
        System.out.println("Conteudos Inscritos :" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos :" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
        devMaria.progredir();
        System.out.println("========================================");
        System.out.println("XP:" + devMaria.calcularTotalXp());

    }
}