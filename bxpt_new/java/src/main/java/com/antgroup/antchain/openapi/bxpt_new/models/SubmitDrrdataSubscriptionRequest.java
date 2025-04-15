// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class SubmitDrrdataSubscriptionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32)
    public String bizType;

    // 请求id
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 64)
    public String requestId;

    // 运单号
    @NameInMap("mail_no")
    @Validation(required = true, maxLength = 64)
    public String mailNo;

    // 快递公司编码
    @NameInMap("cp_code")
    @Validation(maxLength = 64)
    public String cpCode;

    // 自定义标签，可为备注
    @NameInMap("tag")
    @Validation(maxLength = 128)
    public String tag;

    // 收、寄件人电话号码
    @NameInMap("phone")
    @Validation(maxLength = 32)
    public String phone;

    // 出发地城市
    @NameInMap("from_city")
    @Validation(maxLength = 128)
    public String fromCity;

    // 目的地城市
    @NameInMap("to_city")
    @Validation(maxLength = 128)
    public String toCity;

    // {}
    @NameInMap("biz_content")
    @Validation(maxLength = 1000)
    public String bizContent;

    public static SubmitDrrdataSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDrrdataSubscriptionRequest self = new SubmitDrrdataSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDrrdataSubscriptionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDrrdataSubscriptionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitDrrdataSubscriptionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitDrrdataSubscriptionRequest setMailNo(String mailNo) {
        this.mailNo = mailNo;
        return this;
    }
    public String getMailNo() {
        return this.mailNo;
    }

    public SubmitDrrdataSubscriptionRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public SubmitDrrdataSubscriptionRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SubmitDrrdataSubscriptionRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public SubmitDrrdataSubscriptionRequest setFromCity(String fromCity) {
        this.fromCity = fromCity;
        return this;
    }
    public String getFromCity() {
        return this.fromCity;
    }

    public SubmitDrrdataSubscriptionRequest setToCity(String toCity) {
        this.toCity = toCity;
        return this;
    }
    public String getToCity() {
        return this.toCity;
    }

    public SubmitDrrdataSubscriptionRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
