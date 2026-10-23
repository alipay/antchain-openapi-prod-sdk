// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityAudioRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 音频文件 URL（非空校验）
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 须 audio 前缀
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 降噪开关（字符串，Boolean.parseBoolean 解析）
    @NameInMap("denoise")
    public String denoise;

    // 音频格式（缺省用原始文件名或 audio.wav）
    @NameInMap("audio_format")
    public String audioFormat;

    // 消息 ID
    @NameInMap("message_id")
    public String messageId;

    public static UploadSecurityAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityAudioRequest self = new UploadSecurityAudioRequest();
        return TeaModel.build(map, self);
    }

    public UploadSecurityAudioRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSecurityAudioRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSecurityAudioRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadSecurityAudioRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UploadSecurityAudioRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UploadSecurityAudioRequest setDenoise(String denoise) {
        this.denoise = denoise;
        return this;
    }
    public String getDenoise() {
        return this.denoise;
    }

    public UploadSecurityAudioRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public UploadSecurityAudioRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
