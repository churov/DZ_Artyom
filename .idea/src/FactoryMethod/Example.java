package FactoryMethod;



import java.util.ArrayList;
import java.util.List;

abstract class Music{
    String nameGenre;
    List <String> exactName = new ArrayList();

    public String toString(){
        return "Название жанра: " + nameGenre + "\n" + exactName;
    }
}

abstract class Genre{
    public abstract Music createMusic();

}

class RAP extends Genre{
    public Music createMusic(){
        return new RapMusic();
    }

}

class ROCK extends Genre{
    public Music createMusic(){
        return new RockMusic();
    }

}

class RapMusic extends Music{
    public RapMusic(){
        nameGenre = "РЭП";
        exactName.add("Черный рэп");
        exactName.add("Рэп-кор");
        exactName.add("Хип-хоп");
        exactName.add("Рэп с гнильцой");
    }
}

class RockMusic extends Music{
    public RockMusic(){
        nameGenre = "РОК";
        exactName.add("Тяжелый рок");
        exactName.add("Рок");
    }
}

public class Example{
    public static void main(String[] args) {
        Genre RapMusic = new RAP();
        Genre RockMusic = new ROCK();

        Music rap = RapMusic.createMusic();
        Music rock = RockMusic.createMusic();

        System.out.println(rap);
        System.out.println(rock);
    }
}