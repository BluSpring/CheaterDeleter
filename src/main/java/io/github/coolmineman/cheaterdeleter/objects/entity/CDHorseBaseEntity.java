package io.github.coolmineman.cheaterdeleter.objects.entity;

import net.minecraft.entity.passive.AbstractHorseEntity;

public interface CDHorseBaseEntity extends CDEntity {

    @Override
    default double getBaseMaxJumpHeight() {
        return (asMcHorseBaseEntity().getJumpStrength() * 4); //What is this
    }
    
    default AbstractHorseEntity asMcHorseBaseEntity() {
        return (AbstractHorseEntity) this;
    }

    public static CDPlayer of(AbstractHorseEntity mcPlayer) {
        return ((CDPlayer)mcPlayer);
    }
}
