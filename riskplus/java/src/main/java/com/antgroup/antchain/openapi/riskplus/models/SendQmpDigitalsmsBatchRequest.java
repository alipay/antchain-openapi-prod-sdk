// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendQmpDigitalsmsBatchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // cpassAccessKey
    @NameInMap("cpass_ak")
    public String cpassAk;

    // 行业标签
    @NameInMap("industry_tag")
    @Validation(required = true)
    public String industryTag;

    // 手机号列表以,分隔
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public String phoneNumbers;

    // 数字短信模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 短信模板参数
    @NameInMap("template_param")
    @Validation(required = true)
    public String templateParam;

    // 透传字段
    @NameInMap("out_id")
    public String outId;

    public static SendQmpDigitalsmsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SendQmpDigitalsmsBatchRequest self = new SendQmpDigitalsmsBatchRequest();
        return TeaModel.build(map, self);
    }

    public SendQmpDigitalsmsBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendQmpDigitalsmsBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendQmpDigitalsmsBatchRequest setCpassAk(String cpassAk) {
        this.cpassAk = cpassAk;
        return this;
    }
    public String getCpassAk() {
        return this.cpassAk;
    }

    public SendQmpDigitalsmsBatchRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

    public SendQmpDigitalsmsBatchRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendQmpDigitalsmsBatchRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendQmpDigitalsmsBatchRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendQmpDigitalsmsBatchRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

}
