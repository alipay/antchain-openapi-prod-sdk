// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class AvatarVoice extends TeaModel {
    // 音色名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 音色代码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // CLONE--克隆音色；
    // PRESET--预置；
    // CUSTOM--自定义，暂时不采用。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 音色形象url
    @NameInMap("pic_url")
    @Validation(required = true)
    public String picUrl;

    // 试听音频片段
    @NameInMap("demo_url")
    @Validation(required = true)
    public String demoUrl;

    public static AvatarVoice build(java.util.Map<String, ?> map) throws Exception {
        AvatarVoice self = new AvatarVoice();
        return TeaModel.build(map, self);
    }

    public AvatarVoice setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AvatarVoice setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AvatarVoice setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AvatarVoice setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public AvatarVoice setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
        return this;
    }
    public String getDemoUrl() {
        return this.demoUrl;
    }

}
