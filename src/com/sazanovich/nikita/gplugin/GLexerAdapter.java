package com.sazanovich.nikita.gplugin;

import com.intellij.lexer.FlexAdapter;

public class GLexerAdapter extends FlexAdapter {

    public GLexerAdapter() {
        super(new GLexer(null));
    }
}
