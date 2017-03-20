// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.sazanovich.nikita.gplugin.psi.impl.*;

public interface GTypes {

  IElementType FACTORIAL_EXPR = new GElementType("FACTORIAL_EXPR");
  IElementType G_EXPR = new GElementType("G_EXPR");
  IElementType G_TERM = new GElementType("G_TERM");
  IElementType IGNORED_OP = new GElementType("IGNORED_OP");
  IElementType LITERAL_EXPR = new GElementType("LITERAL_EXPR");
  IElementType MUL_EXPR = new GElementType("MUL_EXPR");
  IElementType OR_QUERY = new GElementType("OR_QUERY");
  IElementType PAREN_EXPR = new GElementType("PAREN_EXPR");
  IElementType PLUS_EXPR = new GElementType("PLUS_EXPR");
  IElementType QUOTE_QUERY = new GElementType("QUOTE_QUERY");
  IElementType SIGN_QUERY = new GElementType("SIGN_QUERY");

  IElementType COMMENT = new GTokenType("COMMENT");
  IElementType DEFINE = new GTokenType("DEFINE");
  IElementType DIV_OP = new GTokenType("DIV_OP");
  IElementType FACT_OP = new GTokenType("FACT_OP");
  IElementType FLOAT = new GTokenType("FLOAT");
  IElementType LEFT_BRACKET = new GTokenType("LEFT_BRACKET");
  IElementType MINUS_OP = new GTokenType("MINUS_OP");
  IElementType MULT_OP = new GTokenType("MULT_OP");
  IElementType NUMBER = new GTokenType("NUMBER");
  IElementType OR_OP = new GTokenType("OR_OP");
  IElementType PIPE_OP = new GTokenType("PIPE_OP");
  IElementType PLUS_OP = new GTokenType("PLUS_OP");
  IElementType QUERY = new GTokenType("QUERY");
  IElementType QUOTE = new GTokenType("QUOTE");
  IElementType RIGHT_BRACKET = new GTokenType("RIGHT_BRACKET");
  IElementType SEMICOLON = new GTokenType("SEMICOLON");
  IElementType TILDE_OP = new GTokenType("TILDE_OP");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == FACTORIAL_EXPR) {
        return new GFactorialExprImpl(node);
      }
      else if (type == G_EXPR) {
        return new GGExprImpl(node);
      }
      else if (type == G_TERM) {
        return new GGTermImpl(node);
      }
      else if (type == IGNORED_OP) {
        return new GIgnoredOpImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new GLiteralExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new GMulExprImpl(node);
      }
      else if (type == OR_QUERY) {
        return new GOrQueryImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new GParenExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new GPlusExprImpl(node);
      }
      else if (type == QUOTE_QUERY) {
        return new GQuoteQueryImpl(node);
      }
      else if (type == SIGN_QUERY) {
        return new GSignQueryImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
