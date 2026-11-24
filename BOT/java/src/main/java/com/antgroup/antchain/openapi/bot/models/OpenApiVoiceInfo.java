// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OpenApiVoiceInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("voice_id")
    @Validation(required = true)
    public String voiceId;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("languages")
    @Validation(required = true)
    public java.util.List<String> languages;

    // 由实际TTS适配器能力产生；不支持的显式参数拒绝，不接受后静默丢弃；枚举:speed,pitch,volume
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("supported_fields")
    @Validation(required = true)
    public java.util.List<String> supportedFields;

    public static OpenApiVoiceInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiVoiceInfo self = new OpenApiVoiceInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiVoiceInfo setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public OpenApiVoiceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiVoiceInfo setLanguages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public OpenApiVoiceInfo setSupportedFields(java.util.List<String> supportedFields) {
        this.supportedFields = supportedFields;
        return this;
    }
    public java.util.List<String> getSupportedFields() {
        return this.supportedFields;
    }

}
