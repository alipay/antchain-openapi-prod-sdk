// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class QueryDistributorRequest extends TeaModel {
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

    // 用户地址
    @NameInMap("user_address")
    public String userAddress;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 登录名类型(EMAIL)
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

    public static QueryDistributorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributorRequest self = new QueryDistributorRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDistributorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDistributorRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public QueryDistributorRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public QueryDistributorRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

    public QueryDistributorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDistributorRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public QueryDistributorRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryDistributorRequest setLoginAccoutType(String loginAccoutType) {
        this.loginAccoutType = loginAccoutType;
        return this;
    }
    public String getLoginAccoutType() {
        return this.loginAccoutType;
    }

    public QueryDistributorRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public QueryDistributorRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
