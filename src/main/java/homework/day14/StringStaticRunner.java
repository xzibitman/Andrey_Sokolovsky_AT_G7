package homework.day14;

public class StringStaticRunner {
    public static void main(String[] args) {
        LettersInColumn lettersInColumn = new LettersInColumn();
        lettersInColumn.writeLetters("five");
        DublicateWords duplicate = new DublicateWords();
        duplicate.dublicateWords("в лес пошел дед лес накрыл деда лесом лес окреп");
        CurrentDate currentDate = new CurrentDate();
        currentDate.date();
        ChangeFormatDate changeFormatDate = new ChangeFormatDate();
        changeFormatDate.changeFormat("22.00 07.09.2020");
        NumbersInText numbersInText = new NumbersInText();
        numbersInText.findNumbers("неизвестный 598 текст 1247");

    }

}
