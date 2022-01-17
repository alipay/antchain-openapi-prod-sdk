// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ApiInfoVO> list;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ApiInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ApiInfoPagedListVO self = new ApiInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public ApiInfoPagedListVO setList(java.util.List<ApiInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApiInfoVO> getList() {
        return this.list;
    }

    public ApiInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
