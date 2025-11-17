// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryCarloanUsersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 分页
    @NameInMap("page_info")
    @Validation(required = true)
    public PageInfo pageInfo;

    public static QueryCarloanUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarloanUsersRequest self = new QueryCarloanUsersRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarloanUsersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarloanUsersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarloanUsersRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryCarloanUsersRequest setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
