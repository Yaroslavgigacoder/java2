import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {    
    String text = "aaabbbaaas";
    System.out.println(polindrom(text));
    Path file = Path.of("file.txt");
    try {
        Files.createFile(file); 
    } catch (Exception e) {
        System.out.println("Файл создан");
    }
    try {
        Files.writeString(file, "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST\nTEST TEST TEST TEST TEST TEST TEST TEST TEST TEST ");
    } catch (IOException e) {
    e.printStackTrace();
    }
    }
    public static boolean polindrom(String str) {
        String revers = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revers += str.charAt(i); 
        }
        if(revers.equals(str)){
            return true;
        }
        else{
        return false;
        }
    }
}

    // 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш
// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
    