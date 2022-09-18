package com.moodanalyser;
public class MoodAnalyser {
    private  String message;
    public MoodAnalyser(){

    }
    public  MoodAnalyser(String message){
        this.message=message;
    }
    public String analyserMood(String message) throws MoodAnalyserException {
        try {
            if(message.length()==0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"please enter proper message");
            }
            if(message.contains("sad")){
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"please enter proper message");
        }
    }

}
