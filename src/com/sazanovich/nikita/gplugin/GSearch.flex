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

InputCharacter = [^\ \t\r\n\f]
Comment = ("!")[^(\r|\n|\r\n)]*

Or = "OR"

%state AFTER_DEFINE

%%

<YYINITIAL> {
    {Comment}           { yybegin(YYINITIAL); return GTypes.COMMENT; }
    {Or}                { yybegin(YYINITIAL); return GTypes.OR; }
    {InputCharacter}+   { yybegin(YYINITIAL); return GTypes.QUERY; }
    {AnySpace}+         { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
}

.                       { return TokenType.BAD_CHARACTER; }
