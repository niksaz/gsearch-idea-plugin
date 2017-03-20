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
    if (t == G_EXPR) {
      r = GExpr(b, 0);
    }
    else if (t == G_PREFIX_TERM) {
      r = GPrefixTerm(b, 0);
    }
    else if (t == G_TERM) {
      r = GTerm(b, 0);
    }
    else if (t == FACTORIAL_EXPR) {
      r = factorial_expr(b, 0);
    }
    else if (t == IGNORED_OP) {
      r = ignored_op(b, 0);
    }
    else if (t == LITERAL_EXPR) {
      r = literal_expr(b, 0);
    }
    else if (t == MUL_EXPR) {
      r = mul_expr(b, 0);
    }
    else if (t == OR_QUERY) {
      r = or_query(b, 0);
    }
    else if (t == PAREN_EXPR) {
      r = paren_expr(b, 0);
    }
    else if (t == PLUS_EXPR) {
      r = plus_expr(b, 0);
    }
    else if (t == QUOTE_QUERY) {
      r = quote_query(b, 0);
    }
    else if (t == SIGN_QUERY) {
      r = sign_query(b, 0);
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
  // factor plus_expr *
  public static boolean GExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_EXPR, "<g expr>");
    r = factor(b, l + 1);
    r = r && GExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // plus_expr *
  private static boolean GExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GExpr_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!plus_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GExpr_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // "define:" GTerm
  public static boolean GPrefixTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GPrefixTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, G_PREFIX_TERM, "<g prefix term>");
    r = consumeToken(b, "define:");
    r = r && GTerm(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (GExpr | GPrefixTerm | GTerm) SEMICOLON
  static boolean GQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GQuery")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GQuery_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // GExpr | GPrefixTerm | GTerm
  private static boolean GQuery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GQuery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = GExpr(b, l + 1);
    if (!r) r = GPrefixTerm(b, l + 1);
    if (!r) r = GTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // primary_query *
  public static boolean GTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GTerm")) return false;
    Marker m = enter_section_(b, l, _NONE_, G_TERM, "<g term>");
    int c = current_position_(b);
    while (true) {
      if (!primary_query(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GTerm", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // primary mul_expr *
  static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && factor_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mul_expr *
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!mul_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "factor_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // FACT_OP
  public static boolean factorial_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factorial_expr")) return false;
    if (!nextTokenIs(b, FACT_OP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FACT_OP);
    exit_section_(b, m, FACTORIAL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // FACT_OP | PLUS_OP | MULT_OP | DIV_OP
  public static boolean ignored_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ignored_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IGNORED_OP, "<ignored op>");
    r = consumeToken(b, FACT_OP);
    if (!r) r = consumeToken(b, PLUS_OP);
    if (!r) r = consumeToken(b, MULT_OP);
    if (!r) r = consumeToken(b, DIV_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | GQuery
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    if (!r) r = GQuery(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER | FLOAT
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    if (!nextTokenIs(b, "<literal expr>", FLOAT, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, FLOAT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mul_op primary
  public static boolean mul_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr")) return false;
    if (!nextTokenIs(b, "<mul expr>", DIV_OP, MULT_OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MUL_EXPR, "<mul expr>");
    r = mul_op(b, l + 1);
    r = r && primary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MULT_OP | DIV_OP
  static boolean mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_op")) return false;
    if (!nextTokenIs(b, "", DIV_OP, MULT_OP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULT_OP);
    if (!r) r = consumeToken(b, DIV_OP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (OR_OP | PIPE_OP) primary_query
  public static boolean or_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_query")) return false;
    if (!nextTokenIs(b, "<or query>", OR_OP, PIPE_OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, OR_QUERY, "<or query>");
    r = or_query_0(b, l + 1);
    r = r && primary_query(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // LEFT_BRACKET GExpr RIGHT_BRACKET
  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PAREN_EXPR, null);
    r = consumeToken(b, LEFT_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, GExpr(b, l + 1));
    r = p && consumeToken(b, RIGHT_BRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // plus_op factor
  public static boolean plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr")) return false;
    if (!nextTokenIs(b, "<plus expr>", MINUS_OP, PLUS_OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_EXPR, "<plus expr>");
    r = plus_op(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PLUS_OP | MINUS_OP
  static boolean plus_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_op")) return false;
    if (!nextTokenIs(b, "", MINUS_OP, PLUS_OP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS_OP);
    if (!r) r = consumeToken(b, MINUS_OP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_inner factorial_expr ?
  static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_inner(b, l + 1);
    r = r && primary_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // factorial_expr ?
  private static boolean primary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_1")) return false;
    factorial_expr(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // literal_expr | paren_expr
  static boolean primary_inner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_inner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = literal_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // quote_query | or_query | sign_query | QUERY | ignored_op
  static boolean primary_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_query")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = quote_query(b, l + 1);
    if (!r) r = or_query(b, l + 1);
    if (!r) r = sign_query(b, l + 1);
    if (!r) r = consumeToken(b, QUERY);
    if (!r) r = ignored_op(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTE primary_query QUOTE
  public static boolean quote_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quote_query")) return false;
    if (!nextTokenIs(b, QUOTE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, QUOTE_QUERY, null);
    r = consumeToken(b, QUOTE);
    p = r; // pin = 1
    r = r && report_error_(b, primary_query(b, l + 1));
    r = p && consumeToken(b, QUOTE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (TILDE_OP | MINUS_OP) primary_query
  public static boolean sign_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign_query")) return false;
    if (!nextTokenIs(b, "<sign query>", MINUS_OP, TILDE_OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SIGN_QUERY, "<sign query>");
    r = sign_query_0(b, l + 1);
    r = r && primary_query(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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

}
