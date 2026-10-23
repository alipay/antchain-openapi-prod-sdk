// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityTextdetoxificationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待祛毒语料文本
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 租户标识
    @NameInMap("business_id")
    public String businessId;

    // 应用码
    @NameInMap("app_code")
    @Validation(required = true)
    public String appCode;

    public static QuerySecurityTextdetoxificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityTextdetoxificationRequest self = new QuerySecurityTextdetoxificationRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityTextdetoxificationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityTextdetoxificationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityTextdetoxificationRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QuerySecurityTextdetoxificationRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QuerySecurityTextdetoxificationRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

}
