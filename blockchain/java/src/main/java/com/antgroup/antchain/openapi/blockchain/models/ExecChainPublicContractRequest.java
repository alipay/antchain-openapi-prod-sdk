// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecChainPublicContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // transaction
    @NameInMap("transaction")
    public String transaction;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static ExecChainPublicContractRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecChainPublicContractRequest self = new ExecChainPublicContractRequest();
        return TeaModel.build(map, self);
    }

    public ExecChainPublicContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecChainPublicContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecChainPublicContractRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ExecChainPublicContractRequest setTransaction(String transaction) {
        this.transaction = transaction;
        return this;
    }
    public String getTransaction() {
        return this.transaction;
    }

    public ExecChainPublicContractRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
