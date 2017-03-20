// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.sazanovich.nikita.gplugin.psi.GTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.sazanovich.nikita.gplugin.psi.*;

public class GPlusExprImpl extends ASTWrapperPsiElement implements GPlusExpr {

  public GPlusExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GVisitor visitor) {
    visitor.visitPlusExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GVisitor) accept((GVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GFactorialExpr getFactorialExpr() {
    return findChildByClass(GFactorialExpr.class);
  }

  @Override
  @Nullable
  public GLiteralExpr getLiteralExpr() {
    return findChildByClass(GLiteralExpr.class);
  }

  @Override
  @NotNull
  public List<GMulExpr> getMulExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GMulExpr.class);
  }

  @Override
  @Nullable
  public GParenExpr getParenExpr() {
    return findChildByClass(GParenExpr.class);
  }

}
