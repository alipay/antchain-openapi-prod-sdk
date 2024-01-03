// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class AvatarDTO extends TeaModel {
    // 上衣配置
    @NameInMap("upcloth")
    @Validation(required = true)
    public AvatarMaterialDTO upcloth;

    // 下衣配置
    @NameInMap("downcloth")
    @Validation(required = true)
    public AvatarMaterialDTO downcloth;

    // 鞋子配置
    @NameInMap("shoe")
    @Validation(required = true)
    public AvatarMaterialDTO shoe;

    // 套装配置
    @NameInMap("suit")
    @Validation(required = true)
    public AvatarMaterialDTO suit;

    // 项链配置
    @NameInMap("necklace")
    @Validation(required = true)
    public AvatarMaterialDTO necklace;

    // 帽子配置
    @NameInMap("hat")
    @Validation(required = true)
    public AvatarMaterialDTO hat;

    // 眼镜配置
    @NameInMap("glass")
    @Validation(required = true)
    public AvatarMaterialDTO glass;

    // 头发配置
    @NameInMap("hair")
    @Validation(required = true)
    public AvatarMaterialDTO hair;

    // 脸型配置
    @NameInMap("head")
    @Validation(required = true)
    public AvatarMaterialDTO head;

    // 眉毛配置
    @NameInMap("eyebrow")
    @Validation(required = true)
    public AvatarMaterialDTO eyebrow;

    // 眼睛配置
    @NameInMap("eye")
    @Validation(required = true)
    public AvatarMaterialDTO eye;

    // 嘴巴配置
    @NameInMap("lip")
    @Validation(required = true)
    public AvatarMaterialDTO lip;

    // 鼻子配置
    @NameInMap("nose")
    @Validation(required = true)
    public AvatarMaterialDTO nose;

    // 腮红配置
    @NameInMap("rouge")
    @Validation(required = true)
    public AvatarMaterialDTO rouge;

    // 美瞳配置
    @NameInMap("lens")
    @Validation(required = true)
    public AvatarMaterialDTO lens;

    // 睫毛配置
    @NameInMap("eyelash")
    @Validation(required = true)
    public AvatarMaterialDTO eyelash;

    // 唇妆配置
    @NameInMap("lipstick")
    @Validation(required = true)
    public AvatarMaterialDTO lipstick;

    // 眼线配置
    @NameInMap("eyeliner")
    @Validation(required = true)
    public AvatarMaterialDTO eyeliner;

    // 眼影配置
    @NameInMap("eyeshadow")
    @Validation(required = true)
    public AvatarMaterialDTO eyeshadow;

    // webgl ab包链接
    @NameInMap("avatar_web_gl_unity_body_url")
    @Validation(required = true)
    public String avatarWebGlUnityBodyUrl;

    // ios ab包链接
    @NameInMap("avatar_ios_unity_body_url")
    @Validation(required = true)
    public String avatarIosUnityBodyUrl;

    // android ab包链接
    @NameInMap("avatar_android_unity_body_url")
    @Validation(required = true)
    public String avatarAndroidUnityBodyUrl;

    // 默认Unity配置
    @NameInMap("default_unity_config")
    @Validation(required = true)
    public String defaultUnityConfig;

    // 袜子配置
    @NameInMap("sock")
    @Validation(required = true)
    public AvatarMaterialDTO sock;

    // 背持配置
    @NameInMap("backpack")
    @Validation(required = true)
    public AvatarMaterialDTO backpack;

    // 手部配置
    @NameInMap("hand")
    @Validation(required = true)
    public AvatarMaterialDTO hand;

    // 耳环配置
    @NameInMap("earring")
    @Validation(required = true)
    public AvatarMaterialDTO earring;

    public static AvatarDTO build(java.util.Map<String, ?> map) throws Exception {
        AvatarDTO self = new AvatarDTO();
        return TeaModel.build(map, self);
    }

    public AvatarDTO setUpcloth(AvatarMaterialDTO upcloth) {
        this.upcloth = upcloth;
        return this;
    }
    public AvatarMaterialDTO getUpcloth() {
        return this.upcloth;
    }

    public AvatarDTO setDowncloth(AvatarMaterialDTO downcloth) {
        this.downcloth = downcloth;
        return this;
    }
    public AvatarMaterialDTO getDowncloth() {
        return this.downcloth;
    }

    public AvatarDTO setShoe(AvatarMaterialDTO shoe) {
        this.shoe = shoe;
        return this;
    }
    public AvatarMaterialDTO getShoe() {
        return this.shoe;
    }

    public AvatarDTO setSuit(AvatarMaterialDTO suit) {
        this.suit = suit;
        return this;
    }
    public AvatarMaterialDTO getSuit() {
        return this.suit;
    }

    public AvatarDTO setNecklace(AvatarMaterialDTO necklace) {
        this.necklace = necklace;
        return this;
    }
    public AvatarMaterialDTO getNecklace() {
        return this.necklace;
    }

    public AvatarDTO setHat(AvatarMaterialDTO hat) {
        this.hat = hat;
        return this;
    }
    public AvatarMaterialDTO getHat() {
        return this.hat;
    }

    public AvatarDTO setGlass(AvatarMaterialDTO glass) {
        this.glass = glass;
        return this;
    }
    public AvatarMaterialDTO getGlass() {
        return this.glass;
    }

    public AvatarDTO setHair(AvatarMaterialDTO hair) {
        this.hair = hair;
        return this;
    }
    public AvatarMaterialDTO getHair() {
        return this.hair;
    }

    public AvatarDTO setHead(AvatarMaterialDTO head) {
        this.head = head;
        return this;
    }
    public AvatarMaterialDTO getHead() {
        return this.head;
    }

    public AvatarDTO setEyebrow(AvatarMaterialDTO eyebrow) {
        this.eyebrow = eyebrow;
        return this;
    }
    public AvatarMaterialDTO getEyebrow() {
        return this.eyebrow;
    }

    public AvatarDTO setEye(AvatarMaterialDTO eye) {
        this.eye = eye;
        return this;
    }
    public AvatarMaterialDTO getEye() {
        return this.eye;
    }

    public AvatarDTO setLip(AvatarMaterialDTO lip) {
        this.lip = lip;
        return this;
    }
    public AvatarMaterialDTO getLip() {
        return this.lip;
    }

    public AvatarDTO setNose(AvatarMaterialDTO nose) {
        this.nose = nose;
        return this;
    }
    public AvatarMaterialDTO getNose() {
        return this.nose;
    }

    public AvatarDTO setRouge(AvatarMaterialDTO rouge) {
        this.rouge = rouge;
        return this;
    }
    public AvatarMaterialDTO getRouge() {
        return this.rouge;
    }

    public AvatarDTO setLens(AvatarMaterialDTO lens) {
        this.lens = lens;
        return this;
    }
    public AvatarMaterialDTO getLens() {
        return this.lens;
    }

    public AvatarDTO setEyelash(AvatarMaterialDTO eyelash) {
        this.eyelash = eyelash;
        return this;
    }
    public AvatarMaterialDTO getEyelash() {
        return this.eyelash;
    }

    public AvatarDTO setLipstick(AvatarMaterialDTO lipstick) {
        this.lipstick = lipstick;
        return this;
    }
    public AvatarMaterialDTO getLipstick() {
        return this.lipstick;
    }

    public AvatarDTO setEyeliner(AvatarMaterialDTO eyeliner) {
        this.eyeliner = eyeliner;
        return this;
    }
    public AvatarMaterialDTO getEyeliner() {
        return this.eyeliner;
    }

    public AvatarDTO setEyeshadow(AvatarMaterialDTO eyeshadow) {
        this.eyeshadow = eyeshadow;
        return this;
    }
    public AvatarMaterialDTO getEyeshadow() {
        return this.eyeshadow;
    }

    public AvatarDTO setAvatarWebGlUnityBodyUrl(String avatarWebGlUnityBodyUrl) {
        this.avatarWebGlUnityBodyUrl = avatarWebGlUnityBodyUrl;
        return this;
    }
    public String getAvatarWebGlUnityBodyUrl() {
        return this.avatarWebGlUnityBodyUrl;
    }

    public AvatarDTO setAvatarIosUnityBodyUrl(String avatarIosUnityBodyUrl) {
        this.avatarIosUnityBodyUrl = avatarIosUnityBodyUrl;
        return this;
    }
    public String getAvatarIosUnityBodyUrl() {
        return this.avatarIosUnityBodyUrl;
    }

    public AvatarDTO setAvatarAndroidUnityBodyUrl(String avatarAndroidUnityBodyUrl) {
        this.avatarAndroidUnityBodyUrl = avatarAndroidUnityBodyUrl;
        return this;
    }
    public String getAvatarAndroidUnityBodyUrl() {
        return this.avatarAndroidUnityBodyUrl;
    }

    public AvatarDTO setDefaultUnityConfig(String defaultUnityConfig) {
        this.defaultUnityConfig = defaultUnityConfig;
        return this;
    }
    public String getDefaultUnityConfig() {
        return this.defaultUnityConfig;
    }

    public AvatarDTO setSock(AvatarMaterialDTO sock) {
        this.sock = sock;
        return this;
    }
    public AvatarMaterialDTO getSock() {
        return this.sock;
    }

    public AvatarDTO setBackpack(AvatarMaterialDTO backpack) {
        this.backpack = backpack;
        return this;
    }
    public AvatarMaterialDTO getBackpack() {
        return this.backpack;
    }

    public AvatarDTO setHand(AvatarMaterialDTO hand) {
        this.hand = hand;
        return this;
    }
    public AvatarMaterialDTO getHand() {
        return this.hand;
    }

    public AvatarDTO setEarring(AvatarMaterialDTO earring) {
        this.earring = earring;
        return this;
    }
    public AvatarMaterialDTO getEarring() {
        return this.earring;
    }

}
