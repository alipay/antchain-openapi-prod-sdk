// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiModelPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<ApiModelVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static ApiModelPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        ApiModelPagedListVO self = new ApiModelPagedListVO();
        return TeaModel.build(map, self);
    }

    public ApiModelPagedListVO setList(java.util.List<ApiModelVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ApiModelVO> getList() {
        return this.list;
    }

    public ApiModelPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
