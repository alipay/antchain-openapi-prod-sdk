// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarVoiceInfo extends TeaModel {
    // 音色id
    @NameInMap("voice_id")
    @Validation(required = true)
    public String voiceId;

    // 音色编码
    @NameInMap("voice_code")
    @Validation(required = true)
    public String voiceCode;

    // 音色名
    @NameInMap("voice_name")
    @Validation(required = true)
    public String voiceName;

    // 预览图
    @NameInMap("image")
    public String image;

    // 音色性别
    @NameInMap("gender")
    public String gender;

    // 音色类型
    @NameInMap("voice_type")
    public String voiceType;

    // 音色试听链接列表
    @NameInMap("audition_list")
    public java.util.List<String> auditionList;

    public static AvatarVoiceInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarVoiceInfo self = new AvatarVoiceInfo();
        return TeaModel.build(map, self);
    }

    public AvatarVoiceInfo setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public AvatarVoiceInfo setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public AvatarVoiceInfo setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

    public AvatarVoiceInfo setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AvatarVoiceInfo setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public AvatarVoiceInfo setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

    public AvatarVoiceInfo setAuditionList(java.util.List<String> auditionList) {
        this.auditionList = auditionList;
        return this;
    }
    public java.util.List<String> getAuditionList() {
        return this.auditionList;
    }

}
