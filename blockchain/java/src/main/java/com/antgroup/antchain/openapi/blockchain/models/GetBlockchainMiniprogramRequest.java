// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetBlockchainMiniprogramRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁区块链的唯一链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 蚂蚁区块链的链上交易hash值
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 原生存证数据展示自定义合约地址
    @NameInMap("contract_id")
    public String contractId;

    public static GetBlockchainMiniprogramRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainMiniprogramRequest self = new GetBlockchainMiniprogramRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockchainMiniprogramRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBlockchainMiniprogramRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetBlockchainMiniprogramRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public GetBlockchainMiniprogramRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public GetBlockchainMiniprogramRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

}
