package org.lessons.excep;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        int numOfBooks = 0;
        String bookTitle = "";
        int bookPages = 0;
        String bookAuthor = "";
        String bookPublisher = "";

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("How many books do you want to enter? ");
            numOfBooks = Integer.parseInt(scanner.nextLine());

            if (numOfBooks <= 0){
                throw new IllegalArgumentException("Invalid value");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        Book[] catalog = new Book[numOfBooks];

        for (int i = 0; i < numOfBooks ; i++) {
            try{
                System.out.print("Enter the title of the book ");
                bookTitle = scanner.nextLine();

                if (bookTitle.isEmpty()) {
                    throw new IllegalArgumentException("The title cannot be empty");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try{
                System.out.print("Enter the number of pages ");
                bookPages = Integer.parseInt(scanner.nextLine());

                if (bookPages <= 0) {
                    throw new IllegalArgumentException("The number of pages cannot be less than or equal to 0");
                }
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }

            try{
                System.out.print("Enter the author of the book ");
                bookAuthor = scanner.nextLine();

                if (bookAuthor.isEmpty()) {
                    throw new IllegalArgumentException("The author cannot be empty");
                }
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }

            try{
                System.out.print("Enter the publisher of the book ");
                bookPublisher = scanner.nextLine();

                if (bookPublisher.isEmpty()) {
                    throw new IllegalArgumentException("The publisher cannot be empty");
                }
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("****************************");

            catalog[i] = new Book(bookTitle, bookPages, bookAuthor, bookPublisher);
        }

        // Scrivo nel file data.txt nella cartella resources le informazioni dei libri
        try{
            FileWriter fileWriter = new FileWriter("./resources/data.txt");
            fileWriter.write(Arrays.toString(catalog));

            fileWriter.close();
        }catch(IOException e){
            System.out.println("Unable to open file writer");
        }

        scanner.close();
    }
}

