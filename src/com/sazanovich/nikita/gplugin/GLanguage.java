package com.sazanovich.nikita.gplugin;

import com.intellij.lang.Language;

public class GLanguage extends Language {

    public static final GLanguage INSTANCE = new GLanguage();

    private GLanguage() {
        super("Google Search Query Language");
    }
}
