// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AppInfoQueryVO extends TeaModel {
    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public AppInfoVO query;

    public static AppInfoQueryVO build(java.util.Map<String, ?> map) throws Exception {
        AppInfoQueryVO self = new AppInfoQueryVO();
        return TeaModel.build(map, self);
    }

    public AppInfoQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public AppInfoQueryVO setQuery(AppInfoVO query) {
        this.query = query;
        return this;
    }
    public AppInfoVO getQuery() {
        return this.query;
    }

}
