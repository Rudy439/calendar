package sk.kosickaakademia.rudolfmato.challenge.mongodatabase;


import jdk.internal.org.jline.utils.ShutdownHooks;
import sk.kosickaakademia.rudolfmato.challenge.pack.Challenge;

import java.util.List;

public interface Mongodata {
    /*
    -opis
    @parameter challengu
    @autor (who)
    @return (what)
    @version (1.1.0)
     */
    public void insertChallenge(Challenge challenge);
    public void setChallengeToDo(int id);
    public List<Challenge> getAllChallenges();
    public List<Challenge> getAllChallenges(boolean done);
    public List<Challenge> getAllChallengesByPriority();
    public List<Challenge> getAllChallengesByName(String name);
    public void DeleteDoneChallenges();
}
