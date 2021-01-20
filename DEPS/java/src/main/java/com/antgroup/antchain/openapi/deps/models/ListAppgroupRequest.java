// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Integer pageSize;

    public static ListAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppgroupRequest self = new ListAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppgroupRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppgroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
