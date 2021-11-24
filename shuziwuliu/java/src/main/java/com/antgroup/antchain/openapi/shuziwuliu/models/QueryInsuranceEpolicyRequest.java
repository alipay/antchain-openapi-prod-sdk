// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryInsuranceEpolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投保返回的交易流水号
    @NameInMap("apply_trade_no")
    @Validation(required = true, maxLength = 50)
    public String applyTradeNo;

    // 保司编码
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 64)
    public String externalChannelCode;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true, maxLength = 64)
    public String policyNo;

    public static QueryInsuranceEpolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceEpolicyRequest self = new QueryInsuranceEpolicyRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceEpolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsuranceEpolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInsuranceEpolicyRequest setApplyTradeNo(String applyTradeNo) {
        this.applyTradeNo = applyTradeNo;
        return this;
    }
    public String getApplyTradeNo() {
        return this.applyTradeNo;
    }

    public QueryInsuranceEpolicyRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public QueryInsuranceEpolicyRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

}
