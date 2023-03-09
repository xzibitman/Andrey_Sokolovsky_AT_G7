package homework.day14;


public class StringObjectRunner {
    public static void main(String[] args) {
        NoStaticChangeFormatDate noStaticChangeFormatDate = new NoStaticChangeFormatDate();
        noStaticChangeFormatDate.changeFormat("22.00 07.09.2020");
        NoStaticCurrentDate noStaticCurrentDate = new NoStaticCurrentDate();
        noStaticCurrentDate.date();
        NoStaticDublicateWords noStaticDublicateWords = new NoStaticDublicateWords();
        noStaticDublicateWords.dublicateWords("в лес пошел дед лес накрыл деда лесом лес окреп");
        NoStaticLettersInColumn noStaticLettersInColumn = new NoStaticLettersInColumn();
        noStaticLettersInColumn.writeLetters("five");
        NoStaticNumbersInText noStaticNumbersInText = new NoStaticNumbersInText();
        noStaticNumbersInText.findNumbers("неизвестный 598 текст 1247");


    }

}
