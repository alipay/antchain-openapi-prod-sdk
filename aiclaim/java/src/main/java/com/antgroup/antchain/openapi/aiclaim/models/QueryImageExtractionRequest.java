// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiclaim.models;

import com.aliyun.tea.*;

public class QueryImageExtractionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务id
    @NameInMap("batch_no")
    @Validation(required = true)
    public String batchNo;

    // 理赔单id
    @NameInMap("claim_number")
    @Validation(required = true)
    public String claimNumber;

    public static QueryImageExtractionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryImageExtractionRequest self = new QueryImageExtractionRequest();
        return TeaModel.build(map, self);
    }

    public QueryImageExtractionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryImageExtractionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryImageExtractionRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public QueryImageExtractionRequest setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
        return this;
    }
    public String getClaimNumber() {
        return this.claimNumber;
    }

}
