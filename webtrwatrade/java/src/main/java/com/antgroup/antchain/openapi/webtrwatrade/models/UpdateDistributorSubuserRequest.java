// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class UpdateDistributorSubuserRequest extends TeaModel {
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

    // assetProjectId
    @NameInMap("asset_project_id")
    @Validation(required = true)
    public String assetProjectId;

    // userTarget
    @NameInMap("user_target")
    @Validation(required = true)
    public String userTarget;

    public static UpdateDistributorSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDistributorSubuserRequest self = new UpdateDistributorSubuserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDistributorSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDistributorSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDistributorSubuserRequest setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public UpdateDistributorSubuserRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

    public UpdateDistributorSubuserRequest setSubUserAddress(String subUserAddress) {
        this.subUserAddress = subUserAddress;
        return this;
    }
    public String getSubUserAddress() {
        return this.subUserAddress;
    }

    public UpdateDistributorSubuserRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public UpdateDistributorSubuserRequest setUserTarget(String userTarget) {
        this.userTarget = userTarget;
        return this;
    }
    public String getUserTarget() {
        return this.userTarget;
    }

}
