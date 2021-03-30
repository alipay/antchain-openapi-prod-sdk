// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfIouRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("customer_no")
    @Validation(maxLength = 20)
    public String customerNo;

    // 借据Id
    @NameInMap("debit_id")
    @Validation(maxLength = 16)
    public String debitId;

    // 支用Id
    @NameInMap("financing_id")
    @Validation(required = true, maxLength = 32)
    public String financingId;

    public static QueryPfIouRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfIouRequest self = new QueryPfIouRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfIouRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfIouRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfIouRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryPfIouRequest setDebitId(String debitId) {
        this.debitId = debitId;
        return this;
    }
    public String getDebitId() {
        return this.debitId;
    }

    public QueryPfIouRequest setFinancingId(String financingId) {
        this.financingId = financingId;
        return this;
    }
    public String getFinancingId() {
        return this.financingId;
    }

}
