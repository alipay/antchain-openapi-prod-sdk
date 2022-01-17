// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OperatorPagedListVO extends TeaModel {
    // 当前页的数据
    @NameInMap("list")
    public java.util.List<OperatorVO> list;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static OperatorPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        OperatorPagedListVO self = new OperatorPagedListVO();
        return TeaModel.build(map, self);
    }

    public OperatorPagedListVO setList(java.util.List<OperatorVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<OperatorVO> getList() {
        return this.list;
    }

    public OperatorPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
