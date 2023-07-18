package org.Tasks.DesignPatterns.Singleton;

public class UserPreferences {

    private static UserPreferences instance;
    private String color;
    private String font;
    private int windowSize;

    private UserPreferences(){

    }

    public static UserPreferences getInstance(){
        if( instance == null){
            instance = new UserPreferences();
        }
        return instance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }
}
