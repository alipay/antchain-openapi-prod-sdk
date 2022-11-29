// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PushPdcpBlockchainRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消息ID
    @NameInMap("tx_msg_id")
    @Validation(required = true)
    public String txMsgId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 数据类型，枚举定义
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 密文类型
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 待存证数据，根据数据类型序列化为json。并加密传输
    @NameInMap("deposit_data")
    @Validation(required = true)
    public String depositData;

    public static PushPdcpBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        PushPdcpBlockchainRequest self = new PushPdcpBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public PushPdcpBlockchainRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushPdcpBlockchainRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushPdcpBlockchainRequest setTxMsgId(String txMsgId) {
        this.txMsgId = txMsgId;
        return this;
    }
    public String getTxMsgId() {
        return this.txMsgId;
    }

    public PushPdcpBlockchainRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushPdcpBlockchainRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PushPdcpBlockchainRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public PushPdcpBlockchainRequest setDepositData(String depositData) {
        this.depositData = depositData;
        return this;
    }
    public String getDepositData() {
        return this.depositData;
    }

}
