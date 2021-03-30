// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfPaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务参考号
    @NameInMap("buss_refr_no")
    @Validation(required = true, maxLength = 100)
    public String bussRefrNo;

    // 支用id
    @NameInMap("financing_id")
    @Validation(required = true, maxLength = 32)
    public String financingId;

    public static QueryPfPaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfPaymentRequest self = new QueryPfPaymentRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfPaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfPaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfPaymentRequest setBussRefrNo(String bussRefrNo) {
        this.bussRefrNo = bussRefrNo;
        return this;
    }
    public String getBussRefrNo() {
        return this.bussRefrNo;
    }

    public QueryPfPaymentRequest setFinancingId(String financingId) {
        this.financingId = financingId;
        return this;
    }
    public String getFinancingId() {
        return this.financingId;
    }

}
