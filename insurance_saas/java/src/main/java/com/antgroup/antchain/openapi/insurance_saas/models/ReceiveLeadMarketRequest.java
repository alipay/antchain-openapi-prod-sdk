// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ReceiveLeadMarketRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 线索唯一id
    @NameInMap("lead_id")
    @Validation(required = true)
    public String leadId;

    // 本次固定传LMKT_LEADS_TRANSFER
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 业务参数，json
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static ReceiveLeadMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveLeadMarketRequest self = new ReceiveLeadMarketRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveLeadMarketRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveLeadMarketRequest setLeadId(String leadId) {
        this.leadId = leadId;
        return this;
    }
    public String getLeadId() {
        return this.leadId;
    }

    public ReceiveLeadMarketRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReceiveLeadMarketRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
