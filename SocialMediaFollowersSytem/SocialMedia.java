package SocialMediaFollowersSytem;

import java.util.Set;
import java.util.HashSet;

public class SocialMedia {
    private Set<String> followers;

    //constructor 
    public SocialMedia(){
        followers= new HashSet<>();
    }

    //methods to add and remove followers 
    public void addFollower(String username){
        followers.add(username);
    }

    public void removeFollower(String username){
        followers.remove(username);
    }

    //getter method 
    public Set<String> getFollowers(){
        return followers;
    }
}
