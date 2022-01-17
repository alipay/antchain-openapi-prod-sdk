// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class StrategyPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<StrategyInfoVO> list;

    // 分页信息
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static StrategyPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        StrategyPagedListVO self = new StrategyPagedListVO();
        return TeaModel.build(map, self);
    }

    public StrategyPagedListVO setList(java.util.List<StrategyInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<StrategyInfoVO> getList() {
        return this.list;
    }

    public StrategyPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
