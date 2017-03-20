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
    if (t == TERM) {
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
  // item *
  static boolean GSearch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GSearch")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GSearch", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // term SEMICOLON
  static boolean GTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GTerm")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = term(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | GTerm
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    if (!r) r = GTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (OR_OP | PIPE_OP) primary_query
  static boolean or_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_query")) return false;
    if (!nextTokenIs(b, "", OR_OP, PIPE_OP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_query_0(b, l + 1);
    r = r && primary_query(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR_OP | PIPE_OP
  private static boolean or_query_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_query_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR_OP);
    if (!r) r = consumeToken(b, PIPE_OP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // or_query | sign_query | QUERY
  static boolean primary_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_query")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = or_query(b, l + 1);
    if (!r) r = sign_query(b, l + 1);
    if (!r) r = consumeToken(b, QUERY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTE primary_query QUOTE
  static boolean quote_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quote_query")) return false;
    if (!nextTokenIs(b, QUOTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, QUOTE);
    p = r; // pin = 1
    r = r && report_error_(b, primary_query(b, l + 1));
    r = p && consumeToken(b, QUOTE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (TILDE_OP | MINUS_OP) primary_query
  static boolean sign_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign_query")) return false;
    if (!nextTokenIs(b, "", MINUS_OP, TILDE_OP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sign_query_0(b, l + 1);
    r = r && primary_query(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TILDE_OP | MINUS_OP
  private static boolean sign_query_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign_query_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TILDE_OP);
    if (!r) r = consumeToken(b, MINUS_OP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_query *
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    int c = current_position_(b);
    while (true) {
      if (!primary_query(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

}
