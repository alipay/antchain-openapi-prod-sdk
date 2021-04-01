// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessAgreementRegisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链的bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 回调合约方法
    @NameInMap("callback_method")
    @Validation(required = true)
    public String callbackMethod;

    // 回调合约名称
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 用户身份的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 回调key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 合约模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static CreateBusinessAgreementRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessAgreementRegisterRequest self = new CreateBusinessAgreementRegisterRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessAgreementRegisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessAgreementRegisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessAgreementRegisterRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessAgreementRegisterRequest setCallbackMethod(String callbackMethod) {
        this.callbackMethod = callbackMethod;
        return this;
    }
    public String getCallbackMethod() {
        return this.callbackMethod;
    }

    public CreateBusinessAgreementRegisterRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public CreateBusinessAgreementRegisterRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessAgreementRegisterRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessAgreementRegisterRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateBusinessAgreementRegisterRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
