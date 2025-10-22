// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class QueryIssuerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
    @NameInMap("chain_name")
    public String chainName;

    // 用户ID（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("user_id")
    public String userId;

    // 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("user_address")
    public String userAddress;

    // 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("login_name")
    public String loginName;

    // 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("login_accout_type")
    public String loginAccoutType;

    // 开始时间 (时间戳)
    @NameInMap("start_time_mills")
    @Validation(required = true)
    public Long startTimeMills;

    // 结束时间 (时间戳)
    @NameInMap("end_time_mills")
    @Validation(required = true)
    public Long endTimeMills;

    public static QueryIssuerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIssuerRequest self = new QueryIssuerRequest();
        return TeaModel.build(map, self);
    }

    public QueryIssuerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIssuerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIssuerRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public QueryIssuerRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public QueryIssuerRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public QueryIssuerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIssuerRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public QueryIssuerRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryIssuerRequest setLoginAccoutType(String loginAccoutType) {
        this.loginAccoutType = loginAccoutType;
        return this;
    }
    public String getLoginAccoutType() {
        return this.loginAccoutType;
    }

    public QueryIssuerRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public QueryIssuerRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
