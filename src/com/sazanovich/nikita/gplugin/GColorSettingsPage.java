//package com.sazanovich.nikita.gplugin;
//
//import com.intellij.openapi.editor.colors.TextAttributesKey;
//import com.intellij.openapi.fileTypes.SyntaxHighlighter;
//import com.intellij.openapi.options.colors.AttributesDescriptor;
//import com.intellij.openapi.options.colors.ColorDescriptor;
//import com.intellij.openapi.options.colors.ColorSettingsPage;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import javax.swing.*;
//import java.util.Map;
//
//public class GColorSettingsPage implements ColorSettingsPage {
//
//    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
//            new AttributesDescriptor("Keyword", GSyntaxHighlighter.OPERATOR),
//            new AttributesDescriptor("Query", GSyntaxHighlighter.QUERY),
//            new AttributesDescriptor("Comment", GSyntaxHighlighter.COMMENT)
//    };
//
//
//    @Nullable
//    @Override
//    public Icon getIcon() {
//        return GIcons.FILE_ICON;
//    }
//
//    @NotNull
//    @Override
//    public SyntaxHighlighter getHighlighter() {
//        return new GSyntaxHighlighter();
//    }
//
//    @NotNull
//    @Override
//    public String getDemoText() {
//        return  "! hello\n" +
//                "define:meaning\n" +
//                "\n" +
//                "! it's just to test keywords\n" +
//                "\n" +
//                "define:pragmatism\n" +
//                "\n" +
//                "! what is this?";
//    }
//
//    @Nullable
//    @Override
//    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
//        return null;
//    }
//
//    @NotNull
//    @Override
//    public AttributesDescriptor[] getAttributeDescriptors() {
//        return DESCRIPTORS;
//    }
//
//    @NotNull
//    @Override
//    public ColorDescriptor[] getColorDescriptors() {
//        return ColorDescriptor.EMPTY_ARRAY;
//    }
//
//    @NotNull
//    @Override
//    public String getDisplayName() {
//        return "Google Search Query";
//    }
//}
