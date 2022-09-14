// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateAuthCertDetailpageurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 用户领取条件信息, JSON结构，信息同颁发证书时使用的领取条件
    @NameInMap("user_info")
    @Validation(required = true)
    public String userInfo;

    public static CreateAuthCertDetailpageurlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthCertDetailpageurlRequest self = new CreateAuthCertDetailpageurlRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthCertDetailpageurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAuthCertDetailpageurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAuthCertDetailpageurlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAuthCertDetailpageurlRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}
