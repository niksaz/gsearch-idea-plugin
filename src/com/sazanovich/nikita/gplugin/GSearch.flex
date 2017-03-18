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

CRLF = [\r\n]
WHITE_SPACE = [\ \t\f\r\n]
TEXT_CHARACTER = [^\r\n]
END_OF_LINE_COMMENT = ("!")[^\r\n]*
DEFINE = "define:"

%state AFTER_DEFINE

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return GTypes.COMMENT; }

<YYINITIAL> {DEFINE}                                        { yybegin(AFTER_DEFINE); return GTypes.DEFINE; }

<AFTER_DEFINE> {TEXT_CHARACTER}*                            { yybegin(YYINITIAL); return GTypes.TEXT; }

<AFTER_DEFINE> {CRLF}                                       { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
