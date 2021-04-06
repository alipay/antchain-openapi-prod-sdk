// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class SearchOperatorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 企业ID
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 昵称
    @NameInMap("nickname")
    public String nickname;

    // 当前页，默认值为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认值为10
    @NameInMap("page_size")
    public Long pageSize;

    // 真实姓名
    @NameInMap("real_name")
    public String realName;

    // 租户唯一标识
    @NameInMap("tenant")
    public String tenant;

    public static SearchOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchOperatorRequest self = new SearchOperatorRequest();
        return TeaModel.build(map, self);
    }

    public SearchOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SearchOperatorRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public SearchOperatorRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public SearchOperatorRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public SearchOperatorRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public SearchOperatorRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchOperatorRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public SearchOperatorRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
