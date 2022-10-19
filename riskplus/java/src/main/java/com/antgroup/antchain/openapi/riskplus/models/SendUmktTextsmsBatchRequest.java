// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendUmktTextsmsBatchRequest extends TeaModel {
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

    // 手机号json
    @NameInMap("phone_number_json")
    @Validation(required = true)
    public String phoneNumberJson;

    // 签名信息
    @NameInMap("sign_name_json")
    @Validation(required = true)
    public String signNameJson;

    // 文本短信模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 文本短信模板参数
    @NameInMap("template_param_json")
    @Validation(required = true)
    public String templateParamJson;

    // 上行短信扩展码
    @NameInMap("sms_up_extend_code_json")
    public String smsUpExtendCodeJson;

    // 透传字段
    @NameInMap("out_id")
    public String outId;

    public static SendUmktTextsmsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SendUmktTextsmsBatchRequest self = new SendUmktTextsmsBatchRequest();
        return TeaModel.build(map, self);
    }

    public SendUmktTextsmsBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendUmktTextsmsBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendUmktTextsmsBatchRequest setCpassAk(String cpassAk) {
        this.cpassAk = cpassAk;
        return this;
    }
    public String getCpassAk() {
        return this.cpassAk;
    }

    public SendUmktTextsmsBatchRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

    public SendUmktTextsmsBatchRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendUmktTextsmsBatchRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendUmktTextsmsBatchRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendUmktTextsmsBatchRequest setTemplateParamJson(String templateParamJson) {
        this.templateParamJson = templateParamJson;
        return this;
    }
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

    public SendUmktTextsmsBatchRequest setSmsUpExtendCodeJson(String smsUpExtendCodeJson) {
        this.smsUpExtendCodeJson = smsUpExtendCodeJson;
        return this;
    }
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

    public SendUmktTextsmsBatchRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

}
