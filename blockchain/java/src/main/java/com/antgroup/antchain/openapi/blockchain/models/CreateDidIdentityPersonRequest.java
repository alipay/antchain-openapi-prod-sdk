// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDidIdentityPersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    @NameInMap("extension_info")
    public String extensionInfo;

    // 公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 恢复公钥
    @NameInMap("recovery_key")
    @Validation(required = true)
    public String recoveryKey;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户名称
    @NameInMap("user_name")
    public String userName;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static CreateDidIdentityPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidIdentityPersonRequest self = new CreateDidIdentityPersonRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidIdentityPersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidIdentityPersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidIdentityPersonRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDidIdentityPersonRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public CreateDidIdentityPersonRequest setRecoveryKey(String recoveryKey) {
        this.recoveryKey = recoveryKey;
        return this;
    }
    public String getRecoveryKey() {
        return this.recoveryKey;
    }

    public CreateDidIdentityPersonRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateDidIdentityPersonRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDidIdentityPersonRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
