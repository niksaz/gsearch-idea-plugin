// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.sazanovich.nikita.gplugin.psi.impl.*;

public interface GTypes {

  IElementType TERM = new GElementType("TERM");

  IElementType COMMENT = new GTokenType("COMMENT");
  IElementType MINUS_OP = new GTokenType("MINUS_OP");
  IElementType QUERY = new GTokenType("query");
  IElementType QUOTE = new GTokenType("QUOTE");
  IElementType TILDE_OP = new GTokenType("TILDE_OP");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == TERM) {
        return new GTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
