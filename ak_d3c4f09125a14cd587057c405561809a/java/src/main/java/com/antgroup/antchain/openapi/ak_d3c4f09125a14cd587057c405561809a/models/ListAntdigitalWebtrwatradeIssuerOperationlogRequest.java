// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeIssuerOperationlogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作员用户id
    @NameInMap("user_id")
    public String userId;

    // 用户地址（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("user_address")
    public String userAddress;

    // 登录名类型(EMAIL)（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("login_account_type")
    public String loginAccountType;

    // 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("login_account")
    public String loginAccount;

    // 开始时间 (时间戳)
    @NameInMap("start_time_mills")
    public Long startTimeMills;

    // 结束时间 (时间戳)
    @NameInMap("end_time_mills")
    public Long endTimeMills;

    public static ListAntdigitalWebtrwatradeIssuerOperationlogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeIssuerOperationlogRequest self = new ListAntdigitalWebtrwatradeIssuerOperationlogRequest();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
        return this;
    }
    public String getLoginAccount() {
        return this.loginAccount;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public ListAntdigitalWebtrwatradeIssuerOperationlogRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
