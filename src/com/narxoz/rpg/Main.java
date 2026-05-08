package com.narxoz.rpg;

import com.narxoz.rpg.artifact.*;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.vault.ChronomancerEngine;
import com.narxoz.rpg.vault.VaultRunResult;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Homework 9 Demo: Visitor + Memento ===\n");

        Inventory erlanInventory = new Inventory();
        erlanInventory.addArtifact(new Weapon("Short Sword", 50, 3, 3));
        erlanInventory.addArtifact(new Potion("Minor Heal",  20, 1, 15));

        Hero erlan = new Hero("Erlan", 120, 80, 25, 10, 200, erlanInventory);

        Inventory aishaInventory = new Inventory();
        aishaInventory.addArtifact(new Ring("Mana Ring", 100, 1, 5));
        aishaInventory.addArtifact(new Scroll("Scroll of Light", 60, 1, "Light Bolt"));

        Hero aisha = new Hero("Aisha", 100, 150, 15, 8, 350, aishaInventory);

        List<Hero> party = Arrays.asList(erlan, aisha);

        System.out.println("=== Party ===");
        for (Hero h : party) {
            System.out.println("  " + h);
            System.out.println("    Inventory (" + h.getInventory().size() + " items):");
            h.getInventory().getArtifacts()
                    .forEach(a -> System.out.println("      - " + a.getName()));
        }

        ChronomancerEngine engine = new ChronomancerEngine();
        VaultRunResult result = engine.runVault(party);

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║           VAULT RUN COMPLETE             ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.printf( "║  Artifacts appraised : %-18d ║%n", result.getArtifactsAppraised());
        System.out.printf( "║  Mementos created    : %-18d ║%n", result.getMementosCreated());
        System.out.printf( "║  Heroes restored     : %-18d ║%n", result.getRestoredCount());
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("\nRaw result: " + result);

        System.out.println("\nFinal party status:");
        for (Hero h : party) System.out.println("  " + h);
    }
}
