// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ExecAcctPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台的统一社会信用代码，小于32
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 签约单号
    // ● 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单id，长度小于50
    @NameInMap("acct_trade_order_id")
    @Validation(required = true)
    public String acctTradeOrderId;

    public static ExecAcctPayRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAcctPayRequest self = new ExecAcctPayRequest();
        return TeaModel.build(map, self);
    }

    public ExecAcctPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAcctPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAcctPayRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public ExecAcctPayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecAcctPayRequest setAcctTradeOrderId(String acctTradeOrderId) {
        this.acctTradeOrderId = acctTradeOrderId;
        return this;
    }
    public String getAcctTradeOrderId() {
        return this.acctTradeOrderId;
    }

}
