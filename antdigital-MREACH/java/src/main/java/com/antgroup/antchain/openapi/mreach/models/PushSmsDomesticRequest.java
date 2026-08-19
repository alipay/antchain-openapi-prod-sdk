// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class PushSmsDomesticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号，最长64字符
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 接收手机号列表
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public java.util.List<String> phoneNumbers;

    // 模板ID
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 短信签名
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 模板参数
    @NameInMap("template_params")
    public String templateParams;

    // 扩展参数
    @NameInMap("extra_params")
    public String extraParams;

    public static PushSmsDomesticRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSmsDomesticRequest self = new PushSmsDomesticRequest();
        return TeaModel.build(map, self);
    }

    public PushSmsDomesticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushSmsDomesticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushSmsDomesticRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushSmsDomesticRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public PushSmsDomesticRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PushSmsDomesticRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public PushSmsDomesticRequest setTemplateParams(String templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public String getTemplateParams() {
        return this.templateParams;
    }

    public PushSmsDomesticRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

}
