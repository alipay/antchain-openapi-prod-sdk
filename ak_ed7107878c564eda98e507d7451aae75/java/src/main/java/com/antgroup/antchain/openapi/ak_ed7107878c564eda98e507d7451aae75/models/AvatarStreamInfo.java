// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarStreamInfo extends TeaModel {
    // 形象id
    /**
     * <strong>example:</strong>
     * <p>1861</p>
     */
    @NameInMap("model_id")
    public String modelId;

    // 音色编码
    /**
     * <strong>example:</strong>
     * <p>269</p>
     */
    @NameInMap("voice_code")
    public String voiceCode;

    // 背景信息
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.123.com">www.123.com</a></p>
     */
    @NameInMap("background")
    public String background;

    // 流id
    /**
     * <strong>example:</strong>
     * <p>live-avatar-6741_20250410104550</p>
     */
    @NameInMap("stream_id")
    @Validation(required = true)
    public String streamId;

    // 设备sn号
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("serial_number")
    public String serialNumber;

    // 开播时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

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

    public AvatarStreamInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
