package io.github.coolmineman.cheaterdeleter.mixin;

import net.minecraft.entity.passive.AbstractHorseEntity;
import org.spongepowered.asm.mixin.Mixin;

import io.github.coolmineman.cheaterdeleter.objects.entity.CDHorseBaseEntity;

@Mixin(AbstractHorseEntity.class)
public abstract class HorseBaseEntityMixin implements CDHorseBaseEntity {
    
}
