// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartVcVcrepositoryAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定情况跟随 auth_did_list，如果auth_did_list不指定，则此字段无需指定，否则是与auth_did_list长度相同，并且对应auth_did_list的did的公钥加密AES密钥的结果。
    @NameInMap("auth_access_key_list")
    @Validation(required = true)
    public java.util.List<String> authAccessKeyList;

    // 本次追加授权的did列表
    @NameInMap("auth_did_list")
    @Validation(required = true)
    public java.util.List<String> authDidList;

    // 提交请求的did，通常是目标VC的subject did，也就是VC的owner。
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

    // 目标VC的唯一id标识。
    @NameInMap("verifiable_claim_id")
    @Validation(required = true)
    public String verifiableClaimId;

    public static StartVcVcrepositoryAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVcVcrepositoryAuthRequest self = new StartVcVcrepositoryAuthRequest();
        return TeaModel.build(map, self);
    }

    public StartVcVcrepositoryAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartVcVcrepositoryAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartVcVcrepositoryAuthRequest setAuthAccessKeyList(java.util.List<String> authAccessKeyList) {
        this.authAccessKeyList = authAccessKeyList;
        return this;
    }
    public java.util.List<String> getAuthAccessKeyList() {
        return this.authAccessKeyList;
    }

    public StartVcVcrepositoryAuthRequest setAuthDidList(java.util.List<String> authDidList) {
        this.authDidList = authDidList;
        return this;
    }
    public java.util.List<String> getAuthDidList() {
        return this.authDidList;
    }

    public StartVcVcrepositoryAuthRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartVcVcrepositoryAuthRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public StartVcVcrepositoryAuthRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public StartVcVcrepositoryAuthRequest setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
