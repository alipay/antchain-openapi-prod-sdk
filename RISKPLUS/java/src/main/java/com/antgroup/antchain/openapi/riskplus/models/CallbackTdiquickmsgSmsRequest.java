// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CallbackTdiquickmsgSmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 短信回执类型
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 手机号码
    // 
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 发送时间
    @NameInMap("send_time")
    @Validation(required = true)
    public String sendTime;

    // 状态报告时间
    @NameInMap("report_time")
    @Validation(required = true)
    public String reportTime;

    // 是否接收成功。取值：true：接收成功false：接收失败
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 状态报告编码
    @NameInMap("err_code")
    @Validation(required = true)
    public String errCode;

    // 状态报告说明
    // 
    @NameInMap("err_msg")
    @Validation(required = true)
    public String errMsg;

    // 短信长度
    @NameInMap("sms_size")
    @Validation(required = true)
    public String smsSize;

    // 发送回执ID，即发送流水号
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务扩展字段，回执时透传，JSON格式
    @NameInMap("biz_properties")
    @Validation(required = true)
    public String bizProperties;

    // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
    @NameInMap("sms_type")
    public String smsType;

    // 运营商
    @NameInMap("service_provider")
    @Validation(required = true)
    public String serviceProvider;

    // 手机号码所属城市
    @NameInMap("city")
    public String city;

    // 手机号模版类型
    @NameInMap("key_template")
    public String keyTemplate;

    public static CallbackTdiquickmsgSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackTdiquickmsgSmsRequest self = new CallbackTdiquickmsgSmsRequest();
        return TeaModel.build(map, self);
    }

    public CallbackTdiquickmsgSmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackTdiquickmsgSmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackTdiquickmsgSmsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CallbackTdiquickmsgSmsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CallbackTdiquickmsgSmsRequest setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public CallbackTdiquickmsgSmsRequest setReportTime(String reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public String getReportTime() {
        return this.reportTime;
    }

    public CallbackTdiquickmsgSmsRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CallbackTdiquickmsgSmsRequest setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CallbackTdiquickmsgSmsRequest setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CallbackTdiquickmsgSmsRequest setSmsSize(String smsSize) {
        this.smsSize = smsSize;
        return this;
    }
    public String getSmsSize() {
        return this.smsSize;
    }

    public CallbackTdiquickmsgSmsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CallbackTdiquickmsgSmsRequest setBizProperties(String bizProperties) {
        this.bizProperties = bizProperties;
        return this;
    }
    public String getBizProperties() {
        return this.bizProperties;
    }

    public CallbackTdiquickmsgSmsRequest setSmsType(String smsType) {
        this.smsType = smsType;
        return this;
    }
    public String getSmsType() {
        return this.smsType;
    }

    public CallbackTdiquickmsgSmsRequest setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }
    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public CallbackTdiquickmsgSmsRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CallbackTdiquickmsgSmsRequest setKeyTemplate(String keyTemplate) {
        this.keyTemplate = keyTemplate;
        return this;
    }
    public String getKeyTemplate() {
        return this.keyTemplate;
    }

}
