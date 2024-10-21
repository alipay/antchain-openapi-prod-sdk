// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class SubUserAccountVO extends TeaModel {
    // 用户账户id
    @NameInMap("user_account_id")
    @Validation(required = true)
    public String userAccountId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户地址
    @NameInMap("user_address")
    @Validation(required = true)
    public String userAddress;

    // 用户资产配额
    @NameInMap("user_target")
    @Validation(required = true)
    public String userTarget;

    // 用户资产
    @NameInMap("user_balance")
    @Validation(required = true)
    public String userBalance;

    // 项目id
    @NameInMap("asset_project_id")
    @Validation(required = true)
    public String assetProjectId;

    // 项目名称
    @NameInMap("asset_project_name")
    @Validation(required = true)
    public String assetProjectName;

    // 用户所属机构id
    @NameInMap("institution_id")
    @Validation(required = true)
    public String institutionId;

    // 用户所属机构名称
    @NameInMap("institution_name")
    @Validation(required = true)
    public String institutionName;

    public static SubUserAccountVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountVO self = new SubUserAccountVO();
        return TeaModel.build(map, self);
    }

    public SubUserAccountVO setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }
    public String getUserAccountId() {
        return this.userAccountId;
    }

    public SubUserAccountVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubUserAccountVO setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public SubUserAccountVO setUserTarget(String userTarget) {
        this.userTarget = userTarget;
        return this;
    }
    public String getUserTarget() {
        return this.userTarget;
    }

    public SubUserAccountVO setUserBalance(String userBalance) {
        this.userBalance = userBalance;
        return this;
    }
    public String getUserBalance() {
        return this.userBalance;
    }

    public SubUserAccountVO setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public SubUserAccountVO setAssetProjectName(String assetProjectName) {
        this.assetProjectName = assetProjectName;
        return this;
    }
    public String getAssetProjectName() {
        return this.assetProjectName;
    }

    public SubUserAccountVO setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
        return this;
    }
    public String getInstitutionId() {
        return this.institutionId;
    }

    public SubUserAccountVO setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
        return this;
    }
    public String getInstitutionName() {
        return this.institutionName;
    }

}
