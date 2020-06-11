package com.example.sharedpreferences;

public class SharedPreferences {

    public String getString(String nama, Object o) {
        return nama;
    }

    public boolean getBoolean(String isLogin, boolean b) {
        return b;
    }

    public void edit() {
    }

    public class Editor {


        public void putBoolean(String isLogin, boolean b) {
        }

        public void putString(String keyUsername, String username) {
        }

        public void commit() {
        }

        public void clear() {
        };


    }
}
