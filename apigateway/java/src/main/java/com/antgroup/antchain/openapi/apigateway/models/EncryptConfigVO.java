// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class EncryptConfigVO extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // 加密状态
    @NameInMap("encryption_status")
    public String encryptionStatus;

    // 加密类型
    @NameInMap("encrypt_type")
    public String encryptType;

    // key_pair
    @NameInMap("key_pair")
    public String keyPair;

    // private_key
    @NameInMap("private_key")
    public String privateKey;

    // pub_key
    @NameInMap("pub_key")
    public String pubKey;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static EncryptConfigVO build(java.util.Map<String, ?> map) throws Exception {
        EncryptConfigVO self = new EncryptConfigVO();
        return TeaModel.build(map, self);
    }

    public EncryptConfigVO setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public EncryptConfigVO setEncryptionStatus(String encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
        return this;
    }
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    public EncryptConfigVO setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public EncryptConfigVO setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public EncryptConfigVO setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public EncryptConfigVO setPubKey(String pubKey) {
        this.pubKey = pubKey;
        return this;
    }
    public String getPubKey() {
        return this.pubKey;
    }

    public EncryptConfigVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
