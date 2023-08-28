// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CallbackUmktSmsUpRequest extends TeaModel {
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

    // 签名信息
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 签名对应的客户ak
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 上行短信扩展号码
    @NameInMap("dest_code")
    @Validation(required = true)
    public String destCode;

    // 学历噩耗
    @NameInMap("sequence_id")
    @Validation(required = true)
    public Long sequenceId;

    public static CallbackUmktSmsUpRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackUmktSmsUpRequest self = new CallbackUmktSmsUpRequest();
        return TeaModel.build(map, self);
    }

    public CallbackUmktSmsUpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackUmktSmsUpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackUmktSmsUpRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CallbackUmktSmsUpRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CallbackUmktSmsUpRequest setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public CallbackUmktSmsUpRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CallbackUmktSmsUpRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CallbackUmktSmsUpRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CallbackUmktSmsUpRequest setDestCode(String destCode) {
        this.destCode = destCode;
        return this;
    }
    public String getDestCode() {
        return this.destCode;
    }

    public CallbackUmktSmsUpRequest setSequenceId(Long sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    public Long getSequenceId() {
        return this.sequenceId;
    }

}
