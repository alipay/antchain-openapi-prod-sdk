// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcallagent.models;

import com.aliyun.tea.*;

public class SendVoiceserviceSmartcallRequest extends TeaModel {
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

    // code
    @NameInMap("voice_code")
    public String voiceCode;

    // 停顿时长。用于设置用户停顿多久表示一句话结束。单位：毫秒，取值范围：300~1200。默认800。非特殊情况不建议调整
    @NameInMap("pause_time")
    public Long pauseTime;

    // 静音时长。用于设置用户多久不说话通话结束。单位：毫秒，取值范围：1000~20000。默认 10000
    @NameInMap("mute_time")
    public Long muteTime;

    // 当前返回的媒体文件是否可以被打断。默认取值为 true，即可被打断。
    // 如果为 false，即使下一个动作 action_break 为 true，也无法打断当前放音。
    @NameInMap("action_code_break")
    public Boolean actionCodeBreak;

    // 基于用户持续说话时长打断。单位：毫秒。
    // 如果当前媒体文件 ActionCodeBreak 为 true，用户持续说话可以打断当前播放。不设置或者为 0，不生效。
    @NameInMap("action_code_time_break")
    public Long actionCodeTimeBreak;

    // 最大通话时长，超时后自动挂断。单位：秒。
    @NameInMap("session_timeout")
    public Long sessionTimeout;

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

    // 用户和机器人对话时播放的背景语音文件 ID。
    @NameInMap("background_file_code")
    public String backgroundFileCode;

    // 否	发起请求时预留给调用方的自定义 ID，最终会通过回执消息将此 ID 带回给调用方。
    // 字符串类型，长度限制为 1~128 个字符。
    @NameInMap("out_id")
    public String outId;

    // 预留给调用方使用的动态扩展 ID。在回调地址中带回，用于客户的开发标识。
    @NameInMap("dynamic_id")
    public String dynamicId;

    // 是否在后处理中执行 ITN。默认为 false，即不执行。
    // 设置为 true 时，中文数字将转为阿拉伯数字输出。
    @NameInMap("enable_i_t_n")
    public Boolean enableITN;

    public static SendVoiceserviceSmartcallRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVoiceserviceSmartcallRequest self = new SendVoiceserviceSmartcallRequest();
        return TeaModel.build(map, self);
    }

    public SendVoiceserviceSmartcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendVoiceserviceSmartcallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendVoiceserviceSmartcallRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public SendVoiceserviceSmartcallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SendVoiceserviceSmartcallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SendVoiceserviceSmartcallRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public SendVoiceserviceSmartcallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SendVoiceserviceSmartcallRequest setPauseTime(Long pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Long getPauseTime() {
        return this.pauseTime;
    }

    public SendVoiceserviceSmartcallRequest setMuteTime(Long muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Long getMuteTime() {
        return this.muteTime;
    }

    public SendVoiceserviceSmartcallRequest setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public SendVoiceserviceSmartcallRequest setActionCodeTimeBreak(Long actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Long getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public SendVoiceserviceSmartcallRequest setSessionTimeout(Long sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Long getSessionTimeout() {
        return this.sessionTimeout;
    }

    public SendVoiceserviceSmartcallRequest setTtsStyle(String ttsStyle) {
        this.ttsStyle = ttsStyle;
        return this;
    }
    public String getTtsStyle() {
        return this.ttsStyle;
    }

    public SendVoiceserviceSmartcallRequest setTtsVolume(Long ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Long getTtsVolume() {
        return this.ttsVolume;
    }

    public SendVoiceserviceSmartcallRequest setTtsSpeed(Long ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Long getTtsSpeed() {
        return this.ttsSpeed;
    }

    public SendVoiceserviceSmartcallRequest setBackgroundFileCode(String backgroundFileCode) {
        this.backgroundFileCode = backgroundFileCode;
        return this;
    }
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    public SendVoiceserviceSmartcallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendVoiceserviceSmartcallRequest setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
        return this;
    }
    public String getDynamicId() {
        return this.dynamicId;
    }

    public SendVoiceserviceSmartcallRequest setEnableITN(Boolean enableITN) {
        this.enableITN = enableITN;
        return this;
    }
    public Boolean getEnableITN() {
        return this.enableITN;
    }

}
