package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Задание №4
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     * @throws IllegalAccessException 
     */
    @Override
    public void run() throws IOException, IllegalAccessException {
        Properties properties = read("resources/database.properties");

        /*
         * TODO(Студент): Выполнить задание №4
         *
         * 1. Реализовать метод read.
         *
         * 2. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение файла конфигураций описанного
     * параметром {@code path}.
     *
     * @param path путь к конфигурации
     * @return новый экземпляр типа {@link Properties}
     * @throws IOException 
     * @throws IllegalAccessException 
     */
    private Properties read(String path) throws IOException, IllegalAccessException {
    	
        if( path != null || path != "") {
        	
        	Properties pr = new Properties();
        	
        	try(InputStream inStr = getClass().getClassLoader().getResourceAsStream(path)){
        		pr.load(inStr);
        		return pr;
        		
        	} 
        }	else {
        	
    		throw new IllegalAccessException("Path is't correct");
    		
    	}
    }
}
