package com.felipe.literalura.main;

import com.felipe.literalura.service.apiConsumer;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private apiConsumer api = new apiConsumer();

    private final String ADRESS = "https://gutendex.com/books/?search=";

    public void displayMenu() {
        var option = -1;
        var menu = ("""
                -------------------------------------------
                Ecolha um número das opções abaixo:
                1- Buscar livro pelo título
                2- Listar livros
                3- Listar Autores
                4- Listar autores vivos em determinado ano
                5- Listar livros por idiomas
                6- Top 10 livros
                
                0- Exit
                -------------------------------------------
                """);
        while (option != 0) {
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    searchBook();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private void searchBook() {
    }

}
