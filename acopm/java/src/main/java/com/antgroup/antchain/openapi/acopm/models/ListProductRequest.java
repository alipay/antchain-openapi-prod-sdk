// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class ListProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户域账号
    @NameInMap("user_id")
    public String userId;

    // 产品关键字
    @NameInMap("keyword")
    public String keyword;

    // 每页记录
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页面
    @NameInMap("current_page")
    public Long currentPage;

    public static ListProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductRequest self = new ListProductRequest();
        return TeaModel.build(map, self);
    }

    public ListProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListProductRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListProductRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListProductRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProductRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
