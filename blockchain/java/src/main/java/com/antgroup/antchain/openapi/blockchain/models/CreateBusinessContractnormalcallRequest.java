// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessContractnormalcallRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    // 
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

    // 调用合约者身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 传入参数
    @NameInMap("input_data")
    @Validation(required = true)
    public String inputData;

    // 合约接口名称
    @NameInMap("method_signature")
    @Validation(required = true)
    public String methodSignature;

    // 返回值类型
    @NameInMap("output_type")
    @Validation(required = true)
    public String outputType;

    public static CreateBusinessContractnormalcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessContractnormalcallRequest self = new CreateBusinessContractnormalcallRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessContractnormalcallRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessContractnormalcallRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessContractnormalcallRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessContractnormalcallRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessContractnormalcallRequest setContractType(Long contractType) {
        this.contractType = contractType;
        return this;
    }
    public Long getContractType() {
        return this.contractType;
    }

    public CreateBusinessContractnormalcallRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessContractnormalcallRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

    public CreateBusinessContractnormalcallRequest setMethodSignature(String methodSignature) {
        this.methodSignature = methodSignature;
        return this;
    }
    public String getMethodSignature() {
        return this.methodSignature;
    }

    public CreateBusinessContractnormalcallRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
