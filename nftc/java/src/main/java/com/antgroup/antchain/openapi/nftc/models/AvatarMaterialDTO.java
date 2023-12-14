// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class AvatarMaterialDTO extends TeaModel {
    // 装扮id
    @NameInMap("deco_id")
    @Validation(required = true)
    public String decoId;

    // 装扮名称
    @NameInMap("deco_name")
    @Validation(required = true)
    public String decoName;

    // webGl ab包地址
    @NameInMap("web_ab_url")
    @Validation(required = true)
    public String webAbUrl;

    // 贴图文件配置
    @NameInMap("texture_url")
    @Validation(required = true)
    public String textureUrl;

    // 缩略图
    @NameInMap("thumbnail")
    @Validation(required = true)
    public String thumbnail;

    // json字符串，装扮额外属性信息
    // 如自定义头发颜色，性别等
    @NameInMap("avatar_pv_json")
    @Validation(required = true)
    public String avatarPvJson;

    // 安卓ab包
    @NameInMap("android_ab_url")
    @Validation(required = true)
    public String androidAbUrl;

    // IOS AB 包
    @NameInMap("ios_ab_url")
    @Validation(required = true)
    public String iosAbUrl;

    // 法令贴图文件
    @NameInMap("faling_texture_url")
    @Validation(required = true)
    public String falingTextureUrl;

    public static AvatarMaterialDTO build(java.util.Map<String, ?> map) throws Exception {
        AvatarMaterialDTO self = new AvatarMaterialDTO();
        return TeaModel.build(map, self);
    }

    public AvatarMaterialDTO setDecoId(String decoId) {
        this.decoId = decoId;
        return this;
    }
    public String getDecoId() {
        return this.decoId;
    }

    public AvatarMaterialDTO setDecoName(String decoName) {
        this.decoName = decoName;
        return this;
    }
    public String getDecoName() {
        return this.decoName;
    }

    public AvatarMaterialDTO setWebAbUrl(String webAbUrl) {
        this.webAbUrl = webAbUrl;
        return this;
    }
    public String getWebAbUrl() {
        return this.webAbUrl;
    }

    public AvatarMaterialDTO setTextureUrl(String textureUrl) {
        this.textureUrl = textureUrl;
        return this;
    }
    public String getTextureUrl() {
        return this.textureUrl;
    }

    public AvatarMaterialDTO setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public AvatarMaterialDTO setAvatarPvJson(String avatarPvJson) {
        this.avatarPvJson = avatarPvJson;
        return this;
    }
    public String getAvatarPvJson() {
        return this.avatarPvJson;
    }

    public AvatarMaterialDTO setAndroidAbUrl(String androidAbUrl) {
        this.androidAbUrl = androidAbUrl;
        return this;
    }
    public String getAndroidAbUrl() {
        return this.androidAbUrl;
    }

    public AvatarMaterialDTO setIosAbUrl(String iosAbUrl) {
        this.iosAbUrl = iosAbUrl;
        return this;
    }
    public String getIosAbUrl() {
        return this.iosAbUrl;
    }

    public AvatarMaterialDTO setFalingTextureUrl(String falingTextureUrl) {
        this.falingTextureUrl = falingTextureUrl;
        return this;
    }
    public String getFalingTextureUrl() {
        return this.falingTextureUrl;
    }

}
