// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产项目ID - 资产项目ID & 资产项目合约地址+项目所在链 二选一
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址 - 资产项目ID & 资产项目合约地址+项目所在链 二选一
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目所在链 - 资产项目ID & 资产项目合约地址+项目所在链 二选一
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

    // 虚拟子账号对应用户ID
    @NameInMap("virtual_account_user_id")
    public String virtualAccountUserId;

    // 虚拟子账号登录名
    @NameInMap("virtual_account_login_name")
    public String virtualAccountLoginName;

    // 虚拟子账号登录名类型(EMAIL)
    @NameInMap("virtual_account_login_account_type")
    public String virtualAccountLoginAccountType;

    // 开始时间 (时间戳)
    @NameInMap("start_time_mills")
    @Validation(required = true)
    public Long startTimeMills;

    // 结束时间 (时间戳)
    @NameInMap("end_time_mills")
    @Validation(required = true)
    public Long endTimeMills;

    public static DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest self = new DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest();
        return TeaModel.build(map, self);
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setVirtualAccountUserId(String virtualAccountUserId) {
        this.virtualAccountUserId = virtualAccountUserId;
        return this;
    }
    public String getVirtualAccountUserId() {
        return this.virtualAccountUserId;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setVirtualAccountLoginName(String virtualAccountLoginName) {
        this.virtualAccountLoginName = virtualAccountLoginName;
        return this;
    }
    public String getVirtualAccountLoginName() {
        return this.virtualAccountLoginName;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setVirtualAccountLoginAccountType(String virtualAccountLoginAccountType) {
        this.virtualAccountLoginAccountType = virtualAccountLoginAccountType;
        return this;
    }
    public String getVirtualAccountLoginAccountType() {
        return this.virtualAccountLoginAccountType;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public DetailAntdigitalWebtrwatradeDistributorSubuservirtualaccountRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
