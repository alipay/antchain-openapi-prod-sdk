// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DeleteDistributorSubuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 二级用户账号
    @NameInMap("sub_user_account_id")
    @Validation(required = true)
    public String subUserAccountId;

    // 用户id
    @NameInMap("sub_user_id")
    public String subUserId;

    // 二级用户钱包地址
    @NameInMap("sub_user_address")
    public String subUserAddress;

    public static DeleteDistributorSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDistributorSubuserRequest self = new DeleteDistributorSubuserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDistributorSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDistributorSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDistributorSubuserRequest setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public DeleteDistributorSubuserRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

    public DeleteDistributorSubuserRequest setSubUserAddress(String subUserAddress) {
        this.subUserAddress = subUserAddress;
        return this;
    }
    public String getSubUserAddress() {
        return this.subUserAddress;
    }

}
