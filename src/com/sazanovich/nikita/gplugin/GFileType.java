package com.sazanovich.nikita.gplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class GFileType extends LanguageFileType {

    public static final GFileType INSTANCE = new GFileType();

    @NotNull
    @Override
    public String getName() {
        return "GSearch file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Google Search Query file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gquery";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GIcons.FILE_ICON;
    }

    private GFileType() {
        super(GLanguage.INSTANCE);
    }
}
