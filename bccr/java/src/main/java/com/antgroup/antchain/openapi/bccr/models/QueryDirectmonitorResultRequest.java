// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDirectmonitorResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 监测任务id
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    // 页面大小(1-200)
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 页码(>0)
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    public static QueryDirectmonitorResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDirectmonitorResultRequest self = new QueryDirectmonitorResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDirectmonitorResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDirectmonitorResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDirectmonitorResultRequest setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public QueryDirectmonitorResultRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDirectmonitorResultRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

}
