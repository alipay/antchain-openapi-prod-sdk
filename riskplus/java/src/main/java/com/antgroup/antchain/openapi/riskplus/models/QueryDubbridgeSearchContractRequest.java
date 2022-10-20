// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeSearchContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 原用信订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 客户号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    // 合同类型
    @NameInMap("contract_type")
    public String contractType;

    public static QueryDubbridgeSearchContractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeSearchContractRequest self = new QueryDubbridgeSearchContractRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeSearchContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeSearchContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeSearchContractRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubbridgeSearchContractRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeSearchContractRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

}
