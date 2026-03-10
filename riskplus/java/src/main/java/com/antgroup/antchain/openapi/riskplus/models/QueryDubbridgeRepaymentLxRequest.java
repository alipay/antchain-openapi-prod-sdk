// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepaymentLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 还款请求流水号/账单号
    @NameInMap("bill_id")
    @Validation(required = true)
    public String billId;

    // 放款编号/借据号
    @NameInMap("capital_loan_no")
    @Validation(required = true)
    public String capitalLoanNo;

    public static QueryDubbridgeRepaymentLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepaymentLxRequest self = new QueryDubbridgeRepaymentLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepaymentLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRepaymentLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRepaymentLxRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public QueryDubbridgeRepaymentLxRequest setCapitalLoanNo(String capitalLoanNo) {
        this.capitalLoanNo = capitalLoanNo;
        return this;
    }
    public String getCapitalLoanNo() {
        return this.capitalLoanNo;
    }

}
