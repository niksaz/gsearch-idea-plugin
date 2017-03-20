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

public class GGTermImpl extends ASTWrapperPsiElement implements GGTerm {

  public GGTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GVisitor visitor) {
    visitor.visitGTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GVisitor) accept((GVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GIgnoredOp> getIgnoredOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GIgnoredOp.class);
  }

  @Override
  @NotNull
  public List<GOrQuery> getOrQueryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GOrQuery.class);
  }

  @Override
  @NotNull
  public List<GQuoteQuery> getQuoteQueryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GQuoteQuery.class);
  }

  @Override
  @NotNull
  public List<GSignQuery> getSignQueryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GSignQuery.class);
  }

}
