// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GPlusExpr extends PsiElement {

  @Nullable
  GFactorialExpr getFactorialExpr();

  @Nullable
  GLiteralExpr getLiteralExpr();

  @NotNull
  List<GMulExpr> getMulExprList();

  @Nullable
  GParenExpr getParenExpr();

}
