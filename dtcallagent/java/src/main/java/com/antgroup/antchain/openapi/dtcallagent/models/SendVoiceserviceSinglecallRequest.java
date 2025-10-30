// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcallagent.models;

import com.aliyun.tea.*;

public class SendVoiceserviceSinglecallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 分配的租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 分配的业务code
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // 分配的主叫号码
    @NameInMap("called_show_number")
    @Validation(required = true)
    public String calledShowNumber;

    // 被叫用户号码
    @NameInMap("called_number")
    @Validation(required = true)
    public String calledNumber;

    // 播报文本内容
    @NameInMap("context")
    @Validation(required = true)
    public String context;

    // 录音字段
    @NameInMap("voice_code")
    public String voiceCode;

    // TTS 变量播放时的声音风格。
    @NameInMap("tts_style")
    @Validation(required = true)
    public String ttsStyle;

    // TTS 变量播放的音量。取值范围：0~100，默认值为 50。
    @NameInMap("tts_volume")
    public Long ttsVolume;

    // TTS 变量播放时的声音速度。取值范围：0.5~2，默认值为 1。
    @NameInMap("tts_speed")
    public Long ttsSpeed;

    // 播放次数。取值范围：1~3，默认取值 3。
    @NameInMap("play_times")
    public Long playTimes;

    // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
    // 字符串类型，长度限制为 1~128 个字符。
    @NameInMap("out_id")
    public String outId;

    public static SendVoiceserviceSinglecallRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVoiceserviceSinglecallRequest self = new SendVoiceserviceSinglecallRequest();
        return TeaModel.build(map, self);
    }

    public SendVoiceserviceSinglecallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendVoiceserviceSinglecallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendVoiceserviceSinglecallRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public SendVoiceserviceSinglecallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SendVoiceserviceSinglecallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SendVoiceserviceSinglecallRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public SendVoiceserviceSinglecallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SendVoiceserviceSinglecallRequest setTtsStyle(String ttsStyle) {
        this.ttsStyle = ttsStyle;
        return this;
    }
    public String getTtsStyle() {
        return this.ttsStyle;
    }

    public SendVoiceserviceSinglecallRequest setTtsVolume(Long ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Long getTtsVolume() {
        return this.ttsVolume;
    }

    public SendVoiceserviceSinglecallRequest setTtsSpeed(Long ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Long getTtsSpeed() {
        return this.ttsSpeed;
    }

    public SendVoiceserviceSinglecallRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public SendVoiceserviceSinglecallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

}
