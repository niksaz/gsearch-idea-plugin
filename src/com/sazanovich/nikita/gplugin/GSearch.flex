package com.sazanovich.nikita.gplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.sazanovich.nikita.gplugin.psi.GTypes;
import com.intellij.psi.TokenType;

%%

%class GLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

LineTerminator = \r|\n|\r\n
WhiteSpace = [ \t]
AnySpace = {LineTerminator} | {WhiteSpace} | [\f]

InputCharacter = [^\ \t\r\n\f;]
Comment = ("!")[^(\r|\n|\r\n)]*

Or = "OR"
Semicolon = ";"
Tilde = "~"
Minus = "-"
Quote = "\""

%state AFTER_DEFINE

%%

<YYINITIAL> {
    {Comment}           { yybegin(YYINITIAL); return GTypes.COMMENT; }
    {Semicolon}         { yybegin(YYINITIAL); return GTypes.SEMICOLON; }
    {Quote}             { yybegin(YYINITIAL); return GTypes.QUOTE; }
    {Tilde}             { yybegin(YYINITIAL); return GTypes.TILDE_OP; }
    {Minus}             { yybegin(YYINITIAL); return GTypes.MINUS_OP; }
    {InputCharacter}+   { yybegin(YYINITIAL); return GTypes.QUERY; }
    {AnySpace}+         { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

.                       { return TokenType.BAD_CHARACTER; }
