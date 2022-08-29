// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链路由字段，如：copyright、judicatory、contract
    @NameInMap("chain")
    @Validation(required = true)
    public String chain;

    // 是否跨链，目前仅支持跨链：true
    @NameInMap("cross_chain")
    @Validation(required = true)
    public Boolean crossChain;

    // 业务合约id，当crossChain为false时，该字段必填
    @NameInMap("contract_id")
    public String contractId;

    // 业务合约方法名称，当crossChain为false时，该字段必填
    @NameInMap("contract_method")
    public String contractMethod;

    // 业务合约方法入参，当crossChain为false时，该字段必填
    @NameInMap("contract_param")
    public String contractParam;

    // 业务合约方法的返回值类型
    @NameInMap("contract_out_types")
    public String contractOutTypes;

    // 跨链的业务合约的contractId，contractMethod，contractParam，contractOutTypes的JSON组合。当crossChain为true时，该字段必填。
    @NameInMap("cross_param")
    public String crossParam;

    // 是否本地执行
    @NameInMap("local")
    public Boolean local;

    // 链上账户名称
    @NameInMap("contract_account")
    public String contractAccount;

    // 业务订单id
    @NameInMap("biz_order_id")
    @Validation(required = true)
    public String bizOrderId;

    public static CheckContractRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckContractRequest self = new CheckContractRequest();
        return TeaModel.build(map, self);
    }

    public CheckContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckContractRequest setChain(String chain) {
        this.chain = chain;
        return this;
    }
    public String getChain() {
        return this.chain;
    }

    public CheckContractRequest setCrossChain(Boolean crossChain) {
        this.crossChain = crossChain;
        return this;
    }
    public Boolean getCrossChain() {
        return this.crossChain;
    }

    public CheckContractRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public CheckContractRequest setContractMethod(String contractMethod) {
        this.contractMethod = contractMethod;
        return this;
    }
    public String getContractMethod() {
        return this.contractMethod;
    }

    public CheckContractRequest setContractParam(String contractParam) {
        this.contractParam = contractParam;
        return this;
    }
    public String getContractParam() {
        return this.contractParam;
    }

    public CheckContractRequest setContractOutTypes(String contractOutTypes) {
        this.contractOutTypes = contractOutTypes;
        return this;
    }
    public String getContractOutTypes() {
        return this.contractOutTypes;
    }

    public CheckContractRequest setCrossParam(String crossParam) {
        this.crossParam = crossParam;
        return this;
    }
    public String getCrossParam() {
        return this.crossParam;
    }

    public CheckContractRequest setLocal(Boolean local) {
        this.local = local;
        return this;
    }
    public Boolean getLocal() {
        return this.local;
    }

    public CheckContractRequest setContractAccount(String contractAccount) {
        this.contractAccount = contractAccount;
        return this;
    }
    public String getContractAccount() {
        return this.contractAccount;
    }

    public CheckContractRequest setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
        return this;
    }
    public String getBizOrderId() {
        return this.bizOrderId;
    }

}
