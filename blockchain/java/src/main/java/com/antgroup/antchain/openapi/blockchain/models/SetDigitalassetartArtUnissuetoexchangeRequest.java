// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtUnissuetoexchangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 管理员账户地址
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

    public static SetDigitalassetartArtUnissuetoexchangeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtUnissuetoexchangeRequest self = new SetDigitalassetartArtUnissuetoexchangeRequest();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtUnissuetoexchangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDigitalassetartArtUnissuetoexchangeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetDigitalassetartArtUnissuetoexchangeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SetDigitalassetartArtUnissuetoexchangeRequest setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public SetDigitalassetartArtUnissuetoexchangeRequest setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

}
