// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthBusinessDepositdataCorpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权的存证数据所在的链
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 被授权者的did数字身份
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 授权的截止日期，超过该日期后，该组织不再具有访问加密数据的权限
    @NameInMap("due_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dueTime;

    // 被授权的组织名
    @NameInMap("granted_corp")
    @Validation(required = true)
    public String grantedCorp;

    // 被授权的字段
    @NameInMap("item_key_id")
    @Validation(required = true)
    public java.util.List<String> itemKeyId;

    // 被授权的存证内容逻辑主键
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static AuthBusinessDepositdataCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthBusinessDepositdataCorpRequest self = new AuthBusinessDepositdataCorpRequest();
        return TeaModel.build(map, self);
    }

    public AuthBusinessDepositdataCorpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthBusinessDepositdataCorpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthBusinessDepositdataCorpRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AuthBusinessDepositdataCorpRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public AuthBusinessDepositdataCorpRequest setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public AuthBusinessDepositdataCorpRequest setGrantedCorp(String grantedCorp) {
        this.grantedCorp = grantedCorp;
        return this;
    }
    public String getGrantedCorp() {
        return this.grantedCorp;
    }

    public AuthBusinessDepositdataCorpRequest setItemKeyId(java.util.List<String> itemKeyId) {
        this.itemKeyId = itemKeyId;
        return this;
    }
    public java.util.List<String> getItemKeyId() {
        return this.itemKeyId;
    }

    public AuthBusinessDepositdataCorpRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
