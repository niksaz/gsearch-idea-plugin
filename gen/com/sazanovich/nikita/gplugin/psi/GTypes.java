// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.sazanovich.nikita.gplugin.psi.impl.*;

public interface GTypes {

  IElementType AND_TERM = new GElementType("AND_TERM");
  IElementType OR_TERM = new GElementType("OR_TERM");
  IElementType TERM = new GElementType("TERM");

  IElementType COMMENT = new GTokenType("COMMENT");
  IElementType OR = new GTokenType("OR");
  IElementType QUERY = new GTokenType("query");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == AND_TERM) {
        return new GAndTermImpl(node);
      }
      else if (type == OR_TERM) {
        return new GOrTermImpl(node);
      }
      else if (type == TERM) {
        return new GTermImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
