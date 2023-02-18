package cycletask;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class CycleTaskRunner {
    public static void main(String[] args) {
        Taskwhile vailWhile = new Taskwhile();
        Taskfor vailFor = new Taskfor();
        Masiv vailMas = new Masiv();
        Obratnii vailObr = new Obratnii();
        Umnojit vailUmn = new Umnojit();
        Kvadrat vailKva = new Kvadrat();
        Minimum vailMin = new Minimum();
        Mesta vailMes = new Mesta();
        Sortirovka vailSor = new Sortirovka();

        vailWhile.Tasker();
        System.out.println();
        vailFor.forTa();
        System.out.println();
        vailMas.sivma();
        System.out.println();
        vailObr.obrat();
        System.out.println();
        vailUmn.umnoj();
        System.out.println();
        vailKva.kvadr();
        System.out.println();
        vailMin.minim();
        System.out.println();
        vailMes.Mest();
        System.out.println();
        vailSor.sortirov();
        System.out.println();


    }

}
