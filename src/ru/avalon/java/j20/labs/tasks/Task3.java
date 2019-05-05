package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Задание №3
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных с
 * использованием буферизованных типов данных".
 */
public class Task3 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("countries_buffered_mode_output.txt");
        Collection<String> lines = read(input);
        write(output, lines);

        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Реализовать метод read.
         *
         *    При чтении файла следует пользоваться типами данных:
         *    FileReader и BufferedReader.
         *
         * 2. Реализовать метод write.
         *
         *    При реализации метода следует пользоваться типами данных:
         *    PrintWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в коллекцию строк.
     *
     * <p>Каждый элемент коллекции представляет собой
     * отдельную строку файла.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private Collection<String> read(File file) throws IOException {
    	
        if(file != null) {
        	
        	try(BufferedReader fileBufReader = new BufferedReader(new FileReader(file))){
        		
        		List<String> list = new LinkedList<>();
        		String temp = null;
        		
        		while((temp = fileBufReader.readLine()) != null) {
        			
        			list.add(temp);
        			
        		}

        		return list;
        		
        	}
        }	else {
        	throw new FileNotFoundException("Nothing to read");
        }
    }

    /**
     * Выполняет запись коллекции строковых элементов в файл.
     *
     * <p>Каждый элемент коллекции должен быть записан в
     * файл отдельной строкой.
     *
     * @param file файл
     * @param collection коллекция строк
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, Collection<String> listCol) throws IOException {
    	
        if(file == null) throw new NullPointerException("File_name is miss");
        if(listCol == null) throw new IllegalArgumentException("No list");
        
        try(Writer fileWriter = new PrintWriter(new FileWriter(file))){

        	for (String string : listCol) {
        		
				fileWriter.write(string);
				fileWriter.write(System.lineSeparator());
			}
        }   
    }
}
