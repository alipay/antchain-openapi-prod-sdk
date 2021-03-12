// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateBusinessAgreementSignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链bizId
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 回调合约名称
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 业务共识合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 用户did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 业务共识唯一标识
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 用户签名
    @NameInMap("sign_data")
    @Validation(required = true)
    public String signData;

    public static CreateBusinessAgreementSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessAgreementSignRequest self = new CreateBusinessAgreementSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessAgreementSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessAgreementSignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessAgreementSignRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateBusinessAgreementSignRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public CreateBusinessAgreementSignRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public CreateBusinessAgreementSignRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBusinessAgreementSignRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateBusinessAgreementSignRequest setSignData(String signData) {
        this.signData = signData;
        return this;
    }
    public String getSignData() {
        return this.signData;
    }

}
