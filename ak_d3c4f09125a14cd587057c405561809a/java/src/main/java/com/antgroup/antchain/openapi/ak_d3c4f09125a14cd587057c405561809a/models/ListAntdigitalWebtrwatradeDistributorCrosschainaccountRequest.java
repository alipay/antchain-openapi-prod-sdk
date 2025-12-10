// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产项目ID - 资产项目ID & 资产项目合约地址+项目所在链  二选一
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址 - 资产项目ID & 资产项目合约地址+项目所在链  二选一
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目所在链 - 资产项目ID & 资产项目合约地址+项目所在链  二选一
    @NameInMap("chain_name")
    public String chainName;

    // 用户ID - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("user_id")
    public String userId;

    // 本侧链用户地址 - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("user_address")
    public String userAddress;

    // 登录名 - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("login_name")
    public String loginName;

    // 登录名类型(EMAIL) - 用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("login_account_type")
    public String loginAccountType;

    // 对侧链用户地址
    @NameInMap("target_user_address")
    public String targetUserAddress;

    // 开始时间 (时间戳)
    @NameInMap("start_time_mills")
    @Validation(required = true)
    public Long startTimeMills;

    // 结束时间 (时间戳)
    @NameInMap("end_time_mills")
    @Validation(required = true)
    public Long endTimeMills;

    public static ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest self = new ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setTargetUserAddress(String targetUserAddress) {
        this.targetUserAddress = targetUserAddress;
        return this;
    }
    public String getTargetUserAddress() {
        return this.targetUserAddress;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
