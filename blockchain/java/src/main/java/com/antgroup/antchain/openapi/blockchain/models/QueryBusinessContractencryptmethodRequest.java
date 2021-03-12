// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessContractencryptmethodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约链所在地址
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

    // 用户的did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 输入参数
    @NameInMap("input_data")
    @Validation(required = true)
    public String inputData;

    // 查询方法名接口
    @NameInMap("method_signature")
    @Validation(required = true)
    public String methodSignature;

    public static QueryBusinessContractencryptmethodRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessContractencryptmethodRequest self = new QueryBusinessContractencryptmethodRequest();
        return TeaModel.build(map, self);
    }

    public QueryBusinessContractencryptmethodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBusinessContractencryptmethodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBusinessContractencryptmethodRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBusinessContractencryptmethodRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public QueryBusinessContractencryptmethodRequest setContractType(Long contractType) {
        this.contractType = contractType;
        return this;
    }
    public Long getContractType() {
        return this.contractType;
    }

    public QueryBusinessContractencryptmethodRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryBusinessContractencryptmethodRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

    public QueryBusinessContractencryptmethodRequest setMethodSignature(String methodSignature) {
        this.methodSignature = methodSignature;
        return this;
    }
    public String getMethodSignature() {
        return this.methodSignature;
    }

}
