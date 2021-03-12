// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateDigitalassetartAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批量用户账户、姓名、手机号等信息
    @NameInMap("users")
    @Validation(required = true)
    public java.util.List<UserInfoParam> users;

    public static BatchcreateDigitalassetartAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDigitalassetartAccountRequest self = new BatchcreateDigitalassetartAccountRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateDigitalassetartAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateDigitalassetartAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateDigitalassetartAccountRequest setUsers(java.util.List<UserInfoParam> users) {
        this.users = users;
        return this;
    }
    public java.util.List<UserInfoParam> getUsers() {
        return this.users;
    }

}
