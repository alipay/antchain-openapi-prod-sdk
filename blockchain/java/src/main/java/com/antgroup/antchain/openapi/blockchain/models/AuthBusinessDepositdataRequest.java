// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthBusinessDepositdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务链对应的bizId    
    // 
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 授权者身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 被授权者did身份
    @NameInMap("granted_did")
    @Validation(required = true)
    public String grantedDid;

    // 被授权的字段
    @NameInMap("item_key_id")
    @Validation(required = true)
    public java.util.List<String> itemKeyId;

    // 业务逻辑唯一id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static AuthBusinessDepositdataRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthBusinessDepositdataRequest self = new AuthBusinessDepositdataRequest();
        return TeaModel.build(map, self);
    }

    public AuthBusinessDepositdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthBusinessDepositdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthBusinessDepositdataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AuthBusinessDepositdataRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public AuthBusinessDepositdataRequest setGrantedDid(String grantedDid) {
        this.grantedDid = grantedDid;
        return this;
    }
    public String getGrantedDid() {
        return this.grantedDid;
    }

    public AuthBusinessDepositdataRequest setItemKeyId(java.util.List<String> itemKeyId) {
        this.itemKeyId = itemKeyId;
        return this;
    }
    public java.util.List<String> getItemKeyId() {
        return this.itemKeyId;
    }

    public AuthBusinessDepositdataRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
