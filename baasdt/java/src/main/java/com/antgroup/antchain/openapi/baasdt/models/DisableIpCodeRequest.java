// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class DisableIpCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 发起失效请求的区块链账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 要被失效的UNI的完整编码
    @NameInMap("uni_code")
    @Validation(required = true)
    public String uniCode;

    // 是否为清空核验记录操作，默认否
    @NameInMap("code_instruction_empty")
    public Boolean codeInstructionEmpty;

    public static DisableIpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableIpCodeRequest self = new DisableIpCodeRequest();
        return TeaModel.build(map, self);
    }

    public DisableIpCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableIpCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DisableIpCodeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public DisableIpCodeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DisableIpCodeRequest setUniCode(String uniCode) {
        this.uniCode = uniCode;
        return this;
    }
    public String getUniCode() {
        return this.uniCode;
    }

    public DisableIpCodeRequest setCodeInstructionEmpty(Boolean codeInstructionEmpty) {
        this.codeInstructionEmpty = codeInstructionEmpty;
        return this;
    }
    public Boolean getCodeInstructionEmpty() {
        return this.codeInstructionEmpty;
    }

}
