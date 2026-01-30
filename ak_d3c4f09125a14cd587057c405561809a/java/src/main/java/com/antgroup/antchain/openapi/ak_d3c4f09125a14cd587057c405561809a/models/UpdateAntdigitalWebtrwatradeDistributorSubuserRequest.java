// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class UpdateAntdigitalWebtrwatradeDistributorSubuserRequest extends TeaModel {
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

    // 登录开关
    @NameInMap("login_account_switch")
    public Boolean loginAccountSwitch;

    // 姓名
    @NameInMap("name")
    public String name;

    // 联系方式
    @NameInMap("contact")
    public String contact;

    public static UpdateAntdigitalWebtrwatradeDistributorSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntdigitalWebtrwatradeDistributorSubuserRequest self = new UpdateAntdigitalWebtrwatradeDistributorSubuserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setSubUserAccountId(String subUserAccountId) {
        this.subUserAccountId = subUserAccountId;
        return this;
    }
    public String getSubUserAccountId() {
        return this.subUserAccountId;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setSubUserAddress(String subUserAddress) {
        this.subUserAddress = subUserAddress;
        return this;
    }
    public String getSubUserAddress() {
        return this.subUserAddress;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setUserTarget(String userTarget) {
        this.userTarget = userTarget;
        return this;
    }
    public String getUserTarget() {
        return this.userTarget;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setLoginAccountSwitch(Boolean loginAccountSwitch) {
        this.loginAccountSwitch = loginAccountSwitch;
        return this;
    }
    public Boolean getLoginAccountSwitch() {
        return this.loginAccountSwitch;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAntdigitalWebtrwatradeDistributorSubuserRequest setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

}
