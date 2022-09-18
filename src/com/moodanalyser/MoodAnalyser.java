package com.moodanalyser;
public class MoodAnalyser {
    private  String message;
    public MoodAnalyser(){

    }
    public  MoodAnalyser(String message){
        this.message=message;
    }
    public  String analyseMood(String message){
        try {
        if(message.contains("sad")){
            return "SAD";
        }
        return "HAPPY";
        }catch (Exception e){
            return "HAPPY";
        }
    }
    public String analyserMood(){
        return analyseMood(message);
    }
}
