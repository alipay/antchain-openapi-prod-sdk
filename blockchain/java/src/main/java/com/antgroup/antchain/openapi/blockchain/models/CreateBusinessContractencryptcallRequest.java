// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractencryptcallRequest extends TeaModel {
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

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合约类型
    @NameInMap("contract_type")
    @Validation(required = true)
    public Long contractType;

    // 具体数据的定义，加密在服务端，需传入原始值、类型及key等相关信息
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<ContractEncryptKeyItem> data;

    // 调用合约者用户身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 合约方法名
    @NameInMap("method_signature")
    @Validation(required = true)
    public String methodSignature;

    // 返回值类型
    @NameInMap("output_type")
    @Validation(required = true)
    public String outputType;

    public static CreateBusinessContractencryptcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractencryptcallRequest self = new CreateBusinessContractencryptcallRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractencryptcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessContractencryptcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessContractencryptcallRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessContractencryptcallRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessContractencryptcallRequest setContractType(Long contractType) {
        this.contractType = contractType;
        return this;
    }
    public Long getContractType() {
        return this.contractType;
    }

    public CreateBusinessContractencryptcallRequest setData(java.util.List<ContractEncryptKeyItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ContractEncryptKeyItem> getData() {
        return this.data;
    }

    public CreateBusinessContractencryptcallRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessContractencryptcallRequest setMethodSignature(String methodSignature) {
        this.methodSignature = methodSignature;
        return this;
    }
    public String getMethodSignature() {
        return this.methodSignature;
    }

    public CreateBusinessContractencryptcallRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
