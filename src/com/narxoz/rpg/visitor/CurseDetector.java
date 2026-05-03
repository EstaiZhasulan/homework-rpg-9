package com.narxoz.rpg.visitor;

import com.narxoz.rpg.artifact.*;
import java.util.ArrayList;
import java.util.List;

public class CurseDetector implements ArtifactVisitor {

    private final List<String> cursedArtifacts = new ArrayList<>();

    public List<String> getCursedArtifacts() { return List.copyOf(cursedArtifacts); }

    @Override
    public void visit(Weapon weapon) {
    }

    @Override
    public void visit(Potion potion) {
    }

    @Override
    public void visit(Scroll scroll) {
    }

    @Override
    public void visit(Ring ring) {
    }

    @Override
    public void visit(Armor armor) {
    }
}