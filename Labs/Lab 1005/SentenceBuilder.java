
/**
 * Lab 1005 Sentence Builder
 *
 * @author (Grace Jau)
 * @version (1005)
 */
public class SentenceBuilder{
    String[] nouns = {"puppy", "pizza", "snake", "doorbell", "girl", "building"};
    String[] verbs = {"jumps", "runs", "flies", "eats", "wants", "sings", "skips"};
    String[] adjectives = {"little", "silly", "funny", "stuffy", "shady", "hopeful", "graceful"};
    String[] determiners = {"the", "my", "your", "his", "her", "our", "their", "Fred's"};
    String[] adverbs = {"quickly", "happily", "smoothly", "often", "never"};
    String[] prepositions = {"over", "near", "on top of", "behind", "next to", "inside of", "under"};

    public SentenceBuilder(){
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getRandomNoun(){
        return nouns[(int)(Math.random()*nouns.length)];
    }
    public String getRandomVerb(){
        return verbs[(int)(Math.random()*verbs.length)];
    }
    public String getRandomAdjective(){
        return adjectives[(int)(Math.random()*adjectives.length)];
    }
    public String getRandomDeterminer(){
        return determiners[(int)(Math.random()*determiners.length)];
    }
    public String getRandomAdverb(){
        return adverbs[(int)(Math.random()*adverbs.length)];
    }
    public String getRandomPreposition(){
        return prepositions[(int)(Math.random()*prepositions.length)];
    }
    public String getNounPhrase(){
        return (getRandomDeterminer()+" "+getRandomAdjective()+" "+getRandomNoun());
    }
    public String getVerbPhrase(){
        return (getRandomAdverb()+" "+getRandomVerb());
    }
    public String getPrepositionPhrase(){
        return (getRandomPreposition()+" "+getNounPhrase());
    }
    public String getSentence(){
        return (getNounPhrase()+" "+getVerbPhrase()+" "+getPrepositionPhrase());
    }
    public void loadSentence(){
        System.out.println(getSentence());
    }
}
