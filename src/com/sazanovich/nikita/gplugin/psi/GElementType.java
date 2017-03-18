package com.sazanovich.nikita.gplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.sazanovich.nikita.gplugin.GLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GElementType extends IElementType {

    public GElementType(@NotNull @NonNls String debugName) {
        super(debugName, GLanguage.INSTANCE);
    }
}
