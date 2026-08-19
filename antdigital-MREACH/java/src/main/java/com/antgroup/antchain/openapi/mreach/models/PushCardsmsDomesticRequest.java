// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class PushCardsmsDomesticRequest extends TeaModel {
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

    // 卡片短信模版ID
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 卡片短信签名
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 卡片动参
    @NameInMap("card_params")
    public String cardParams;

    // 回落类型: SMS-回落为普通短信, NONE-不回落。
    @NameInMap("fallback_type")
    public String fallbackType;

    // 回落普通短信的平台模板编码。
    @NameInMap("fallback_template_id")
    public String fallbackTemplateId;

    // 回落普通短信的模板参数，键值对形式Str
    @NameInMap("fallback_params")
    public String fallbackParams;

    // 卡片短信渲染失败后跳转链接
    @NameInMap("custom_url")
    public String customUrl;

    // 扩展参数
    @NameInMap("extra_params")
    public String extraParams;

    public static PushCardsmsDomesticRequest build(java.util.Map<String, ?> map) throws Exception {
        PushCardsmsDomesticRequest self = new PushCardsmsDomesticRequest();
        return TeaModel.build(map, self);
    }

    public PushCardsmsDomesticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushCardsmsDomesticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushCardsmsDomesticRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushCardsmsDomesticRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public PushCardsmsDomesticRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public PushCardsmsDomesticRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public PushCardsmsDomesticRequest setCardParams(String cardParams) {
        this.cardParams = cardParams;
        return this;
    }
    public String getCardParams() {
        return this.cardParams;
    }

    public PushCardsmsDomesticRequest setFallbackType(String fallbackType) {
        this.fallbackType = fallbackType;
        return this;
    }
    public String getFallbackType() {
        return this.fallbackType;
    }

    public PushCardsmsDomesticRequest setFallbackTemplateId(String fallbackTemplateId) {
        this.fallbackTemplateId = fallbackTemplateId;
        return this;
    }
    public String getFallbackTemplateId() {
        return this.fallbackTemplateId;
    }

    public PushCardsmsDomesticRequest setFallbackParams(String fallbackParams) {
        this.fallbackParams = fallbackParams;
        return this;
    }
    public String getFallbackParams() {
        return this.fallbackParams;
    }

    public PushCardsmsDomesticRequest setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }
    public String getCustomUrl() {
        return this.customUrl;
    }

    public PushCardsmsDomesticRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

}
