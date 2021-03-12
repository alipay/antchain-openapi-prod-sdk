// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainPublicAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // account
    @NameInMap("account")
    public String account;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // password
    @NameInMap("password")
    public String password;

    // recover_password
    @NameInMap("recover_password")
    public String recoverPassword;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static ApplyChainPublicAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainPublicAccountRequest self = new ApplyChainPublicAccountRequest();
        return TeaModel.build(map, self);
    }

    public ApplyChainPublicAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyChainPublicAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyChainPublicAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ApplyChainPublicAccountRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ApplyChainPublicAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyChainPublicAccountRequest setRecoverPassword(String recoverPassword) {
        this.recoverPassword = recoverPassword;
        return this;
    }
    public String getRecoverPassword() {
        return this.recoverPassword;
    }

    public ApplyChainPublicAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
