// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unicontact.models;

import com.aliyun.tea.*;

public class CallbackSmsUpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 回执类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 手机号码
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 发送时间
    @NameInMap("send_time")
    @Validation(required = true)
    public String sendTime;

    // 发送内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 签名
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 由通信平台提供的短信发送账号ak
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 上行短信扩展号码
    @NameInMap("dest_code")
    @Validation(required = true)
    public String destCode;

    // 序列
    @NameInMap("sequence_id")
    @Validation(required = true)
    public Long sequenceId;

    public static CallbackSmsUpRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackSmsUpRequest self = new CallbackSmsUpRequest();
        return TeaModel.build(map, self);
    }

    public CallbackSmsUpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackSmsUpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackSmsUpRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CallbackSmsUpRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CallbackSmsUpRequest setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public CallbackSmsUpRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CallbackSmsUpRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CallbackSmsUpRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CallbackSmsUpRequest setDestCode(String destCode) {
        this.destCode = destCode;
        return this;
    }
    public String getDestCode() {
        return this.destCode;
    }

    public CallbackSmsUpRequest setSequenceId(Long sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    public Long getSequenceId() {
        return this.sequenceId;
    }

}
