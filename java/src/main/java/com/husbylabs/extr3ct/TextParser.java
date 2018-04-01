package com.husbylabs.extr3ct;

public class TextParser {
    public static String parseByCharacter(String text, char character) {
        return text.replace(character, ' ');
    }

    public static String parseByCharacterIndex(String text, String character, int index) {

        String[] data = text.split(character);
        return data[index].trim();
    }
}
