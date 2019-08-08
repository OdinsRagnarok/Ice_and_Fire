package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityAmphithere;
import com.github.alexthe666.iceandfire.entity.EntityHippocampus;
import com.github.alexthe666.iceandfire.entity.EntityHippogryph;
import com.github.alexthe666.iceandfire.enums.EnumHippogryphTypes;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAmphithere extends ModelDragonBase {
    public AdvancedModelRenderer BodyUpper;
    public AdvancedModelRenderer BodyLower;
    public AdvancedModelRenderer Neck1;
    public AdvancedModelRenderer WingL;
    public AdvancedModelRenderer WingR;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Club;
    public AdvancedModelRenderer TailR1;
    public AdvancedModelRenderer TailL1;
    public AdvancedModelRenderer TailL2;
    public AdvancedModelRenderer TailR2;
    public AdvancedModelRenderer Neck2;
    public AdvancedModelRenderer Neck3;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer HeadFront;
    public AdvancedModelRenderer Jaw;
    public AdvancedModelRenderer CrestL1;
    public AdvancedModelRenderer CrestL2;
    public AdvancedModelRenderer CrestR2;
    public AdvancedModelRenderer CrestR1;
    public AdvancedModelRenderer CrestR3;
    public AdvancedModelRenderer CrestL3;
    public AdvancedModelRenderer CrestRB;
    public AdvancedModelRenderer CrestLB;
    public AdvancedModelRenderer Beak;
    public AdvancedModelRenderer Teeth2;
    public AdvancedModelRenderer Teeth1;
    public AdvancedModelRenderer WingL2;
    public AdvancedModelRenderer WingL3;
    public AdvancedModelRenderer WingL21;
    public AdvancedModelRenderer FingerL1;
    public AdvancedModelRenderer FingerL2;
    public AdvancedModelRenderer FingerL3;
    public AdvancedModelRenderer FingerL4;
    public AdvancedModelRenderer WingR2;
    public AdvancedModelRenderer WingR3;
    public AdvancedModelRenderer WingR21;
    public AdvancedModelRenderer FingerR1;
    public AdvancedModelRenderer FingerR2;
    public AdvancedModelRenderer FingerR3;
    public AdvancedModelRenderer FingerR4;
    private ModelAnimator animator;

    public ModelAmphithere() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.FingerR3 = new AdvancedModelRenderer(this, 40, 80);
        this.FingerR3.mirror = true;
        this.FingerR3.setRotationPoint(0.0F, 11.0F, 4.5F);
        this.FingerR3.addBox(-0.2F, -0.1F, -2.0F, 1, 16, 3, 0.0F);
        this.setRotateAngle(FingerR3, 0.13962634015954636F, 0.0F, 0.0F);
        this.TailR1 = new AdvancedModelRenderer(this, 120, 7);
        this.TailR1.mirror = true;
        this.TailR1.setRotationPoint(0.0F, 0.8F, 8.0F);
        this.TailR1.addBox(-0.5F, 0.0F, 0.0F, 3, 13, 1, 0.0F);
        this.setRotateAngle(TailR1, 1.3962634015954636F, 0.06981317007977318F, 0.0F);
        this.Teeth2 = new AdvancedModelRenderer(this, 6, 16);
        this.Teeth2.mirror = true;
        this.Teeth2.setRotationPoint(0.0F, -0.4F, -3.5F);
        this.Teeth2.addBox(-0.6F, 0.5F, -4.62F, 2, 1, 5, 0.0F);
        this.HeadFront = new AdvancedModelRenderer(this, 8, 32);
        this.HeadFront.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.HeadFront.addBox(-1.5F, -2.8F, -8.8F, 3, 3, 5, 0.0F);
        this.setRotateAngle(HeadFront, -0.22759093446006054F, -0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 6, 54);
        this.Head.setRotationPoint(0.0F, 1.7F, -5.5F);
        this.Head.addBox(-2.0F, -3.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.5462880558742251F, -0.0F, 0.0F);
        this.CrestL3 = new AdvancedModelRenderer(this, 134, 12);
        this.CrestL3.mirror = true;
        this.CrestL3.setRotationPoint(1.1F, -1.3F, -1.0F);
        this.CrestL3.addBox(-1.0F, -1.3F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestL3, 1.7453292519943295F, 0.8726646259971648F, 0.7853981633974483F);
        this.TailL2 = new AdvancedModelRenderer(this, 100, 8);
        this.TailL2.mirror = true;
        this.TailL2.setRotationPoint(0.0F, 0.7F, 1.7F);
        this.TailL2.addBox(-1.0F, 0.0F, 0.0F, 4, 14, 1, 0.0F);
        this.setRotateAngle(TailL2, 1.3962634015954636F, 0.31869712141416456F, 0.0F);
        this.FingerL2 = new AdvancedModelRenderer(this, 50, 80);
        this.FingerL2.setRotationPoint(-0.1F, 11.0F, 2.0F);
        this.FingerL2.addBox(-0.8F, -0.1F, -2.0F, 1, 14, 3, 0.0F);
        this.setRotateAngle(FingerL2, 0.06981317007977318F, 0.0F, 0.0F);
        this.BodyUpper = new AdvancedModelRenderer(this, 67, 47);
        this.BodyUpper.setRotationPoint(0.0F, 15.8F, -10.0F);
        this.BodyUpper.addBox(-3.5F, -2.1F, 0.0F, 7, 8, 7, 0.0F);
        this.CrestLB = new AdvancedModelRenderer(this, 134, 12);
        this.CrestLB.mirror = true;
        this.CrestLB.setRotationPoint(1.1F, -1.4F, 1.2F);
        this.CrestLB.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestLB, 1.7453292519943295F, 0.27314402793711257F, 0.0F);
        this.TailL1 = new AdvancedModelRenderer(this, 120, 7);
        this.TailL1.setRotationPoint(0.0F, 0.8F, 8.0F);
        this.TailL1.addBox(-2.5F, 0.0F, 0.0F, 3, 13, 1, 0.0F);
        this.setRotateAngle(TailL1, 1.3962634015954636F, -0.06981317007977318F, 0.0F);
        this.CrestR3 = new AdvancedModelRenderer(this, 134, 12);
        this.CrestR3.setRotationPoint(-1.1F, -1.3F, -1.0F);
        this.CrestR3.addBox(-1.0F, -1.3F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestR3, 1.7453292519943295F, -0.8726646259971648F, -0.7285004297824331F);
        this.Jaw = new AdvancedModelRenderer(this, 34, 56);
        this.Jaw.setRotationPoint(0.0F, 0.7F, -3.1F);
        this.Jaw.addBox(-1.5F, -0.5F, -5.5F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Jaw, -0.3141592653589793F, -0.0F, 0.0F);
        this.CrestR2 = new AdvancedModelRenderer(this, 134, 12);
        this.CrestR2.setRotationPoint(-1.1F, -1.3F, -1.0F);
        this.CrestR2.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestR2, 1.7453292519943295F, -0.6108652381980153F, -0.3141592653589793F);
        this.Teeth1 = new AdvancedModelRenderer(this, 6, 16);
        this.Teeth1.setRotationPoint(0.0F, -0.4F, -3.5F);
        this.Teeth1.addBox(-1.2F, 0.5F, -4.62F, 2, 1, 5, 0.0F);
        this.WingL3 = new AdvancedModelRenderer(this, 96, 67);
        this.WingL3.mirror = true;
        this.WingL3.setRotationPoint(0.0F, 7.6F, 0.0F);
        this.WingL3.addBox(-0.7F, -0.1F, -2.0F, 1, 14, 10, 0.0F);
        this.setRotateAngle(WingL3, 0.5235987755982988F, 0.0F, 0.0F);
        this.WingR21 = new AdvancedModelRenderer(this, 80, 90);
        this.WingR21.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.WingR21.addBox(-0.78F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
        this.FingerR1 = new AdvancedModelRenderer(this, 60, 80);
        this.FingerR1.mirror = true;
        this.FingerR1.setRotationPoint(0.0F, 11.0F, 0.1F);
        this.FingerR1.addBox(-0.2F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
        this.setRotateAngle(FingerR1, 0.03490658503988659F, 0.0F, 0.0F);
        this.BodyLower = new AdvancedModelRenderer(this, 95, 47);
        this.BodyLower.setRotationPoint(0.0F, 0.3F, 6.7F);
        this.BodyLower.addBox(-3.0F, -1.5F, -1.6F, 6, 6, 10, 0.0F);
        this.setRotateAngle(BodyLower, 0.045553093477052F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 69, 34);
        this.Tail1.setRotationPoint(0.0F, 1.1F, 7.0F);
        this.Tail1.addBox(-2.0F, -2.1F, -0.4F, 4, 5, 8, 0.0F);
        this.setRotateAngle(Tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.FingerR4 = new AdvancedModelRenderer(this, 30, 80);
        this.FingerR4.mirror = true;
        this.FingerR4.setRotationPoint(0.0F, 11.6F, 6.6F);
        this.FingerR4.addBox(-0.1F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
        this.setRotateAngle(FingerR4, 0.2617993877991494F, 0.0F, 0.0F);
        this.WingR2 = new AdvancedModelRenderer(this, 80, 90);
        this.WingR2.setRotationPoint(-0.4F, 7.6F, -2.8F);
        this.WingR2.addBox(-0.4F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
        this.setRotateAngle(WingR2, -0.3490658503988659F, 0.0F, 0.0F);
        this.WingR = new AdvancedModelRenderer(this, 100, 107);
        this.WingR.setRotationPoint(-3.0F, -0.5F, 5.0F);
        this.WingR.addBox(-0.9F, 0.0F, -5.0F, 1, 8, 12, 0.0F);
        this.setRotateAngle(WingR, 0.08726646259971647F, 0.0F, 1.3962634015954636F);
        this.WingL2 = new AdvancedModelRenderer(this, 80, 90);
        this.WingL2.mirror = true;
        this.WingL2.setRotationPoint(0.4F, 7.6F, -2.8F);
        this.WingL2.addBox(-0.6F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
        this.setRotateAngle(WingL2, -0.3490658503988659F, 0.0F, 0.0F);
        this.CrestL2 = new AdvancedModelRenderer(this, 134, 12);
        this.CrestL2.mirror = true;
        this.CrestL2.setRotationPoint(1.1F, -1.3F, -1.0F);
        this.CrestL2.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestL2, 1.7453292519943295F, 0.6108652381980153F, 0.3141592653589793F);
        this.FingerL3 = new AdvancedModelRenderer(this, 40, 80);
        this.FingerL3.setRotationPoint(0.0F, 11.0F, 4.4F);
        this.FingerL3.addBox(-0.8F, -0.1F, -2.0F, 1, 16, 3, 0.0F);
        this.setRotateAngle(FingerL3, 0.13962634015954636F, 0.0F, 0.0F);
        this.FingerR2 = new AdvancedModelRenderer(this, 50, 80);
        this.FingerR2.mirror = true;
        this.FingerR2.setRotationPoint(0.1F, 11.0F, 2.0F);
        this.FingerR2.addBox(-0.2F, -0.1F, -2.0F, 1, 14, 3, 0.0F);
        this.setRotateAngle(FingerR2, 0.06981317007977318F, 0.0F, 0.0F);
        this.FingerL1 = new AdvancedModelRenderer(this, 60, 80);
        this.FingerL1.setRotationPoint(0.0F, 11.0F, 0.1F);
        this.FingerL1.addBox(-0.8F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
        this.setRotateAngle(FingerL1, 0.03490658503988659F, 0.0F, 0.0F);
        this.Beak = new AdvancedModelRenderer(this, 7, 45);
        this.Beak.setRotationPoint(0.0F, -1.7F, -7.7F);
        this.Beak.addBox(-1.0F, -1.4F, -3.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Beak, 0.6981317007977318F, -0.0F, 0.0F);
        this.WingL = new AdvancedModelRenderer(this, 100, 107);
        this.WingL.mirror = true;
        this.WingL.setRotationPoint(3.0F, -0.5F, 5.0F);
        this.WingL.addBox(-0.1F, 0.0F, -5.0F, 1, 8, 12, 0.0F);
        this.setRotateAngle(WingL, 0.08726646259971647F, 0.0F, -1.3962634015954636F);
        this.CrestL1 = new AdvancedModelRenderer(this, 134, 12);
        this.CrestL1.setRotationPoint(0.9F, -2.0F, -1.0F);
        this.CrestL1.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestL1, 1.7453292519943295F, 0.08726646259971647F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 70, 21);
        this.Tail3.setRotationPoint(0.0F, -0.1F, 7.7F);
        this.Tail3.addBox(-1.0F, -1.3F, -0.2F, 2, 3, 9, 0.0F);
        this.setRotateAngle(Tail3, 0.091106186954104F, 0.0F, 0.0F);
        this.Club = new AdvancedModelRenderer(this, 42, 17);
        this.Club.setRotationPoint(0.0F, -0.7F, 7.5F);
        this.Club.addBox(-2.0F, -0.4F, 0.3F, 4, 2, 8, 0.0F);
        this.setRotateAngle(Club, 0.091106186954104F, 0.0F, 0.0F);
        this.Neck2 = new AdvancedModelRenderer(this, 37, 44);
        this.Neck2.setRotationPoint(0.0F, -0.1F, -3.8F);
        this.Neck2.addBox(-1.5F, -1.7F, -6.4F, 3, 5, 7, 0.0F);
        this.setRotateAngle(Neck2, -0.091106186954104F, -0.0F, 0.0F);
        this.CrestR1 = new AdvancedModelRenderer(this, 134, 12);
        this.CrestR1.mirror = true;
        this.CrestR1.setRotationPoint(-0.9F, -2.0F, -1.0F);
        this.CrestR1.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestR1, 1.7453292519943295F, -0.08726646259971647F, 0.0F);
        this.WingL21 = new AdvancedModelRenderer(this, 80, 90);
        this.WingL21.mirror = true;
        this.WingL21.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.WingL21.addBox(-0.22F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
        this.Neck1 = new AdvancedModelRenderer(this, 57, 64);
        this.Neck1.setRotationPoint(0.0F, 0.6F, 1.8F);
        this.Neck1.addBox(-2.0F, -2.3F, -5.0F, 4, 6, 6, 0.0F);
        this.setRotateAngle(Neck1, 0.136659280431156F, -0.0F, -0.045553093477052F);
        this.FingerL4 = new AdvancedModelRenderer(this, 30, 80);
        this.FingerL4.setRotationPoint(0.0F, 11.0F, 6.6F);
        this.FingerL4.addBox(-0.9F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
        this.setRotateAngle(FingerL4, 0.2617993877991494F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 95, 34);
        this.Tail2.setRotationPoint(0.0F, -0.1F, 6.6F);
        this.Tail2.addBox(-1.51F, -1.7F, -0.1F, 3, 4, 8, 0.0F);
        this.setRotateAngle(Tail2, -0.091106186954104F, 0.0F, 0.0F);
        this.Neck3 = new AdvancedModelRenderer(this, 25, 64);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.Neck3.addBox(-1.5F, -1.1F, -7.0F, 3, 4, 8, 0.0F);
        this.setRotateAngle(Neck3, -0.18203784098300857F, -0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 70, 22);
        this.Tail4.setRotationPoint(0.0F, 0.3F, 9.0F);
        this.Tail4.addBox(-1.02F, -1.3F, -0.6F, 2, 2, 9, 0.0F);
        this.setRotateAngle(Tail4, -0.045553093477052F, 0.0F, 0.0F);
        this.TailR2 = new AdvancedModelRenderer(this, 100, 8);
        this.TailR2.setRotationPoint(-2.0F, 0.7F, 1.7F);
        this.TailR2.addBox(-1.0F, 0.0F, 0.0F, 4, 14, 1, 0.0F);
        this.setRotateAngle(TailR2, 1.3962634015954636F, -0.31869712141416456F, 0.0F);
        this.CrestRB = new AdvancedModelRenderer(this, 134, 12);
        this.CrestRB.setRotationPoint(-1.1F, -1.4F, 1.2F);
        this.CrestRB.addBox(-1.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(CrestRB, 1.7453292519943295F, -0.27314402793711257F, 0.0F);
        this.WingR3 = new AdvancedModelRenderer(this, 96, 67);
        this.WingR3.setRotationPoint(0.0F, 7.6F, 0.0F);
        this.WingR3.addBox(-0.3F, -0.1F, -2.0F, 1, 14, 10, 0.0F);
        this.setRotateAngle(WingR3, 0.5235987755982988F, 0.0F, 0.0F);
        this.WingR3.addChild(this.FingerR3);
        this.Club.addChild(this.TailR1);
        this.HeadFront.addChild(this.Teeth2);
        this.Head.addChild(this.HeadFront);
        this.Neck3.addChild(this.Head);
        this.Head.addChild(this.CrestL3);
        this.Club.addChild(this.TailL2);
        this.WingL3.addChild(this.FingerL2);
        this.Head.addChild(this.CrestLB);
        this.Club.addChild(this.TailL1);
        this.Head.addChild(this.CrestR3);
        this.Head.addChild(this.Jaw);
        this.Head.addChild(this.CrestR2);
        this.HeadFront.addChild(this.Teeth1);
        this.WingL2.addChild(this.WingL3);
        this.WingR2.addChild(this.WingR21);
        this.WingR3.addChild(this.FingerR1);
        this.BodyUpper.addChild(this.BodyLower);
        this.BodyLower.addChild(this.Tail1);
        this.WingR3.addChild(this.FingerR4);
        this.WingR.addChild(this.WingR2);
        this.BodyUpper.addChild(this.WingR);
        this.WingL.addChild(this.WingL2);
        this.Head.addChild(this.CrestL2);
        this.WingL3.addChild(this.FingerL3);
        this.WingR3.addChild(this.FingerR2);
        this.WingL3.addChild(this.FingerL1);
        this.HeadFront.addChild(this.Beak);
        this.BodyUpper.addChild(this.WingL);
        this.Head.addChild(this.CrestL1);
        this.Tail2.addChild(this.Tail3);
        this.Tail4.addChild(this.Club);
        this.Neck1.addChild(this.Neck2);
        this.Head.addChild(this.CrestR1);
        this.WingL2.addChild(this.WingL21);
        this.BodyUpper.addChild(this.Neck1);
        this.WingL3.addChild(this.FingerL4);
        this.Tail1.addChild(this.Tail2);
        this.Neck2.addChild(this.Neck3);
        this.Tail3.addChild(this.Tail4);
        this.Club.addChild(this.TailR2);
        this.Head.addChild(this.CrestRB);
        this.WingR2.addChild(this.WingR3);
        this.Jaw.setScale(0.99F, 0.99F, 0.99F);
        this.Neck3.setScale(0.99F, 0.99F, 0.99F);
        animator = ModelAnimator.create();
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        if (this.isChild) {
            this.BodyUpper.setShouldScaleChildren(true);
            this.HeadFront.setShouldScaleChildren(true);
            this.Jaw.setShouldScaleChildren(true);
            this.BodyUpper.setScale(0.5F, 0.5F, 0.5F);
            this.Head.setScale(1.5F, 1.5F, 1.5F);
            this.HeadFront.setScale(1, 1, 1);
            this.HeadFront.rotationPointZ = -2F;
            this.Jaw.rotationPointZ = -4.5F;
            GL11.glTranslatef(0, 0.2F, 0);
        }else{
            this.BodyUpper.setScale(1F, 1F, 1F);
            this.Head.setScale(1F, 1F, 1F);
            this.HeadFront.setScale(1F, 1F, 1F);

        }
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.BodyUpper.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        animator.update(entity);
        animator.setAnimation(EntityAmphithere.ANIMATION_BITE);
        animator.startKeyframe(5);
        this.rotate(animator, Neck1, -39, 0, 0);
        this.rotate(animator, Neck2, -18, 0, 0);
        this.rotate(animator, Neck3, -11, 0, 0);
        this.rotate(animator, Head, 60, 0, 0);
        this.rotate(animator, Jaw, 41, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, Neck1, -19, 0, 0);
        this.rotate(animator, Neck2, 23, 0, 0);
        this.rotate(animator, Neck3, 7, 0, 0);
        this.rotate(animator, Head, 20, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityAmphithere.ANIMATION_BITE_RIDER);
        animator.startKeyframe(5);
        this.rotate(animator, Neck1, 8, 0, 63);
        this.rotate(animator, Neck2, -5, 35, 13);
        this.rotate(animator, Neck3, -10, 70, 0);
        this.rotate(animator, Head, 20, 30, 95);
        this.rotate(animator, Jaw, 40, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, Neck1, 8, 0, 63);
        this.rotate(animator, Neck2, -5, 35, 13);
        this.rotate(animator, Neck3, -10, 70, 0);
        this.rotate(animator, Head, 50, 40, 95);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityAmphithere.ANIMATION_WING_BLAST);
        animator.startKeyframe(5);
        wingBlastPose();
        this.rotateMinus(animator, WingR, 32, 0, 170);
        this.rotateMinus(animator, WingL, 32, 0, -170);
        animator.endKeyframe();
        animator.startKeyframe(5);
        wingBlastPose();
        this.rotateMinus(animator, WingR, 15, 0, 45);
        this.rotateMinus(animator, WingL, 15, 0, -45);
        animator.endKeyframe();
        animator.startKeyframe(5);
        wingBlastPose();
        this.rotateMinus(animator, WingR, 32, 0, 170);
        this.rotateMinus(animator, WingL, 32, 0, -170);
        animator.endKeyframe();
        animator.startKeyframe(5);
        wingBlastPose();
        this.rotateMinus(animator, WingR, 15, 0, 45);
        this.rotateMinus(animator, WingL, 15, 0, -45);
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(EntityAmphithere.ANIMATION_TAIL_WHIP);
        animator.startKeyframe(10);
        this.rotate(animator, BodyUpper, 0, 30, 0);
        this.rotate(animator, BodyLower, 0, 10, 0);
        this.rotate(animator, Tail1, 0, 15, 0);
        this.rotate(animator, Tail2, 0, 10, 0);
        this.rotate(animator, Tail2, 0, 10, 0);
        this.rotate(animator, Tail3, 0, 20, 0);
        this.rotate(animator, Tail4, 0, 15, -20);
        this.rotate(animator, Neck1, 0, -18, -20);
        this.rotate(animator, Neck2, 0, -29, 0);
        this.rotate(animator, Neck3, 0, -44, 0);
        this.rotate(animator, Head, 31, -28, 0);
        this.rotate(animator, WingL, 0, 18, 0);
        this.rotate(animator, WingR, 0, -18, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, BodyUpper, 0, -214, 0);
        this.rotate(animator, BodyLower, 0, -10, 0);
        this.rotate(animator, Tail1, 0, -15, 0);
        this.rotate(animator, Tail2, 0, -7, 0);
        this.rotate(animator, Tail2, 0, -7, 0);
        this.rotate(animator, Tail3, 0, -7, 0);
        this.rotate(animator, Tail4, 0, -15, -20);
        this.rotate(animator, Neck1, 0, 18, -20);
        this.rotate(animator, Neck2, 0, 29, 0);
        this.rotate(animator, Neck3, 0, 44, 0);
        this.rotate(animator, Head, 31, -28, 0);
        this.rotate(animator, WingL, 0, 18, 0);
        this.rotate(animator, WingR, 0, -18, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(7);
        animator.endKeyframe();
        animator.setAnimation(EntityAmphithere.ANIMATION_SPEAK);
        animator.startKeyframe(5);
        this.rotate(animator, Jaw, 31, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
    }

    private void wingBlastPose(){
        animator.move(BodyUpper, 0, -36, 20);
        this.rotateMinus(animator, BodyUpper, -80, 0, 0);
        this.rotateMinus(animator, BodyLower, -10, 0, 0);
        this.rotateMinus(animator, Tail1, -10, 0, 0);
        this.rotateMinus(animator, Tail1, -10, 0, 0);
        this.rotateMinus(animator, Tail2, -10, 0, 0);
        this.rotateMinus(animator, Tail3, -10, 0, 0);
        this.rotateMinus(animator, Tail4, -10, 0, 0);
        this.rotateMinus(animator, Club, -25, 0, 0);
        this.rotate(animator, Neck1, 20, 0, 0);
        this.rotate(animator, Neck2, 32, 0, 0);
        this.rotate(animator, Neck3, 2, 0, 0);
        this.rotate(animator, Head, 80, 0, 0);
        this.rotateMinus(animator, WingR2, -20, 0, -20);
        this.rotateMinus(animator, WingL2, -20, 0, 20);
        this.rotateMinus(animator, WingR3, 16, 0, 0);
        this.rotateMinus(animator, WingL3, 16, 0, 0);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        EntityAmphithere amphithere = (EntityAmphithere) entity;
        float speed_walk = 0.4F;
        float speed_idle = 0.05F;
        float speed_fly = 0.2F;
        float degree_walk = 0.5F;
        float degree_idle = 0.5F;
        float degree_flap = 0.5F * (amphithere.flapProgress / 10F);
        AdvancedModelRenderer[] TAIL = new AdvancedModelRenderer[]{Tail1, Tail2, Tail3, Tail4};
        AdvancedModelRenderer[] ENTIRE_BODY = new AdvancedModelRenderer[]{BodyUpper, BodyLower, Tail1, Tail2, Tail3, Tail4};
        AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck1, Neck2, Neck3};
        if(amphithere.groundProgress >= 10) {
            this.chainSwing(ENTIRE_BODY, speed_walk, 0.125F, 2, f, f1);
            this.chainSwing(NECK, speed_walk, -degree_walk, 4, f, f1);
        }
        this.chainWave(NECK, speed_idle, degree_idle * 0.15F, 4, entity.ticksExisted, 1);
        this.chainSwing(TAIL, speed_idle, degree_idle * 0.1F, 2, entity.ticksExisted, 1);
        this.flap(WingL, speed_fly, degree_flap, false, 0, 0, entity.ticksExisted, 1);
        this.flap(WingR, speed_fly, -degree_flap, false, 0, 0, entity.ticksExisted, 1);
        this.flap(WingL2, speed_fly, degree_flap, false, 0, 0, entity.ticksExisted, 1);
        this.flap(WingR2, speed_fly, -degree_flap, false, 0, 0, entity.ticksExisted, 1);
        {
            float sitProgress = amphithere.diveProgress;
            progressRotation(FingerR4, sitProgress, 0.2617993877991494F, 0.0F, 0.0F);
            progressRotation(WingL2, sitProgress, -0.3490658503988659F, 0.0F, 0.3490658503988659F);
            progressRotation(FingerR1, sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
            progressRotation(FingerL3, sitProgress, 0.13962634015954636F, 0.0F, 0.0F);
            progressRotation(WingR21, sitProgress, 0.0F, 0.0F, 0.0F);
            progressRotation(FingerL1, sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
            progressRotation(WingR, sitProgress, 0.5585053606381855F, 0.0F, 1.6580627893946132F);
            progressRotation(FingerL4, sitProgress, 0.2617993877991494F, 0.0F, 0.0F);
            progressRotation(WingR3, sitProgress, 1.48352986419518F, 0.0F, 0.0F);
            progressRotation(WingR2, sitProgress, -0.3490658503988659F, 0.0F, -0.3490658503988659F);
            progressRotation(WingL3, sitProgress, 1.48352986419518F, 0.0F, 0.0F);
            progressRotation(FingerL2, sitProgress, 0.06981317007977318F, 0.0F, 0.0F);
            progressRotation(FingerR3, sitProgress, 0.13962634015954636F, 0.0F, 0.0F);
            progressRotation(FingerR2, sitProgress, 0.06981317007977318F, 0.0F, 0.0F);
            progressRotation(WingL, sitProgress, 0.5585053606381855F, 0.0F, -1.6580627893946132F);
        }
        {
            float sitProgress = amphithere.groundProgress;
            progressRotation(Tail1, sitProgress, -0.045553093477052F, 0.0F, 0.0F);
            progressRotation(CrestR2, sitProgress, 1.7453292519943295F, -0.6108652381980153F, -0.3141592653589793F);
            progressRotation(FingerR4, sitProgress, -0.2617993877991494F, 0.0F, 0.0F);
            progressRotation(TailL1, sitProgress, 1.3962634015954636F, -0.06981317007977318F, 0.0F);
            progressRotation(Neck2, sitProgress, -0.4553564018453205F, -0.0F, 0.0F);
            progressRotation(FingerR3, sitProgress, -0.13962634015954636F, 0.0F, 0.0F);
            progressRotation(FingerL1, sitProgress, 0.13962634015954636F, 0.0F, 0.0F);
            progressRotation(WingR, sitProgress, 0.08726646259971647F, 0.0F, 1.1344640137963142F);
            progressRotation(FingerL4, sitProgress, -0.2617993877991494F, 0.0F, 0.0F);
            progressRotation(Teeth2, sitProgress, 0.0F, -0.0F, 0.0F);
            progressRotation(FingerR2, sitProgress, 0.0F, 0.0F, 0.0F);
            progressRotation(Beak, sitProgress, 0.6981317007977318F, -0.0F, 0.0F);
            progressRotation(BodyUpper, sitProgress, 0.0F, -0.0F, 0.0F);
            progressRotation(Club, sitProgress, 0.18203784098300857F, 0.0F, 0.0F);
            progressRotation(CrestLB, sitProgress, 1.7453292519943295F, 0.27314402793711257F, 0.0F);
            progressRotation(FingerR1, sitProgress, 0.13962634015954636F, 0.0F, 0.0F);
            progressRotation(HeadFront, sitProgress, -0.22759093446006054F, -0.0F, 0.0F);
            progressRotation(Neck1, sitProgress, -0.18203784098300857F, -0.0F, -0.045553093477052F);
            progressRotation(FingerL2, sitProgress, 0.0F, 0.0F, 0.0F);
            progressRotation(WingR3, sitProgress, 0.12217304763960307F, -0.17453292519943295F, -0.12217304763960307F);
            progressRotation(Teeth1, sitProgress, 0.0F, -0.0F, 0.0F);
            progressRotation(Tail4, sitProgress, -0.045553093477052F, 0.0F, 0.0F);
            progressRotation(WingL3, sitProgress, 0.12217304763960307F, 0.17453292519943295F, 0.12217304763960307F);
            progressRotation(Jaw, sitProgress, -0.31869712141416456F, -0.0F, 0.0F);
            progressRotation(Tail2, sitProgress, 0.091106186954104F, 0.0F, 0.0F);
            progressRotation(CrestRB, sitProgress, 1.7453292519943295F, -0.27314402793711257F, 0.0F);
            progressRotation(BodyLower, sitProgress, -0.136659280431156F, 0.0F, 0.0F);
            progressRotation(CrestR3, sitProgress, 1.7453292519943295F, -0.8726646259971648F, -0.7285004297824331F);
            progressRotation(WingL21, sitProgress, 0.0F, 0.0F, 0.0F);
            progressRotation(Neck3, sitProgress, 0.18203784098300857F, -0.0F, 0.0F);
            progressRotation(TailL2, sitProgress, 1.3962634015954636F, 0.31869712141416456F, 0.0F);
            progressRotation(FingerL3, sitProgress, -0.13962634015954636F, 0.0F, 0.0F);
            progressRotation(CrestL3, sitProgress, 1.7453292519943295F, 0.8726646259971648F, 0.7853981633974483F);
            progressRotation(CrestL2, sitProgress, 1.7453292519943295F, 0.6108652381980153F, 0.3141592653589793F);
            progressRotation(WingR21, sitProgress, 0.0F, 0.0F, 0.0F);
            progressRotation(TailR1, sitProgress, 1.3962634015954636F, 0.06981317007977318F, 0.0F);
            progressRotation(Head, sitProgress, 0.8196066167365371F, -0.0F, 0.0F);
            progressRotation(WingR2, sitProgress, 1.48352986419518F, 0.0F, 0.17453292519943295F);
            progressRotation(WingL, sitProgress, 0.08726646259971647F, 0.0F, -1.1344640137963142F);
            progressRotation(CrestR1, sitProgress, 1.7453292519943295F, -0.08726646259971647F, 0.0F);
            progressRotation(WingL2, sitProgress, 1.48352986419518F, 0.0F, -0.17453292519943295F);
            progressRotation(Tail3, sitProgress, 0.045553093477052F, 0.0F, 0.0F);
            progressRotation(TailR2, sitProgress, 1.3962634015954636F, -0.31869712141416456F, 0.0F);
            progressRotation(CrestL1, sitProgress, 1.7453292519943295F, 0.08726646259971647F, 0.0F);
            progressPosition(BodyUpper, sitProgress, 0, 18, 0);
        }
        {
            float sitProgress = amphithere.sitProgress;
            progressRotation(CrestLB, sitProgress, 1.7453292519943295F, 0.27314402793711257F, 0.0F);
            progressRotation(CrestR1, sitProgress, 1.7453292519943295F, -0.08726646259971647F, 0.0F);
            progressRotation(TailL1, sitProgress, 1.3962634015954636F, -0.06981317007977318F, 0.0F);
            progressRotation(HeadFront, sitProgress, -0.22759093446006054F, -0.0F, 0.0F);
            progressRotation(CrestL1, sitProgress, 1.7453292519943295F, 0.08726646259971647F, 0.0F);
            progressRotation(CrestR3, sitProgress, 1.7453292519943295F, -0.8726646259971648F, -0.7285004297824331F);
            progressRotation(TailR2, sitProgress, 1.3962634015954636F, -0.31869712141416456F, 0.0F);
            progressRotation(Neck2, sitProgress, -0.4553564018453205F, -0.0F, 0.0F);
            progressRotation(Head, sitProgress, 1.3658946726107624F, -0.0F, 0.0F);
            progressRotation(Tail1, sitProgress, 0.0F, 0.7285004297824331F, 0.045553093477052F);
            progressRotation(CrestRB, sitProgress, 1.7453292519943295F, -0.27314402793711257F, 0.0F);
            progressRotation(Jaw, sitProgress, -0.31869712141416456F, -0.0F, 0.0F);
            progressRotation(Tail2, sitProgress, 0.091106186954104F, 0.36425021489121656F, 0.0F);
            progressRotation(Tail3, sitProgress, 0.045553093477052F, 0.36425021489121656F, 0.0F);
            progressRotation(BodyLower, sitProgress, -0.136659280431156F, 0.0F, 0.136659280431156F);
            progressRotation(TailR1, sitProgress, 1.3962634015954636F, 0.06981317007977318F, 0.0F);
            progressRotation(Club, sitProgress, 0.2678394951282524F, 0.7285004297824331F, 0.08580165414524381F);
            progressRotation(TailL2, sitProgress, 1.3962634015954636F, 0.31869712141416456F, 0.0F);
            progressRotation(CrestL3, sitProgress, 1.7453292519943295F, 0.8726646259971648F, 0.7853981633974483F);
            progressRotation(CrestL2, sitProgress, 1.7453292519943295F, 0.6108652381980153F, 0.3141592653589793F);
            progressRotation(Neck1, sitProgress, -0.5462880558742251F, -0.0F, -0.045553093477052F);
            progressRotation(Tail4, sitProgress, -0.045553093477052F, 0.5009094953223726F, 0.0F);
            progressRotation(Neck3, sitProgress, 0.18203784098300857F, -0.0F, 0.0F);
        }

        if(amphithere.groundProgress <= 0 && amphithere.getAnimation() != EntityAmphithere.ANIMATION_WING_BLAST && !amphithere.onGround){
            amphithere.roll_buffer.applyChainFlapBuffer(BodyUpper);
            amphithere.pitch_buffer.applyChainWaveBuffer(BodyUpper);
            amphithere.tail_buffer.applyChainSwingBuffer(TAIL);

        }
   }

    @Override
    public void renderStatue() {
        this.resetToDefaultPose();
        this.BodyUpper.render(0.0625F);
    }
}
