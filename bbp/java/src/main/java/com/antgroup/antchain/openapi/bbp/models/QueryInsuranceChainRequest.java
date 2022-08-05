// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryInsuranceChainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 第三方Id，此处为天猫uid
    @NameInMap("source_uid")
    @Validation(required = true)
    public String sourceUid;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    public static QueryInsuranceChainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceChainRequest self = new QueryInsuranceChainRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceChainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsuranceChainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInsuranceChainRequest setSourceUid(String sourceUid) {
        this.sourceUid = sourceUid;
        return this;
    }
    public String getSourceUid() {
        return this.sourceUid;
    }

    public QueryInsuranceChainRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

}
