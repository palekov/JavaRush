package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            OutputStream outputStream = new FileOutputStream("D:\\Мусор\\1.txt");
            OutputStream outputStream2 = new FileOutputStream("D:\\Мусор\\2.txt");
            InputStream inputStream = new FileInputStream("D:\\Мусор\\1.txt");

            JavaRush javaRush = new JavaRush();
            javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Stiv");
            javaRush.users.get(0).setLastName("Voznik");
            javaRush.users.get(0).setBirthDate(simpleDateFormat.parse("10.07.1940"));
            javaRush.users.get(0).setMale(true);
            javaRush.users.get(0).setCountry(User.Country.RUSSIA);
            javaRush.users.add(new User());
            javaRush.users.get(1).setFirstName("Etera");
            javaRush.users.get(1).setLastName("Lans");
            javaRush.users.get(1).setBirthDate(simpleDateFormat.parse("15.12.1989"));
            javaRush.users.get(1).setMale(false);
            javaRush.users.get(1).setCountry(User.Country.OTHER);
            javaRush.save(outputStream);
            outputStream.flush();
            outputStream.close();




            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if(javaRush.equals(loadedObject)) System.out.println("equals");
            loadedObject.save(outputStream2);
            outputStream2.close();


            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            for (User user : users) {
                printWriter.println(user.getFirstName());
                printWriter.println(user.getLastName());
                printWriter.println(sdf.format(user.getBirthDate()));
                printWriter.println(user.isMale());
                printWriter.println(user.getCountry());
            }
            printWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            String firstName;
            while ((firstName = reader.readLine()) != null) {
                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(reader.readLine());
                user.setBirthDate(sdf.parse(reader.readLine()));
                user.setMale(Boolean.parseBoolean(reader.readLine()));
                user.setCountry(User.Country.valueOf(reader.readLine()));
                users.add(user);
            }
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}