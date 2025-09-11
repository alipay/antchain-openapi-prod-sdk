// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeDistributorCrossaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产项目ID
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目所在链
    @NameInMap("chain_name")
    public String chainName;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 本侧链用户地址
    @NameInMap("user_address")
    public String userAddress;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 登录名类型(EMAIL)
    @NameInMap("login_account_type")
    public String loginAccountType;

    // 对侧链用户地址
    @NameInMap("cross_chain_user_address")
    public String crossChainUserAddress;

    // 开始时间 (时间戳)
    @NameInMap("start_time_mills")
    @Validation(required = true)
    public Long startTimeMills;

    // 结束时间 (时间戳)
    @NameInMap("end_time_mills")
    @Validation(required = true)
    public Long endTimeMills;

    public static ListAntdigitalWebtrwatradeDistributorCrossaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeDistributorCrossaccountRequest self = new ListAntdigitalWebtrwatradeDistributorCrossaccountRequest();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setCrossChainUserAddress(String crossChainUserAddress) {
        this.crossChainUserAddress = crossChainUserAddress;
        return this;
    }
    public String getCrossChainUserAddress() {
        return this.crossChainUserAddress;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public ListAntdigitalWebtrwatradeDistributorCrossaccountRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
