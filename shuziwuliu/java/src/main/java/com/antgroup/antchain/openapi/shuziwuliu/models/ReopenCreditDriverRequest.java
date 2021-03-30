// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ReopenCreditDriverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 司机did
    @NameInMap("driver_did")
    @Validation(required = true)
    public String driverDid;

    // 云资金商户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    public static ReopenCreditDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenCreditDriverRequest self = new ReopenCreditDriverRequest();
        return TeaModel.build(map, self);
    }

    public ReopenCreditDriverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReopenCreditDriverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReopenCreditDriverRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ReopenCreditDriverRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public ReopenCreditDriverRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public ReopenCreditDriverRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ReopenCreditDriverRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
