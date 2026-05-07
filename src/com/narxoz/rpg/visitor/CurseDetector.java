package com.narxoz.rpg.visitor;

import com.narxoz.rpg.artifact.*;
import java.util.ArrayList;
import java.util.List;

public class CurseDetector implements ArtifactVisitor {

    private final List<String> cursedArtifacts = new ArrayList<>();

    public List<String> getCursedArtifacts() { return List.copyOf(cursedArtifacts); }

    @Override
    public void visit(Weapon weapon) {
        if (weapon.getAttackBonus() >= 10) {
            cursedArtifacts.add(weapon.getName());
            System.out.println("  [CurseDetector] *** CURSED *** " + weapon.getName()
                    + " — ATK bonus too high (" + weapon.getAttackBonus() + "). Dark energy!");
        } else {
            System.out.println("  [CurseDetector] " + weapon.getName() + " — weapon safe.");
        }
    }

    @Override
    public void visit(Potion potion) {
    }

    @Override
    public void visit(Scroll scroll) {
        String spell = scroll.getSpellName().toLowerCase();
        if (spell.contains("death") || spell.contains("doom") || spell.contains("curse")) {
            cursedArtifacts.add(scroll.getName());
            System.out.println("  [CurseDetector] *** CURSED *** " + scroll.getName()
                    + " — dark spell: [" + scroll.getSpellName() + "]!");
        } else {
            System.out.println("  [CurseDetector] " + scroll.getName()
                    + " — scroll safe. Spell: " + scroll.getSpellName());
        }
    }

    @Override
    public void visit(Ring ring) {
        if (ring.getMagicBonus() >= 15) {
            cursedArtifacts.add(ring.getName());
            System.out.println("  [CurseDetector] *** CURSED *** " + ring.getName()
                    + " — magic bonus dangerously high (" + ring.getMagicBonus() + ")!");
        } else {
            System.out.println("  [CurseDetector] " + ring.getName() + " — ring safe.");
        }
    }

    @Override
    public void visit(Armor armor) {
    }
}