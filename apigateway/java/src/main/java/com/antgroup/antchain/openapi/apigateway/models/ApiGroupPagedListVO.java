// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiGroupPagedListVO extends TeaModel {
    // 当前页的数据
    @NameInMap("list")
    public java.util.List<ApiGroupVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ApiGroupPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ApiGroupPagedListVO self = new ApiGroupPagedListVO();
        return TeaModel.build(map, self);
    }

    public ApiGroupPagedListVO setList(java.util.List<ApiGroupVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApiGroupVO> getList() {
        return this.list;
    }

    public ApiGroupPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
