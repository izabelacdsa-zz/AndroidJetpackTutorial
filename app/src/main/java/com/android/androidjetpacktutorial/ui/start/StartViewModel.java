package com.android.androidjetpacktutorial.ui.start;

import android.arch.lifecycle.ViewModel;

public class StartViewModel extends ViewModel {
    private int apple = 0;

    public int getApple() {
        return apple;
    }

    public void setApple(int apple) {
        this.apple = apple;
    }

    public void increaseAppleCounter() {
        ++apple;
    }
}
