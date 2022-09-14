// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecAuthContractClaimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务流水唯一ID，用于对一个业务流的追踪，与请求中的biz_id一致方便业务方使用。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 合约方法名称
    @NameInMap("function_name")
    @Validation(required = true)
    public String functionName;

    // 合约入参类型，和 arguments对应， 取值类型： DOUBLE，STRING，INTEGER，LONG，FLOAT； 默认为String
    @NameInMap("arguments")
    public java.util.List<String> arguments;

    // 保留参数，选填，目前暂未用到，合约入参类型，和 arguments对应 取值类型： DOUBLE，STRING，INTEGER，LONG，FLOAT；
    @NameInMap("types")
    public java.util.List<String> types;

    public static ExecAuthContractClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAuthContractClaimRequest self = new ExecAuthContractClaimRequest();
        return TeaModel.build(map, self);
    }

    public ExecAuthContractClaimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAuthContractClaimRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAuthContractClaimRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExecAuthContractClaimRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ExecAuthContractClaimRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public ExecAuthContractClaimRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ExecAuthContractClaimRequest setArguments(java.util.List<String> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.List<String> getArguments() {
        return this.arguments;
    }

    public ExecAuthContractClaimRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
