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

public class GParenExprImpl extends ASTWrapperPsiElement implements GParenExpr {

  public GParenExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GVisitor visitor) {
    visitor.visitParenExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GVisitor) accept((GVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GGExpr getGExpr() {
    return findChildByClass(GGExpr.class);
  }

}
