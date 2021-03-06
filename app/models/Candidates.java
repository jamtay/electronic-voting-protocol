package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List of candidates used in the form of voting booth
 */
public class Candidates {

    private long id;
    private String name;

    public Candidates(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static List<String> getCandidateNames() {
        String[] nameArray = {"Joe Bloggs", "Jane Doe"};
        return Arrays.asList(nameArray);
    }

    public static Candidates findCandidates(String candidateName) {
        for (Candidates candidate : allCandidates) {
            if (candidateName.equals(candidate.getName())) {
                return candidate;
            }
        }
        return null;
    }

    public static Candidates getDefaultCandidate() {
        return findCandidates("Joe Bloggs");
    }

    @Override
    public String toString() {
        return String.format("[Candidates %s]", this.name);
    }

    private static List<Candidates> allCandidates = new ArrayList<>();

    static {
        allCandidates.add(new Candidates(1L, "Joe Bloggs"));
        allCandidates.add(new Candidates(2L, "Jane Doe"));
    }


}
