// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateDigitalassetExchangeAccountmapRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务方需映射的账户列表
    @NameInMap("account_map_params")
    @Validation(required = true)
    public java.util.List<ExchangeAccountMap> accountMapParams;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    public static BatchcreateDigitalassetExchangeAccountmapRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDigitalassetExchangeAccountmapRequest self = new BatchcreateDigitalassetExchangeAccountmapRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateDigitalassetExchangeAccountmapRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateDigitalassetExchangeAccountmapRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateDigitalassetExchangeAccountmapRequest setAccountMapParams(java.util.List<ExchangeAccountMap> accountMapParams) {
        this.accountMapParams = accountMapParams;
        return this;
    }
    public java.util.List<ExchangeAccountMap> getAccountMapParams() {
        return this.accountMapParams;
    }

    public BatchcreateDigitalassetExchangeAccountmapRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

}
