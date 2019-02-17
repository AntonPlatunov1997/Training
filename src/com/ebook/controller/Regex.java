package com.ebook.controller;

interface Regex {
    public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static final String NAME = "([A-Z][a-z]*)([\\s\\\'-][A-Z][a-z]*)*";
    public static final String SURNAME = "([A-Z][a-z]*)([\\s\\\'-][A-Z][a-z]*)*";
    public static final String PASSWORD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$";
}
