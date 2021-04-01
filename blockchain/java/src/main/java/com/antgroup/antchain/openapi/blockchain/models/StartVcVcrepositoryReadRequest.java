// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartVcVcrepositoryReadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 提交请求的did，通常是在授权列表中的did才具有读取权限。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 对当前VC Repository操作的描述，signature字段需要包含此操作的描述，最终会记录在VC Repository连接的链上，可追溯此operation操作记录。
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    // 读数据请求的did对应使用公钥做的数据签名，确保数据准确性，签名包含operation字段，会一起上链。
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 目标读取VC的唯一id标识。
    @NameInMap("verifiable_claim_id")
    @Validation(required = true)
    public String verifiableClaimId;

    public static StartVcVcrepositoryReadRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVcVcrepositoryReadRequest self = new StartVcVcrepositoryReadRequest();
        return TeaModel.build(map, self);
    }

    public StartVcVcrepositoryReadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartVcVcrepositoryReadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartVcVcrepositoryReadRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartVcVcrepositoryReadRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public StartVcVcrepositoryReadRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartVcVcrepositoryReadRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
