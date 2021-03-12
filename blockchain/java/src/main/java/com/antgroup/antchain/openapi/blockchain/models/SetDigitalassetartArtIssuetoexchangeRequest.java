// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtIssuetoexchangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 拥有者账户地址
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 艺术品id
    @NameInMap("art_id")
    @Validation(required = true)
    public String artId;

    // 交易所代码
    @NameInMap("exchange_code")
    @Validation(required = true)
    public String exchangeCode;

    public static SetDigitalassetartArtIssuetoexchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtIssuetoexchangeRequest self = new SetDigitalassetartArtIssuetoexchangeRequest();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtIssuetoexchangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDigitalassetartArtIssuetoexchangeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetDigitalassetartArtIssuetoexchangeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetDigitalassetartArtIssuetoexchangeRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public SetDigitalassetartArtIssuetoexchangeRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

}
