// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppStats extends TeaModel {
    // app_list
    @NameInMap("app_list")
    @Validation(required = true)
    public java.util.List<String> appList;

    // page_query
    @NameInMap("page_query")
    @Validation(required = true)
    public PageQuery pageQuery;

    public static AppStats build(java.util.Map<String, ?> map) throws Exception {
        AppStats self = new AppStats();
        return TeaModel.build(map, self);
    }

    public AppStats setAppList(java.util.List<String> appList) {
        this.appList = appList;
        return this;
    }
    public java.util.List<String> getAppList() {
        return this.appList;
    }

    public AppStats setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
        return this;
    }
    public PageQuery getPageQuery() {
        return this.pageQuery;
    }

}
