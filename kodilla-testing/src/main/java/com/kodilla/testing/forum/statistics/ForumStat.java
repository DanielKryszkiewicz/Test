package com.kodilla.testing.forum.statistics;

public class ForumStat {
    private int postsQuantity;
    private int usersQuantity;
    private int commentsQuantity;
    private double postsAvg;
    private double commentsAvgUser;
    private double commentsAvgPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        postsAvg = calculateAvgUserPost();
        commentsAvgUser = calculateAvgUserComments();
        commentsAvgPost = calculateAvgPostComments();
    }

    private double calculateAvgUserPost(){
        if(usersQuantity >0) {
            return (double) postsQuantity / usersQuantity;
        }else
            return 0;
    }
    private double calculateAvgUserComments(){
        if(usersQuantity>0) {
            return (double) commentsQuantity / usersQuantity;
        }else
            return 0;
    }
    private double calculateAvgPostComments(){
        if(postsQuantity>0) {
            return (double) commentsQuantity / postsQuantity;
        }else
            return 0;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsAvg() {
        return postsAvg;
    }

    public double getCommentsAvgUser() {
        return commentsAvgUser;
    }

    public double getCommentsAvgPost() {
        return commentsAvgPost;
    }
    public void showStatistics(){
        System.out.println("Total Users: "+usersQuantity);
        System.out.println("Total Posts: "+postsQuantity);
        System.out.println("Total Comments: "+commentsQuantity);
        System.out.println("Average Posts per User: "+postsAvg);
        System.out.println("Average Comments per User: "+commentsAvgUser);
        System.out.println("Average Comments per Post: "+commentsAvgPost);

    }
}
