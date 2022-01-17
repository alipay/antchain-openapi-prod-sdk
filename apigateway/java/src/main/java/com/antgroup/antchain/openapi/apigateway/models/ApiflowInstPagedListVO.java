// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiflowInstPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ApiflowInstVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ApiflowInstPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ApiflowInstPagedListVO self = new ApiflowInstPagedListVO();
        return TeaModel.build(map, self);
    }

    public ApiflowInstPagedListVO setList(java.util.List<ApiflowInstVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApiflowInstVO> getList() {
        return this.list;
    }

    public ApiflowInstPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
