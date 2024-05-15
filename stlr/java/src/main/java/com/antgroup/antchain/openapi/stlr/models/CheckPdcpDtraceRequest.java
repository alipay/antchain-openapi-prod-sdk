// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CheckPdcpDtraceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证数据类型名称
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 存证数据ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 存证操作区块链交易ID，即存证数据版本号。若未指定，检查当前最新版本。
    @NameInMap("tx_id")
    public String txId;

    public static CheckPdcpDtraceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPdcpDtraceRequest self = new CheckPdcpDtraceRequest();
        return TeaModel.build(map, self);
    }

    public CheckPdcpDtraceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckPdcpDtraceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckPdcpDtraceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CheckPdcpDtraceRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CheckPdcpDtraceRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
