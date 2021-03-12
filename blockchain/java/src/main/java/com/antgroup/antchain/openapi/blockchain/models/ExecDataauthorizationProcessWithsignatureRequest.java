// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecDataauthorizationProcessWithsignatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链ID
    @NameInMap("blockchain_id")
    @Validation(required = true)
    public String blockchainId;

    // 带签名的参数信息
    @NameInMap("parameters")
    @Validation(required = true)
    public String parameters;

    public static ExecDataauthorizationProcessWithsignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataauthorizationProcessWithsignatureRequest self = new ExecDataauthorizationProcessWithsignatureRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataauthorizationProcessWithsignatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDataauthorizationProcessWithsignatureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDataauthorizationProcessWithsignatureRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public ExecDataauthorizationProcessWithsignatureRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
