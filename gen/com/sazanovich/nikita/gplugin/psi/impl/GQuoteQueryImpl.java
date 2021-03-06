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

public class GQuoteQueryImpl extends ASTWrapperPsiElement implements GQuoteQuery {

  public GQuoteQueryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GVisitor visitor) {
    visitor.visitQuoteQuery(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GVisitor) accept((GVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GIgnoredOp getIgnoredOp() {
    return findChildByClass(GIgnoredOp.class);
  }

  @Override
  @Nullable
  public GOrQuery getOrQuery() {
    return findChildByClass(GOrQuery.class);
  }

  @Override
  @Nullable
  public GQuoteQuery getQuoteQuery() {
    return findChildByClass(GQuoteQuery.class);
  }

  @Override
  @Nullable
  public GSignQuery getSignQuery() {
    return findChildByClass(GSignQuery.class);
  }

}
