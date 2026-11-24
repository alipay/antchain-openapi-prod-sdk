// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StatusIotsuccessProductSkillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // 既有Skill配置revision，缺失为null
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 已有资产启用状态；不等于安全审核通过
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // 已有权威资产安全状态；未接通或源字段不存在为null，不虚构READY
    @NameInMap("publish_status")
    @Validation(required = true)
    public String publishStatus;

    // 源记录有失败原因时脱敏返回，否则null
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static StatusIotsuccessProductSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        StatusIotsuccessProductSkillResponse self = new StatusIotsuccessProductSkillResponse();
        return TeaModel.build(map, self);
    }

    public StatusIotsuccessProductSkillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StatusIotsuccessProductSkillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StatusIotsuccessProductSkillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StatusIotsuccessProductSkillResponse setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public StatusIotsuccessProductSkillResponse setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public StatusIotsuccessProductSkillResponse setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public StatusIotsuccessProductSkillResponse setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public StatusIotsuccessProductSkillResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
