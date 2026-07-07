// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailPdcpDepositRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据类型名称，用户标识记录的数据类型。
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 存证数据ID，存证数据唯一标识ID。
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 数据存证区块链交易ID，对应数据版本号。 若未指定，返回最近的版本。
    @NameInMap("tx_id")
    public String txId;

    public static DetailPdcpDepositRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailPdcpDepositRequest self = new DetailPdcpDepositRequest();
        return TeaModel.build(map, self);
    }

    public DetailPdcpDepositRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailPdcpDepositRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailPdcpDepositRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DetailPdcpDepositRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DetailPdcpDepositRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
