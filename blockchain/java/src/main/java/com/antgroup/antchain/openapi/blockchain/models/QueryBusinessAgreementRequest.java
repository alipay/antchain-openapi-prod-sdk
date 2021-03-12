// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务共识链id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 回调合约id
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 业务共识合约id
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 发起者did账户
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 业务共识唯一id
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    public static QueryBusinessAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessAgreementRequest self = new QueryBusinessAgreementRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessAgreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessAgreementRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBusinessAgreementRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public QueryBusinessAgreementRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public QueryBusinessAgreementRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBusinessAgreementRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
