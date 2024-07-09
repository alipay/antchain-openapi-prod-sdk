// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_66d0b62c20644717870b45e5087b8007.models;

import com.aliyun.tea.*;

public class QueryAntcloudBxptnewDatapromotionDecisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 保司编码
    @NameInMap("insurer_code")
    @Validation(required = true)
    public String insurerCode;

    // 保险险种
    @NameInMap("insurance_type")
    @Validation(required = true)
    public String insuranceType;

    // 业务参数内容JSON字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static QueryAntcloudBxptnewDatapromotionDecisionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudBxptnewDatapromotionDecisionRequest self = new QueryAntcloudBxptnewDatapromotionDecisionRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudBxptnewDatapromotionDecisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionRequest setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
        return this;
    }
    public String getInsurerCode() {
        return this.insurerCode;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionRequest setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }
    public String getInsuranceType() {
        return this.insuranceType;
    }

    public QueryAntcloudBxptnewDatapromotionDecisionRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
