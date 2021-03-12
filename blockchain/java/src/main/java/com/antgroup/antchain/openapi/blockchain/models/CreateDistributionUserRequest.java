// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户在ISV中的唯一标识
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 其他说明
    @NameInMap("info")
    public String info;

    // 用户手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 来源: 微信朋友圈/微信小程序/支付宝小程序/H5/商户自有APP/其他
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static CreateDistributionUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionUserRequest self = new CreateDistributionUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributionUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributionUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributionUserRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateDistributionUserRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public CreateDistributionUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateDistributionUserRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
