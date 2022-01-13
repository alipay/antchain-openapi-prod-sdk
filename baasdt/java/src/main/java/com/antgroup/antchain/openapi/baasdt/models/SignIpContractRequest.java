// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SignIpContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单合同文件OSS文件key
    @NameInMap("contract_file_url")
    @Validation(required = true)
    public String contractFileUrl;

    // 签署区信息
    @NameInMap("sign_fields")
    @Validation(required = true)
    public java.util.List<SignField> signFields;

    public static SignIpContractRequest build(java.util.Map<String, ?> map) throws Exception {
        SignIpContractRequest self = new SignIpContractRequest();
        return TeaModel.build(map, self);
    }

    public SignIpContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SignIpContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SignIpContractRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SignIpContractRequest setContractFileUrl(String contractFileUrl) {
        this.contractFileUrl = contractFileUrl;
        return this;
    }
    public String getContractFileUrl() {
        return this.contractFileUrl;
    }

    public SignIpContractRequest setSignFields(java.util.List<SignField> signFields) {
        this.signFields = signFields;
        return this;
    }
    public java.util.List<SignField> getSignFields() {
        return this.signFields;
    }

}
