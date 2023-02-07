// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppportraitActiontrailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 查询开始时间，毫秒
    @NameInMap("start_timestamp")
    @Validation(required = true)
    public Long startTimestamp;

    // 查询结束时间，毫秒
    @NameInMap("end_timestamp")
    @Validation(required = true)
    public Long endTimestamp;

    // 分页大小，默认为10，默
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页码，从1开始
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    public static ListAppportraitActiontrailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppportraitActiontrailRequest self = new ListAppportraitActiontrailRequest();
        return TeaModel.build(map, self);
    }

    public ListAppportraitActiontrailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppportraitActiontrailRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListAppportraitActiontrailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListAppportraitActiontrailRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ListAppportraitActiontrailRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppportraitActiontrailRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public ListAppportraitActiontrailRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public ListAppportraitActiontrailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppportraitActiontrailRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

}
