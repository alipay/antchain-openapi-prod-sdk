// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class OpenCreditDriverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 司机云资金商户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 开通结果回调url
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 司机分布式数字身份
    @NameInMap("driver_did")
    @Validation(required = true)
    public String driverDid;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 产品id 目前填写 PRODUCT_MYBANK
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static OpenCreditDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCreditDriverRequest self = new OpenCreditDriverRequest();
        return TeaModel.build(map, self);
    }

    public OpenCreditDriverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenCreditDriverRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenCreditDriverRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public OpenCreditDriverRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public OpenCreditDriverRequest setDriverDid(String driverDid) {
        this.driverDid = driverDid;
        return this;
    }
    public String getDriverDid() {
        return this.driverDid;
    }

    public OpenCreditDriverRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public OpenCreditDriverRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
