// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RouterInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<RouterInfoVO> list;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static RouterInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        RouterInfoPagedListVO self = new RouterInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public RouterInfoPagedListVO setList(java.util.List<RouterInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<RouterInfoVO> getList() {
        return this.list;
    }

    public RouterInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
