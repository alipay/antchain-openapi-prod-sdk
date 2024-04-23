// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class AvatarProfile extends TeaModel {
    // 190087
    @NameInMap("avatar_id")
    @Validation(required = true)
    public String avatarId;

    // 数字人形象名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // CUSTOM---定制；
    // PRESET---预置
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 位置信息等配置信息
    @NameInMap("conf")
    public String conf;

    // 数字人形象图片
    @NameInMap("pic_url")
    @Validation(required = true)
    public String picUrl;

    // 背景图片地址
    @NameInMap("bg_url")
    public String bgUrl;

    // 形象thumb图Url
    @NameInMap("thumb_url")
    public String thumbUrl;

    public static AvatarProfile build(java.util.Map<String, ?> map) throws Exception {
        AvatarProfile self = new AvatarProfile();
        return TeaModel.build(map, self);
    }

    public AvatarProfile setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public AvatarProfile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AvatarProfile setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AvatarProfile setConf(String conf) {
        this.conf = conf;
        return this;
    }
    public String getConf() {
        return this.conf;
    }

    public AvatarProfile setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public AvatarProfile setBgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
        return this;
    }
    public String getBgUrl() {
        return this.bgUrl;
    }

    public AvatarProfile setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }
    public String getThumbUrl() {
        return this.thumbUrl;
    }

}
