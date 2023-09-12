package ifsuldeminas.bcc.PrimeiroProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController


    public class CalendarController {
        public static void main(String[] args) {
            int diaAtual = obterDiaDeHoje();
            System.out.println("Hoje eh dia " + diaAtual);
        }

        public static int obterDiaDeHoje() {
            LocalDate hoje = LocalDate.now();
            return hoje.getDayOfMonth();
            System.out.println("Amanha sera " + diaAtual);
        }
    }

    public class amanha {
        public static void main(String[] args) {
            LocalDate dataInicial = LocalDate.of(2023, 8, 17);
            LocalDate novaData = dataInicial.plusDays(1);
            System.out.println("Nova data: " + novaData);
    }

