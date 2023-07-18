package org.Tasks.DesignPatterns.Singleton;

public class UIManager {
    private UserPreferences userPreferences;

    public UIManager(){
        userPreferences = UserPreferences.getInstance();
    }
    public void applyUserPreferences() {
        String backgroundColor = userPreferences.getBackgroundColor();
        String font = userPreferences.getFont();
        int windowSize = userPreferences.getWindowSize();
    }
}
