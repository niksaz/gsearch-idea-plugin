// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class GVisitor extends PsiElementVisitor {

  public void visitAndTerm(@NotNull GAndTerm o) {
    visitPsiElement(o);
  }

  public void visitOrTerm(@NotNull GOrTerm o) {
    visitPsiElement(o);
  }

  public void visitTerm(@NotNull GTerm o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
