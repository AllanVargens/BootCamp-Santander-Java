import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso1.setTitulo("Curso js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("descricao da mentoria de Java");
        mentoria1.setTitulo("mentoria de Java");

        BootCamp bootCamp1 = new BootCamp();
        bootCamp1.setNome("BootCamp Java");
        bootCamp1.setDescricao("descricao do BootCamp Java");
        bootCamp1.getConteudos().add(curso1);
        bootCamp1.getConteudos().add(mentoria1);

        Dev devAllan = new Dev();
        devAllan.setNome("Allan");
        devAllan.inscreverBootCamp(bootCamp1);
        System.out.println("Conteudos Inscritos Allan: " + devAllan.getconteudosInscritos());
        devAllan.progredir();
        System.out.println("------------------------------------------------");
        System.out.println("Conteudos Inscritos Allan: " + devAllan.getconteudosInscritos());
        System.out.println("Conteudos Conluidos Allan: " + devAllan.getconteudosConcluidos());
        System.out.println("XP: " + devAllan.calcularTotalXP());

        System.out.println("-----    maia    ------");

        Dev devMaia = new Dev();
        devMaia.setNome("Maia");
        devMaia.inscreverBootCamp(bootCamp1);
        System.out.println("Conteudos Inscritos Maia: " + devMaia.getconteudosInscritos());
        devMaia.progredir();
        System.out.println("------------------------------------------------");
        System.out.println("Conteudos Inscritos Maia: " + devMaia.getconteudosInscritos());
        System.out.println("Conteudos Conluidos Maia: " + devMaia.getconteudosConcluidos());
        System.out.println("XP: " + devMaia.calcularTotalXP());

    }
}
