// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendUmktCardsmsBatchRequest extends TeaModel {
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

    // 卡片短信模板
    @NameInMap("card_template_code")
    @Validation(required = true)
    public String cardTemplateCode;

    // {}
    @NameInMap("card_template_param_json")
    @Validation(required = true)
    public String cardTemplateParamJson;

    // ["13455","76898"]
    @NameInMap("phone_number_json")
    @Validation(required = true)
    public String phoneNumberJson;

    // ["蚂蚁营销"]
    @NameInMap("sign_name_json")
    @Validation(required = true)
    public String signNameJson;

    // 上行短信扩展码
    @NameInMap("sms_up_extend_code_json")
    public String smsUpExtendCodeJson;

    public static SendUmktCardsmsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        SendUmktCardsmsBatchRequest self = new SendUmktCardsmsBatchRequest();
        return TeaModel.build(map, self);
    }

    public SendUmktCardsmsBatchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendUmktCardsmsBatchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendUmktCardsmsBatchRequest setCpassAk(String cpassAk) {
        this.cpassAk = cpassAk;
        return this;
    }
    public String getCpassAk() {
        return this.cpassAk;
    }

    public SendUmktCardsmsBatchRequest setIndustryTag(String industryTag) {
        this.industryTag = industryTag;
        return this;
    }
    public String getIndustryTag() {
        return this.industryTag;
    }

    public SendUmktCardsmsBatchRequest setCardTemplateCode(String cardTemplateCode) {
        this.cardTemplateCode = cardTemplateCode;
        return this;
    }
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    public SendUmktCardsmsBatchRequest setCardTemplateParamJson(String cardTemplateParamJson) {
        this.cardTemplateParamJson = cardTemplateParamJson;
        return this;
    }
    public String getCardTemplateParamJson() {
        return this.cardTemplateParamJson;
    }

    public SendUmktCardsmsBatchRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendUmktCardsmsBatchRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendUmktCardsmsBatchRequest setSmsUpExtendCodeJson(String smsUpExtendCodeJson) {
        this.smsUpExtendCodeJson = smsUpExtendCodeJson;
        return this;
    }
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

}
