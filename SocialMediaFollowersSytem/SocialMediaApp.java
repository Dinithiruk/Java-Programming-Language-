package SocialMediaFollowersSytem;
// ------ This program is a Social Media Follower System by using a Set in Java------

public class SocialMediaApp {
    public static void main(String[] args) {
        //instance
        SocialMedia socialMedia =new SocialMedia();

        //adding followers to the social media platform
        socialMedia.addFollower("Diluksi");
        socialMedia.addFollower("Herath");
        socialMedia.addFollower("Supun");
        socialMedia.addFollower("Nilakshi");
        socialMedia.addFollower("Joel");

        System.out.println("\n"+"-----------------Social Media Follower System-------------------"+"\n");

        System.out.println("Current Followers: "+ socialMedia.getFollowers());
        

        //adding a new follower and checking for duplicates
        String newFollower = "Daisy";
        if(!socialMedia.getFollowers().contains(newFollower)){
            socialMedia.addFollower(newFollower);
            System.out.println("New Follower : "+ newFollower + " has followed");
        }else{
            System.out.println(newFollower + "is already a follower");
        }

       // removing a follower and handling cases where the follower is not found
       String unFollower = "Jack";
       if(socialMedia.getFollowers().contains(unFollower)){
        socialMedia.removeFollower(unFollower);
        System.out.println(unFollower + "has unfollowed");
       }else{
        System.out.println(unFollower + " is not found in the followers");
       }

       // updated list of followers after all operation
       System.out.println("Updated Followers : "+ socialMedia.getFollowers()+"\n");
    }
}
