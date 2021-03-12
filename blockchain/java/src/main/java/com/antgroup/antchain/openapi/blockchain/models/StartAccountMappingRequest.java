// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAccountMappingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 映射账户详细信息
    @NameInMap("account")
    @Validation(required = true)
    public AccountMap account;

    // 扩展信息
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    public static StartAccountMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAccountMappingRequest self = new StartAccountMappingRequest();
        return TeaModel.build(map, self);
    }

    public StartAccountMappingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAccountMappingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAccountMappingRequest setAccount(AccountMap account) {
        this.account = account;
        return this;
    }
    public AccountMap getAccount() {
        return this.account;
    }

    public StartAccountMappingRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
