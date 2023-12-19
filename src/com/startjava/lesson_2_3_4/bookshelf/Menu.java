package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

class Menu {
    private Bookshelf bookshelf;

    public Menu() {
        bookshelf = new Bookshelf();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Для продолжения нажмите Enter");
            scanner.nextLine();

            System.out.println();
            System.out.println("В шкафу книг - " + bookshelf.getBookCount() + ", свободно полок - " + bookshelf.getFreeShelves());

            if (bookshelf.getBookCount() == 0) {
                System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            }

            System.out.println();
            System.out.println("Меню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Удалить книгу");
            System.out.println("3. Поиск книги");
            System.out.println("4. Вывести все книги на шкафу");
            System.out.println("5. Очистить шкаф");
            System.out.println("6. Завершить");

            System.out.print("Выберите операцию (введите номер): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook(scanner);
                    break;
                case "2":
                    deleteBook(scanner);
                    break;
                case "3":
                    findBook(scanner);
                    break;
                case "4":
                    displayShelf();
                    break;
                case "5":
                    clearShelf();
                    break;
                case "6":
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }

    public void addBook(Scanner scanner) {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите год издания книги: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(author, title, year);
        bookshelf.addBook(book);
    }

    public void deleteBook(Scanner scanner) {
        System.out.print("Введите название книги, которую хотите удалить: ");
        String title = scanner.nextLine();

        bookshelf.deleteBook(title);
    }

    public void findBook(Scanner scanner) {
        System.out.print("Введите название книги, которую хотите найти: ");
        String title = scanner.nextLine();

        bookshelf.findBook(title);
    }

    public void displayShelf() {
        bookshelf.displayShelf();
    }

    public void clearShelf() {
        bookshelf.clearShelf();
    }
}