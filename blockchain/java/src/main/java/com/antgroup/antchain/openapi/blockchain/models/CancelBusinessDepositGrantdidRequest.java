// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessDepositGrantdidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证数据的发起者did身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 取消授权的did数字身份
    @NameInMap("granted_did")
    @Validation(required = true)
    public String grantedDid;

    // 取消授权的字段名称
    @NameInMap("item_key_id")
    @Validation(required = true)
    public java.util.List<String> itemKeyId;

    // 存证数据的主键
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static CancelBusinessDepositGrantdidRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessDepositGrantdidRequest self = new CancelBusinessDepositGrantdidRequest();
        return TeaModel.build(map, self);
    }

    public CancelBusinessDepositGrantdidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBusinessDepositGrantdidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBusinessDepositGrantdidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CancelBusinessDepositGrantdidRequest setGrantedDid(String grantedDid) {
        this.grantedDid = grantedDid;
        return this;
    }
    public String getGrantedDid() {
        return this.grantedDid;
    }

    public CancelBusinessDepositGrantdidRequest setItemKeyId(java.util.List<String> itemKeyId) {
        this.itemKeyId = itemKeyId;
        return this;
    }
    public java.util.List<String> getItemKeyId() {
        return this.itemKeyId;
    }

    public CancelBusinessDepositGrantdidRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
