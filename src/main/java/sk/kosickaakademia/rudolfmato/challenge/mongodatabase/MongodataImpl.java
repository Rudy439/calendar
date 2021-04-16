package sk.kosickaakademia.rudolfmato.challenge.mongodatabase;

import sk.kosickaakademia.rudolfmato.challenge.pack.Challenge;

import java.util.List;

public class MongodataImpl implements Mongodata {
    /* dbname:taskmanager
    collection: tasks */

    @Override
    public void insertChallenge(Challenge challenge) {

    }

    @Override
    public void setChallengeToDo(int id) {

    }

    @Override
    public List<Challenge> getAllChallenges() {
        return null;
    }

    @Override
    public List<Challenge> getAllChallenges(boolean done) {
        return null;
    }

    @Override
    public List<Challenge> getAllChallengesByPriority() {
        return null;
    }

    @Override
    public List<Challenge> getAllChallengesByName(String name) {
        return null;
    }

    @Override
    public void DeleteDoneChallenges() {

    }

}
