package hu.margareta.bejegyzes;

import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //2. feladat a
        Bejegyzes bejegyzes1 = new Bejegyzes("Mici", "Lefárasztott Czinkocy");
        Bejegyzes bejegyzes2 = new Bejegyzes("Kata", "Miért hasonlít ennyire a java a c#-ra? :((");

        LinkedList<Bejegyzes> list = new LinkedList<>();
        list.add(bejegyzes2);
        list.add(bejegyzes1);

        //2. feladat b
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numByUser = scanner.nextInt();

        while(numByUser != 0){
            list.add(new Bejegyzes("szerzo","tartalom"));
            numByUser--;
        }

        //2. feladat c
        /*List<List<String>> bejegyzesek = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("bejegyzesek.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                bejegyzesek.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //2. feladat d
        int randomLike = list.size()*20;
        Random rand = new Random();

        while(randomLike != 0){
            list.get(rand.nextInt(list.size())).like();
            randomLike--;
        }

        //2. feladat e
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = sc.nextLine();
        list.get(1).setTartalom(text);
        System.out.println(list.get(2));

        //3. feladat a
        Integer mostLike=0;
        for (Bejegyzes value : list) {
            if (mostLike < value.getLikeok()) {
                mostLike = value.getLikeok();
            }
        }
        System.out.println(mostLike);

        //3. feladat b
        if(mostLike>35){
            System.out.println("There is more like on a post, than 35.");
        }else{
            System.out.println("There is no more like on a post, than 35.");
        }

        //3. feladat c
        int searchedLikedpostNumber=0;
        for (Bejegyzes bejegyzes : list) {
            if (bejegyzes.getLikeok() == 15) {
                searchedLikedpostNumber++;
            }
        }
        System.out.println("There is "+searchedLikedpostNumber+" post that has 15 likes.");

        //3. feladat d

        Integer max = list.getFirst().getLikeok();
        LinkedList<Bejegyzes> list2 = new LinkedList<>();

        while(list.size() > 0){
            for(Bejegyzes bejegyzes : list){
                if(bejegyzes.getLikeok()>max){
                    max = bejegyzes.getLikeok();
                }
            }

            for(Bejegyzes bejegyzes : list){
                if(bejegyzes.getLikeok()==max){
                    list2.add(bejegyzes);
                    list.remove(bejegyzes);
                }
            }
        }




        /*for (Bejegyzes bejegyzes : list) {
            System.out.println(bejegyzes.toString());
        }*/


    }
}