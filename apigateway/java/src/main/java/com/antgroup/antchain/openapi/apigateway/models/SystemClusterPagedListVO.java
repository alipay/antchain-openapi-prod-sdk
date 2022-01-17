// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SystemClusterPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<SystemClusterVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static SystemClusterPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        SystemClusterPagedListVO self = new SystemClusterPagedListVO();
        return TeaModel.build(map, self);
    }

    public SystemClusterPagedListVO setList(java.util.List<SystemClusterVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<SystemClusterVO> getList() {
        return this.list;
    }

    public SystemClusterPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
