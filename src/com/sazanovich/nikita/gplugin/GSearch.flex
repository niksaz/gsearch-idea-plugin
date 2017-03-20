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

InputCharacter = [^\ \t\r\n\f\|\;\~\+\-\/\*\!\(\)\"]
Comment = ("#")[^(\r|\n|\r\n)]*
Semicolon = ";"

Or = "OR"
Pipe = "|"
Tilde = "~"

Plus = "+"
Minus = "-"
Div = "/"
Mult = "*"
Fact = "!"

LeftBracket = "("
RightBracket = ")"
Quote = "\""
Number = [0123456789]+
Float = {Number}("."){Number}

%state AFTER_DEFINE

%%

<YYINITIAL> {
    {Comment}           { yybegin(YYINITIAL); return GTypes.COMMENT; }
    {Semicolon}         { yybegin(YYINITIAL); return GTypes.SEMICOLON; }

    {Or}                { yybegin(YYINITIAL); return GTypes.OR_OP; }
    {Pipe}              { yybegin(YYINITIAL); return GTypes.PIPE_OP; }
    {Tilde}             { yybegin(YYINITIAL); return GTypes.TILDE_OP; }

    {Plus}              { yybegin(YYINITIAL); return GTypes.PLUS_OP; }
    {Minus}             { yybegin(YYINITIAL); return GTypes.MINUS_OP; }
    {Div}               { yybegin(YYINITIAL); return GTypes.DIV_OP; }
    {Mult}              { yybegin(YYINITIAL); return GTypes.MULT_OP; }
    {Fact}              { yybegin(YYINITIAL); return GTypes.FACT_OP; }

    {LeftBracket}       { yybegin(YYINITIAL); return GTypes.LEFT_BRACKET; }
    {RightBracket}      { yybegin(YYINITIAL); return GTypes.RIGHT_BRACKET; }
    {Float}             { yybegin(YYINITIAL); return GTypes.FLOAT; }
    {Number}            { yybegin(YYINITIAL); return GTypes.NUMBER; }
    {Quote}             { yybegin(YYINITIAL); return GTypes.QUOTE; }

    {InputCharacter}+   { yybegin(YYINITIAL); return GTypes.QUERY; }
    {AnySpace}+         { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

.                       { return TokenType.BAD_CHARACTER; }
