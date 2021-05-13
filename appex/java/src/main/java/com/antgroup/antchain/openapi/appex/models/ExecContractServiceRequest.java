// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ExecContractServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用did
    @NameInMap("app_did")
    @Validation(required = true, maxLength = 128)
    public String appDid;

    // 合约方法名
    @NameInMap("contract_method")
    @Validation(required = true, maxLength = 128)
    public String contractMethod;

    // 合约名称，当一个应用有多个合约时需要传入
    @NameInMap("contract_name")
    @Validation(maxLength = 128)
    public String contractName;

    // 1.同步交易，2.异步交易，3.Local
    // 如果不理解以上交易方式之间的区别请不要传入该参数，默认为同步交易
    @NameInMap("exec_type")
    public Long execType;

    // 合约入参（格式为json）
    @NameInMap("request_body")
    @Validation(required = true, maxLength = 1024)
    public String requestBody;

    public static ExecContractServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContractServiceRequest self = new ExecContractServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExecContractServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContractServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecContractServiceRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public ExecContractServiceRequest setContractMethod(String contractMethod) {
        this.contractMethod = contractMethod;
        return this;
    }
    public String getContractMethod() {
        return this.contractMethod;
    }

    public ExecContractServiceRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public ExecContractServiceRequest setExecType(Long execType) {
        this.execType = execType;
        return this;
    }
    public Long getExecType() {
        return this.execType;
    }

    public ExecContractServiceRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

}
