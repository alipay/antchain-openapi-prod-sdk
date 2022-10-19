// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendUmktDigitalsmsBatchRequest extends TeaModel {
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

    public static SendUmktDigitalsmsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SendUmktDigitalsmsBatchRequest self = new SendUmktDigitalsmsBatchRequest();
        return TeaModel.build(map, self);
    }

    public SendUmktDigitalsmsBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendUmktDigitalsmsBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendUmktDigitalsmsBatchRequest setCpassAk(String cpassAk) {
        this.cpassAk = cpassAk;
        return this;
    }
    public String getCpassAk() {
        return this.cpassAk;
    }

    public SendUmktDigitalsmsBatchRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

    public SendUmktDigitalsmsBatchRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendUmktDigitalsmsBatchRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendUmktDigitalsmsBatchRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendUmktDigitalsmsBatchRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

}
