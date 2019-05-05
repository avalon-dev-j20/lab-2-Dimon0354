package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import static java.lang.Thread.*;
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
    	//Просто убрал проверку
    	ClassLoader loader = currentThread().getContextClassLoader();
        Properties pr = new Properties();
        	
        try(InputStream inStr = loader.getSystemResourceAsStream("resources/database.properties")){
        	pr.load(inStr);
        } return pr;	
    }
}
