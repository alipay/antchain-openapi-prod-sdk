// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAgoraxTradeRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户编号
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    // 退款请求号
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 商户订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 额外查询选项
    @NameInMap("query_options")
    public java.util.List<String> queryOptions;

    public static QueryAgoraxTradeRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgoraxTradeRefundRequest self = new QueryAgoraxTradeRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgoraxTradeRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgoraxTradeRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAgoraxTradeRefundRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public QueryAgoraxTradeRefundRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public QueryAgoraxTradeRefundRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryAgoraxTradeRefundRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryAgoraxTradeRefundRequest setQueryOptions(java.util.List<String> queryOptions) {
        this.queryOptions = queryOptions;
        return this;
    }
    public java.util.List<String> getQueryOptions() {
        return this.queryOptions;
    }

}
