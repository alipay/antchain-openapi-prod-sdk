// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryLeadMarketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务参数
    @NameInMap("biz_content")
    public String bizContent;

    // 线索唯一编码
    @NameInMap("lead_id")
    @Validation(required = true)
    public String leadId;

    public static QueryLeadMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeadMarketRequest self = new QueryLeadMarketRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeadMarketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeadMarketRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryLeadMarketRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryLeadMarketRequest setLeadId(String leadId) {
        this.leadId = leadId;
        return this;
    }
    public String getLeadId() {
        return this.leadId;
    }

}
