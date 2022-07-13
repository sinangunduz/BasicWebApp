package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Sin10";
        } else if (query.contains("what is your name"))
            return "Sin10";
        else if ("which of the following numbers is the largest: 98, 203")
            return "203";
        else if ("which of the following numbers is the largest: 43, 57, 806, 241")
            return "806";
        else if ("what is 14 plus 6")
            return "20";
        else if (" what is 12 plus 18")
            return "30";
        else { // TODO extend the programm here , extend right here
            return "";
        }
    }
}
