// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryCmportBankfeeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 记账日期 yyyy-mm-dd
    @NameInMap("account_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountDate;

    public static QueryCmportBankfeeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCmportBankfeeRequest self = new QueryCmportBankfeeRequest();
        return TeaModel.build(map, self);
    }

    public QueryCmportBankfeeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCmportBankfeeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCmportBankfeeRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public QueryCmportBankfeeRequest setAccountDate(String accountDate) {
        this.accountDate = accountDate;
        return this;
    }
    public String getAccountDate() {
        return this.accountDate;
    }

}
