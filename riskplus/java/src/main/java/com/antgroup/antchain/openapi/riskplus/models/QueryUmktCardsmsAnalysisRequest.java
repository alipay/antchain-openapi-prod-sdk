// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktCardsmsAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户的卡片短信模板id
    @NameInMap("card_template_code")
    @Validation(required = true)
    public String cardTemplateCode;

    // 手机号列表,最多10个手机号
    @NameInMap("phone_number_json")
    @Validation(required = true)
    public String phoneNumberJson;

    // 卡片短信模板参数
    @NameInMap("card_template_param_json")
    @Validation(required = true)
    public String cardTemplateParamJson;

    // 短信签名。当前只支持填入一个签名。
    @NameInMap("sign_name_json")
    @Validation(required = true)
    public String signNameJson;

    // 外部流水扩展字段
    @NameInMap("out_id")
    public String outId;

    public static QueryUmktCardsmsAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktCardsmsAnalysisRequest self = new QueryUmktCardsmsAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktCardsmsAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktCardsmsAnalysisRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktCardsmsAnalysisRequest setCardTemplateCode(String cardTemplateCode) {
        this.cardTemplateCode = cardTemplateCode;
        return this;
    }
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    public QueryUmktCardsmsAnalysisRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public QueryUmktCardsmsAnalysisRequest setCardTemplateParamJson(String cardTemplateParamJson) {
        this.cardTemplateParamJson = cardTemplateParamJson;
        return this;
    }
    public String getCardTemplateParamJson() {
        return this.cardTemplateParamJson;
    }

    public QueryUmktCardsmsAnalysisRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public QueryUmktCardsmsAnalysisRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

}
