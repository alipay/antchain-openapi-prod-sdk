// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ExecContractCourtdeductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 付款银行卡类型，例如：icbc（工行）
    @NameInMap("bank_type")
    @Validation(required = true)
    public String bankType;

    // 自定义交易id
    @NameInMap("biz_trade_id")
    @Validation(required = true)
    public String bizTradeId;

    public static ExecContractCourtdeductRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractCourtdeductRequest self = new ExecContractCourtdeductRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractCourtdeductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractCourtdeductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractCourtdeductRequest setBankType(String bankType) {
        this.bankType = bankType;
        return this;
    }
    public String getBankType() {
        return this.bankType;
    }

    public ExecContractCourtdeductRequest setBizTradeId(String bizTradeId) {
        this.bizTradeId = bizTradeId;
        return this;
    }
    public String getBizTradeId() {
        return this.bizTradeId;
    }

}
