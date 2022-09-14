// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SaveDataauthorizationDepositDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证内容
    @NameInMap("tx_data")
    @Validation(required = true)
    public String txData;

    // 发送数据上链的DID
    @NameInMap("sender_id")
    public String senderId;

    public static SaveDataauthorizationDepositDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDataauthorizationDepositDataRequest self = new SaveDataauthorizationDepositDataRequest();
        return TeaModel.build(map, self);
    }

    public SaveDataauthorizationDepositDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveDataauthorizationDepositDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveDataauthorizationDepositDataRequest setTxData(String txData) {
        this.txData = txData;
        return this;
    }
    public String getTxData() {
        return this.txData;
    }

    public SaveDataauthorizationDepositDataRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

}
