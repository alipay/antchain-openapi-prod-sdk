// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID-用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("user_id")
    public String userId;

    // 本侧链用户地址-用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("user_address")
    public String userAddress;

    // 登录名-用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("login_name")
    public String loginName;

    // 登录名类型(EMAIL) -用户ID & 本侧链用户地址 & 登录名+登录名类型(EMAIL) 三选一
    @NameInMap("login_account_type")
    public String loginAccountType;

    public static QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest self = new QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public QueryAntdigitalWebtrwatradeDistributorSubuseraccountRequest setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

}
