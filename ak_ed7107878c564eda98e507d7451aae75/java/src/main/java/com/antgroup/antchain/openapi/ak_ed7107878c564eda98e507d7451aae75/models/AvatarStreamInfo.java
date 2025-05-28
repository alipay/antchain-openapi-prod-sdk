// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarStreamInfo extends TeaModel {
    // 形象id
    @NameInMap("model_id")
    public String modelId;

    // 音色编码
    @NameInMap("voice_code")
    public String voiceCode;

    // 背景信息
    @NameInMap("background")
    public String background;

    // 流id
    @NameInMap("stream_id")
    @Validation(required = true)
    public String streamId;

    // 设备sn号
    @NameInMap("serial_number")
    public String serialNumber;

    public static AvatarStreamInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarStreamInfo self = new AvatarStreamInfo();
        return TeaModel.build(map, self);
    }

    public AvatarStreamInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public AvatarStreamInfo setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public AvatarStreamInfo setBackground(String background) {
        this.background = background;
        return this;
    }
    public String getBackground() {
        return this.background;
    }

    public AvatarStreamInfo setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

    public AvatarStreamInfo setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
