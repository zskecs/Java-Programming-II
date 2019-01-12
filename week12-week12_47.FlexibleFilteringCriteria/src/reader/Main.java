package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.AllLines;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.AtLeastOne;

public class Main {

    public static void main(String[] args) {
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new AtLeastOne(new ContainsWord("vesi"), new ContainsWord("maito"));
        
        System.out.println(criterion.complies("vesi vanhin voitehista"));
        System.out.println(criterion.complies("aitoa maitoa"));
        System.out.println(criterion.complies("vesi vanhin voitehista"));

    }
}
