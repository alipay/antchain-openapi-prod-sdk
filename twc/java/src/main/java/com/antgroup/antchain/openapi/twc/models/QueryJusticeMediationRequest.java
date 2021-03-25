// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeMediationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品码 由蚂蚁分配
    // 
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 案件编号
    @NameInMap("case_number")
    @Validation(required = true)
    public String caseNumber;

    public static QueryJusticeMediationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeMediationRequest self = new QueryJusticeMediationRequest();
        return TeaModel.build(map, self);
    }

    public QueryJusticeMediationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJusticeMediationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJusticeMediationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryJusticeMediationRequest setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
        return this;
    }
    public String getCaseNumber() {
        return this.caseNumber;
    }

}
