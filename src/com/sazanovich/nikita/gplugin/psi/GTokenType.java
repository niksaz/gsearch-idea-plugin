package com.sazanovich.nikita.gplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.sazanovich.nikita.gplugin.GLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GTokenType extends IElementType {

    public GTokenType(@NotNull @NonNls String debugName) {
        super(debugName, GLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GTokenType." + super.toString();
    }
}
