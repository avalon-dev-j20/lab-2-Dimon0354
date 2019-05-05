package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     * @throws ParseException 
     */
    @Override
    public void run() throws IOException, ParseException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);

        /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     * @throws ParseException 
     */
    private Collection<Country> read(File file) throws IOException, ParseException {
        
    	if(file != null) {
    		
    		Collection<Country> colCountry = new ArrayList<Country>();
    		
    		try(BufferedReader bufReader = new BufferedReader(new FileReader(file))){
    			
    			String temp = null;
    			
    			while((temp = bufReader.readLine()) != null) {
    				colCountry.add(Country.valueOf(temp));
    			}
    		}
    		return colCountry;
    	}	else {
    		throw new NullPointerException("File_name is miss");
    	}
    }
}
