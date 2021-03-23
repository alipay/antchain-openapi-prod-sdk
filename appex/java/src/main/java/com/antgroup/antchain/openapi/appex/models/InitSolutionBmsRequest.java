// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class InitSolutionBmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 账户名称
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 合约ID
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合约临时url
    @NameInMap("contract_url")
    @Validation(required = true)
    public String contractUrl;

    public static InitSolutionBmsRequest build(java.util.Map<String, ?> map) throws Exception {
        InitSolutionBmsRequest self = new InitSolutionBmsRequest();
        return TeaModel.build(map, self);
    }

    public InitSolutionBmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitSolutionBmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitSolutionBmsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public InitSolutionBmsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public InitSolutionBmsRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public InitSolutionBmsRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public InitSolutionBmsRequest setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
        return this;
    }
    public String getContractUrl() {
        return this.contractUrl;
    }

}
