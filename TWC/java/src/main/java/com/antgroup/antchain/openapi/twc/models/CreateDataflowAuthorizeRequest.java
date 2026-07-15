// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateDataflowAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权账户的租户ID
    @NameInMap("target_tenant")
    @Validation(required = true)
    public String targetTenant;

    // 授权类型：
    // 1. PUBKEY_UPLOAD：上传信封公钥
    // 2. GET_NOTARY：查询存证原文
    // 3. CHECK_NOTARY：核验存证信息
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权范围，授权类型为GET_NOTARY或者CHECK_NOTARY时必填，取值为：
    // 1. TXHASH：交易哈希维度授权
    // 2. ACCOUNT：账号维度授权
    @NameInMap("auth_scope")
    public String authScope;

    // 授权的目标存证地址，当授权类型为GET_NOTARY或者CHECK_NOTARY，且授权范围为TXHASH时必填，最多20个
    @NameInMap("tx_hash_list")
    public java.util.List<String> txHashList;

    // 授权有效的时间戳
    @NameInMap("expire_time")
    @Validation(required = true)
    public Long expireTime;

    public static CreateDataflowAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataflowAuthorizeRequest self = new CreateDataflowAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataflowAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataflowAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataflowAuthorizeRequest setTargetTenant(String targetTenant) {
        this.targetTenant = targetTenant;
        return this;
    }
    public String getTargetTenant() {
        return this.targetTenant;
    }

    public CreateDataflowAuthorizeRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateDataflowAuthorizeRequest setAuthScope(String authScope) {
        this.authScope = authScope;
        return this;
    }
    public String getAuthScope() {
        return this.authScope;
    }

    public CreateDataflowAuthorizeRequest setTxHashList(java.util.List<String> txHashList) {
        this.txHashList = txHashList;
        return this;
    }
    public java.util.List<String> getTxHashList() {
        return this.txHashList;
    }

    public CreateDataflowAuthorizeRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

}
