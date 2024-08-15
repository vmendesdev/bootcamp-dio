package com.dio.iphone;

public class iPhone implements MusicalPlayer, Phone, InternetBrowser {

                @Override
                public void playMusic(String songName) {
                    System.out.println("Playing song: " + songName);
                }
            
                @Override
                public void pauseMusic() {
                    System.out.println("Music paused.");
                }
            
                @Override
                public void stopMusic() {
                    System.out.println("Music stopped.");
                }
            
                @Override
                public void makeCall(String phoneNumber) {
                    System.out.println("Calling: " + phoneNumber);
                }
            
                @Override
                public void endCall() {
                    System.out.println("Call ended.");
                }
            
                @Override
                public void answerCall() {
                    System.out.println("Call answered.");
                }
            
                @Override
                public void openWebsite(String url) {
                    System.out.println("Opening website: " + url);
                }
            
                @Override
                public void refreshPage() {
                    System.out.println("Page refreshed.");
                }
            
                @Override
                public void closeBrowser() {
                    System.out.println("Browser closed.");
                }
            }