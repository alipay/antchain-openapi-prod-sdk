// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessContractencryptreceiptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链的业务bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // test_contract_name
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 调用者用户身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 交易对应的链上地址
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static QueryBusinessContractencryptreceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessContractencryptreceiptRequest self = new QueryBusinessContractencryptreceiptRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessContractencryptreceiptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessContractencryptreceiptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessContractencryptreceiptRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBusinessContractencryptreceiptRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public QueryBusinessContractencryptreceiptRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBusinessContractencryptreceiptRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
