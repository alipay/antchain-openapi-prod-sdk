// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractDeployRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约代码
    @NameInMap("contract_code")
    @Validation(required = true)
    public String contractCode;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合约类型
    @NameInMap("contract_type")
    @Validation(required = true)
    public Long contractType;

    // 合约部署者did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 构造函数传入参数
    @NameInMap("input_data")
    public String inputData;

    public static CreateBusinessContractDeployRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractDeployRequest self = new CreateBusinessContractDeployRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractDeployRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessContractDeployRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessContractDeployRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessContractDeployRequest setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }
    public String getContractCode() {
        return this.contractCode;
    }

    public CreateBusinessContractDeployRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessContractDeployRequest setContractType(Long contractType) {
        this.contractType = contractType;
        return this;
    }
    public Long getContractType() {
        return this.contractType;
    }

    public CreateBusinessContractDeployRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessContractDeployRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

}
