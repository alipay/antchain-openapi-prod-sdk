// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GrayscaleConfigPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<GrayscaleConfigVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static GrayscaleConfigPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        GrayscaleConfigPagedListVO self = new GrayscaleConfigPagedListVO();
        return TeaModel.build(map, self);
    }

    public GrayscaleConfigPagedListVO setList(java.util.List<GrayscaleConfigVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GrayscaleConfigVO> getList() {
        return this.list;
    }

    public GrayscaleConfigPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
