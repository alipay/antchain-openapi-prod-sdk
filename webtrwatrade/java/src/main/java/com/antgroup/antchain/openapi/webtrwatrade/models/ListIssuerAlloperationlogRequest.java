// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerAlloperationlogRequest extends TeaModel {
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
    @NameInMap("login_accout_type")
    public String loginAccoutType;

    // 登录名（用户ID、用户地址、登录名+登录名类型，三组信息任选一组输入）
    @NameInMap("login_accout")
    public String loginAccout;

    // 开始时间 (时间戳)
    @NameInMap("start_time_mills")
    public Long startTimeMills;

    // 结束时间 (时间戳)
    @NameInMap("end_time_mills")
    public Long endTimeMills;

    public static ListIssuerAlloperationlogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerAlloperationlogRequest self = new ListIssuerAlloperationlogRequest();
        return TeaModel.build(map, self);
    }

    public ListIssuerAlloperationlogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIssuerAlloperationlogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIssuerAlloperationlogRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListIssuerAlloperationlogRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public ListIssuerAlloperationlogRequest setLoginAccoutType(String loginAccoutType) {
        this.loginAccoutType = loginAccoutType;
        return this;
    }
    public String getLoginAccoutType() {
        return this.loginAccoutType;
    }

    public ListIssuerAlloperationlogRequest setLoginAccout(String loginAccout) {
        this.loginAccout = loginAccout;
        return this;
    }
    public String getLoginAccout() {
        return this.loginAccout;
    }

    public ListIssuerAlloperationlogRequest setStartTimeMills(Long startTimeMills) {
        this.startTimeMills = startTimeMills;
        return this;
    }
    public Long getStartTimeMills() {
        return this.startTimeMills;
    }

    public ListIssuerAlloperationlogRequest setEndTimeMills(Long endTimeMills) {
        this.endTimeMills = endTimeMills;
        return this;
    }
    public Long getEndTimeMills() {
        return this.endTimeMills;
    }

}
