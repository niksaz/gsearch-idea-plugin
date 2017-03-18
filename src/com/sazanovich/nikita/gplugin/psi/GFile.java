package com.sazanovich.nikita.gplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.sazanovich.nikita.gplugin.GFileType;
import com.sazanovich.nikita.gplugin.GLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class GFile extends PsiFileBase {

    public GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return GFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "G File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
