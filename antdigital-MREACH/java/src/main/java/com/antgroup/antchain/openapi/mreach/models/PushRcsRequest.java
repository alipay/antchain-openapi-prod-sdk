// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class PushRcsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号，最长64字符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 接收手机号,仅限一位
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 5G消息模版ID
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 5G消息签名
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 5G消息模板参数
    @NameInMap("template_params")
    public String templateParams;

    // 扩展参数
    @NameInMap("extra_params")
    public String extraParams;

    public static PushRcsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRcsRequest self = new PushRcsRequest();
        return TeaModel.build(map, self);
    }

    public PushRcsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRcsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRcsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushRcsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PushRcsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PushRcsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public PushRcsRequest setTemplateParams(String templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public String getTemplateParams() {
        return this.templateParams;
    }

    public PushRcsRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

}
