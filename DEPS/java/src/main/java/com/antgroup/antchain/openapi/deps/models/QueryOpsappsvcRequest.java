// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOpsappsvcRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用的名称
    @NameInMap("app_name")
    public String appName;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小，默认10，最大50
    @NameInMap("page_size")
    public Integer pageSize;

    // 应用服务的名称，如果为空，会查询该应用下所有应用服务的运维历史
    @NameInMap("service_name")
    public String serviceName;

    public static QueryOpsappsvcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsappsvcRequest self = new QueryOpsappsvcRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsappsvcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsappsvcRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryOpsappsvcRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryOpsappsvcRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOpsappsvcRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
