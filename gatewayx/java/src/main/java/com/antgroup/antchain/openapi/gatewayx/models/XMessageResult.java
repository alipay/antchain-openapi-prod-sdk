// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class XMessageResult extends TeaModel {
    // 消息key
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 发送方租户
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 接收方租户
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 发送结果
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 发送次数（重试次数）
    @NameInMap("push_times")
    @Validation(required = true)
    public Long pushTimes;

    // 发送内容
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 错误码
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 错误消息
    @NameInMap("error_msg")
    public String errorMsg;

    // 发送地址
    @NameInMap("target_url")
    @Validation(required = true)
    public String targetUrl;

    // 消息唯一id
    @NameInMap("unique_id")
    @Validation(required = true)
    public String uniqueId;

    public static XMessageResult build(java.util.Map<String, ?> map) throws Exception {
        XMessageResult self = new XMessageResult();
        return TeaModel.build(map, self);
    }

    public XMessageResult setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public XMessageResult setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public XMessageResult setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public XMessageResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public XMessageResult setPushTimes(Long pushTimes) {
        this.pushTimes = pushTimes;
        return this;
    }
    public Long getPushTimes() {
        return this.pushTimes;
    }

    public XMessageResult setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public XMessageResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public XMessageResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public XMessageResult setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public XMessageResult setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
