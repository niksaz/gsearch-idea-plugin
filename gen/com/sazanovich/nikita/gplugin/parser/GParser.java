// This is a generated file. Not intended for manual editing.
package com.sazanovich.nikita.gplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.sazanovich.nikita.gplugin.psi.GTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == AND_TERM) {
      r = and_term(b, 0);
    }
    else if (t == OR_TERM) {
      r = or_term(b, 0);
    }
    else if (t == TERM) {
      r = term(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return GSearch(b, l + 1);
  }

  /* ********************************************************** */
  // item_*
  static boolean GSearch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GSearch")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GSearch", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // term term
  public static boolean and_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_term")) return false;
    if (!nextTokenIs(b, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, AND_TERM, r);
    return r;
  }

  /* ********************************************************** */
  // term | COMMENT
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    if (!nextTokenIs(b, "", COMMENT, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // term OR term
  public static boolean or_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_term")) return false;
    if (!nextTokenIs(b, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term(b, l + 1);
    r = r && consumeToken(b, OR);
    r = r && term(b, l + 1);
    exit_section_(b, m, OR_TERM, r);
    return r;
  }

  /* ********************************************************** */
  // or_term | and_term | query
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    if (!nextTokenIs(b, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_term(b, l + 1);
    if (!r) r = and_term(b, l + 1);
    if (!r) r = consumeToken(b, QUERY);
    exit_section_(b, m, TERM, r);
    return r;
  }

}
