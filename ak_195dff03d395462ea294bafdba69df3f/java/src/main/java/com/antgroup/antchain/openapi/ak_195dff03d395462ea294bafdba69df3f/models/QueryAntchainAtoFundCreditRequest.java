// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoFundCreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号类型
    @NameInMap("order_no_type")
    @Validation(required = true)
    public String orderNoType;

    // 订单号，或资产包号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static QueryAntchainAtoFundCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoFundCreditRequest self = new QueryAntchainAtoFundCreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoFundCreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoFundCreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoFundCreditRequest setOrderNoType(String orderNoType) {
        this.orderNoType = orderNoType;
        return this;
    }
    public String getOrderNoType() {
        return this.orderNoType;
    }

    public QueryAntchainAtoFundCreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryAntchainAtoFundCreditRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryAntchainAtoFundCreditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
