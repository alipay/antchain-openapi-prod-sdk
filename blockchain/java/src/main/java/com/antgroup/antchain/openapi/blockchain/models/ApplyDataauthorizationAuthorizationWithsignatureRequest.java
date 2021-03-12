// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyDataauthorizationAuthorizationWithsignatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请ID
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 区块链ID
    @NameInMap("blockchain_id")
    @Validation(required = true)
    public String blockchainId;

    // 带签名的参数信息
    @NameInMap("parameters")
    @Validation(required = true)
    public String parameters;

    public static ApplyDataauthorizationAuthorizationWithsignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataauthorizationAuthorizationWithsignatureRequest self = new ApplyDataauthorizationAuthorizationWithsignatureRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataauthorizationAuthorizationWithsignatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public ApplyDataauthorizationAuthorizationWithsignatureRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
