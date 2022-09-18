package com.moodanalyser;
public class MoodAnalyser {
    private  String message;
    public MoodAnalyser(){

    }
    public  MoodAnalyser(String message){
        this.message=message;
    }
    public  String analyseMood(String message){
        if(message.contains("sad")){
            return "SAD";
        }
        return "HAPPY";
    }
    public String analyserMood(){
        return analyseMood(message);
    }
}
