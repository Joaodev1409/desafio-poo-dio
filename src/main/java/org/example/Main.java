package org.example;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
    }
}