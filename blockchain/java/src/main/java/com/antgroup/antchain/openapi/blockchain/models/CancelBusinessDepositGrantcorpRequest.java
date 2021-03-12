// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CancelBusinessDepositGrantcorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据存证所在链的业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 存证数据的发起者did数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 取消授权的组织名称
    @NameInMap("granted_corp")
    @Validation(required = true)
    public String grantedCorp;

    // 取消授权的子列名称
    @NameInMap("item_key_id")
    @Validation(required = true)
    public java.util.List<String> itemKeyId;

    // 存证数据的逻辑主keyId
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static CancelBusinessDepositGrantcorpRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBusinessDepositGrantcorpRequest self = new CancelBusinessDepositGrantcorpRequest();
        return TeaModel.build(map, self);
    }

    public CancelBusinessDepositGrantcorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBusinessDepositGrantcorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBusinessDepositGrantcorpRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CancelBusinessDepositGrantcorpRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CancelBusinessDepositGrantcorpRequest setGrantedCorp(String grantedCorp) {
        this.grantedCorp = grantedCorp;
        return this;
    }
    public String getGrantedCorp() {
        return this.grantedCorp;
    }

    public CancelBusinessDepositGrantcorpRequest setItemKeyId(java.util.List<String> itemKeyId) {
        this.itemKeyId = itemKeyId;
        return this;
    }
    public java.util.List<String> getItemKeyId() {
        return this.itemKeyId;
    }

    public CancelBusinessDepositGrantcorpRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
