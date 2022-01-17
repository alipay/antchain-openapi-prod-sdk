// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OperatorQueryVO extends TeaModel {
    // pageInfo
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // query
    @NameInMap("query")
    public OperatorVO query;

    public static OperatorQueryVO build(java.util.Map<String, ?> map) throws Exception {
        OperatorQueryVO self = new OperatorQueryVO();
        return TeaModel.build(map, self);
    }

    public OperatorQueryVO setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public OperatorQueryVO setQuery(OperatorVO query) {
        this.query = query;
        return this;
    }
    public OperatorVO getQuery() {
        return this.query;
    }

}
