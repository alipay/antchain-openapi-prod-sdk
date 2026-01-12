// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCustomerBankcardlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    // 资金方编号
    @NameInMap("fund_code")
    @Validation(required = true)
    public String fundCode;

    // 业务类型
    @NameInMap("prod_type")
    public String prodType;

    public static QueryDubbridgeCustomerBankcardlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCustomerBankcardlistRequest self = new QueryDubbridgeCustomerBankcardlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCustomerBankcardlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCustomerBankcardlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCustomerBankcardlistRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeCustomerBankcardlistRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public QueryDubbridgeCustomerBankcardlistRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

}
