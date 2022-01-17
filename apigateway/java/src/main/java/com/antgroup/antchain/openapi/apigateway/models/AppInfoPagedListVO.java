// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AppInfoPagedListVO extends TeaModel {
    // list
    @NameInMap("list")
    public java.util.List<AppInfoVO> list;

    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    public static AppInfoPagedListVO build(java.util.Map<String, ?> map) throws Exception {
        AppInfoPagedListVO self = new AppInfoPagedListVO();
        return TeaModel.build(map, self);
    }

    public AppInfoPagedListVO setList(java.util.List<AppInfoVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AppInfoVO> getList() {
        return this.list;
    }

    public AppInfoPagedListVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
