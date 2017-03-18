// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.sazanovich.nikita.gplugin.psi.impl.*;

public interface GTypes {

  IElementType QUERY = new GElementType("QUERY");

  IElementType COMMENT = new GTokenType("COMMENT");
  IElementType DEFINE = new GTokenType("DEFINE");
  IElementType TEXT = new GTokenType("TEXT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == QUERY) {
        return new GQueryImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
