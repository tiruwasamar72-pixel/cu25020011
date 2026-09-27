class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();
        int count = text.isEmpty() ? 0 : text.split("\\s+").length;

        System.out.println("Language: " + language);
        System.out.println("Word Count: " + count);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();
        w.countWords("Java is easy to learn");
    }
}