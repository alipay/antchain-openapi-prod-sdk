// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class QueryGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 授权组成员ID。授权组成员是操作员
    @NameInMap("member_id")
    public String memberId;

    // 授权组名称
    @NameInMap("name")
    public String name;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Integer pageSize;

    public static QueryGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupRequest self = new QueryGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGroupRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public QueryGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryGroupRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
