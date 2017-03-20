package com.sazanovich.nikita.gplugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.sazanovich.nikita.gplugin.psi.GTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class GSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("G_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("G_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("G_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("G_QUOTE", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey QUERY =
            createTextAttributesKey("G_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("G_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("G_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] QUERY_KEYS = new TextAttributesKey[]{QUERY};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHARACTER_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(GTypes.DEFINE)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(GTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(GTypes.TILDE_OP) || tokenType.equals(GTypes.MINUS_OP) ||
                   tokenType.equals(GTypes.OR_OP) || tokenType.equals(GTypes.PIPE_OP) ||
                   tokenType.equals(GTypes.FACT_OP) || tokenType.equals(GTypes.PLUS_OP) ||
                   tokenType.equals(GTypes.DIV_OP) || tokenType.equals(GTypes.MULT_OP))  {
            return OPERATOR_KEYS;
        } else if (tokenType.equals(GTypes.QUOTE) || tokenType.equals(GTypes.LEFT_BRACKET) ||
                tokenType.equals(GTypes.RIGHT_BRACKET)) {
            return BRACKETS_KEYS;
        } else if (tokenType.equals(GTypes.G_TERM)) {
            return QUERY_KEYS;
        } else if (tokenType.equals(GTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARACTER_KEYS;
        }
        return EMPTY_KEYS;
    }
}
