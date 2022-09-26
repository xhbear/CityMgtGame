package factions.undead.zombie;

import factions.undead.Zombie;

public class MutantI implements Zombie {
    @Override
    public int attack() {
        return 10;
    }
}
