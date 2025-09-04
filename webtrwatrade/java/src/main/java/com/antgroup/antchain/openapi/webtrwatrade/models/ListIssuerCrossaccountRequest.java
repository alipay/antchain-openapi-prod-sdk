// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerCrossaccountRequest extends TeaModel {
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

    public static ListIssuerCrossaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerCrossaccountRequest self = new ListIssuerCrossaccountRequest();
        return TeaModel.build(map, self);
    }

    public ListIssuerCrossaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIssuerCrossaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIssuerCrossaccountRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public ListIssuerCrossaccountRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ListIssuerCrossaccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListIssuerCrossaccountRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public ListIssuerCrossaccountRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public ListIssuerCrossaccountRequest setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public ListIssuerCrossaccountRequest setCrossChainUserAddress(String crossChainUserAddress) {
        this.crossChainUserAddress = crossChainUserAddress;
        return this;
    }
    public String getCrossChainUserAddress() {
        return this.crossChainUserAddress;
    }

    public ListIssuerCrossaccountRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public ListIssuerCrossaccountRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
