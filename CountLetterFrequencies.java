import acm.program.ConsoleProgram;

/**
 * This program creates a table of the letter frequencies in a
 * paragraph of input text terminated by a blank line.
 */
public class CountLetterFrequencies extends ConsoleProgram {
        public void run() {
                //setFont("JetBrains Mono NL-18");
                println("This program counts letter frequencies.");
                println("Enter a blank line to indicate the end of the text.");
                int[] frequencyTable = new int[26];
                initFrequencyTable(frequencyTable);
                while (true) {
                        String line = readLine();
                        if (line.length() == 0) break;
                        countLetterFrequencies(line, frequencyTable);
                }
                printFrequencyTable(frequencyTable);
        }

        /* Initializes the frequency table to contain zeros */
        void initFrequencyTable(int[] frequencyTable) {
                for (int i = 0; i < 26; i++) {
                        frequencyTable[i] = 0;
                }
        }

        /* Counts the letter frequencies in a line of text */
        void countLetterFrequencies(String line, int[] frequencyTable) {
                for (int i = 0; i < line.length(); i++) {
                        char ch = line.charAt(i);
                        if (Character.isLetter(ch)) {
                                int index = Character.toUpperCase(ch) - 'A';
                                frequencyTable[index]++;
                        }
                }
        }

        /* Displays the frequency table */
        void printFrequencyTable(int[] frequencyTable) {
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                        int index = ch - 'A';
                        println(ch + ": " + frequencyTable[index]);
                }
        }
}
