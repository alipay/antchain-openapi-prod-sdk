// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelDataflowAuthorizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标租户ID
    @NameInMap("target_tenant")
    @Validation(required = true)
    public String targetTenant;

    // 授权类型： 1. PUBKEY_UPLOAD：上传信封公钥 2. GET_NOTARY：查询存证原文 3. CHECK_NOTARY：核验存证信息
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 授权范围，授权类型为GET_NOTARY或者CHECK_NOTARY时必填，取值为： 1. TXHASH：交易哈希维度授权 2. ACCOUNT：账号维度授权
    @NameInMap("auth_scope")
    public String authScope;

    // 授权的目标存证地址，当授权类型为GET_NOTARY或者CHECK_NOTARY，且授权范围为TXHASH时必填，最多20个
    @NameInMap("tx_hash_list")
    public java.util.List<String> txHashList;

    public static CancelDataflowAuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDataflowAuthorizeRequest self = new CancelDataflowAuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public CancelDataflowAuthorizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDataflowAuthorizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelDataflowAuthorizeRequest setTargetTenant(String targetTenant) {
        this.targetTenant = targetTenant;
        return this;
    }
    public String getTargetTenant() {
        return this.targetTenant;
    }

    public CancelDataflowAuthorizeRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CancelDataflowAuthorizeRequest setAuthScope(String authScope) {
        this.authScope = authScope;
        return this;
    }
    public String getAuthScope() {
        return this.authScope;
    }

    public CancelDataflowAuthorizeRequest setTxHashList(java.util.List<String> txHashList) {
        this.txHashList = txHashList;
        return this;
    }
    public java.util.List<String> getTxHashList() {
        return this.txHashList;
    }

}
