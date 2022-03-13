public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"good", "bad", "special", "pretty", "ugly", "fake", "fuzzy", "smooth",
        "hairy", "big", "tall", "loud"};

        String[] wordListTwo = {"red", "black", "green", "blue", "soft", "hard", "slippery", "slimy", "smelly",
        "stinky", "wet", "dry"};

        String[] wordListThree = {"string", "cheese", "iPhone", "car", "boat", "leash", "blanket", "surfboard",
        "kayak", "bull", "pig", "sheep"};


        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Lets get a " + phrase);
    }
}
