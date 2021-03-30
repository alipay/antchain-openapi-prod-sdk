// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryMonitorResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 监测任务Id
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    // 页序号(>0)
    // 
    // 
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 页大小(1-200)
    // 
    // 
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    public static QueryMonitorResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorResultRequest self = new QueryMonitorResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonitorResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMonitorResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMonitorResultRequest setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public QueryMonitorResultRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryMonitorResultRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
