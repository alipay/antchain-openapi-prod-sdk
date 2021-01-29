// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationDatabaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
    @NameInMap("application")
    public String application;

    // 连接地址
    @NameInMap("connection_address")
    public String connectionAddress;

    // 资源名称
    @NameInMap("name")
    public String name;

    // 网络类型，Classic或VPC
    @NameInMap("network_type")
    public String networkType;

    // 网络连接类型，取值 Internet：外网，Intranet：内网
    @NameInMap("net_type")
    public String netType;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Long pageSize;

    // 连接端口
    @NameInMap("port")
    public Long port;

    // 目标服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    // 资源所处的状态，可指定多个
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // 目标工作空间名称
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryApplicationDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDatabaseRequest self = new QueryApplicationDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationDatabaseRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryApplicationDatabaseRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public QueryApplicationDatabaseRequest setConnectionAddress(String connectionAddress) {
        this.connectionAddress = connectionAddress;
        return this;
    }
    public String getConnectionAddress() {
        return this.connectionAddress;
    }

    public QueryApplicationDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryApplicationDatabaseRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public QueryApplicationDatabaseRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public QueryApplicationDatabaseRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationDatabaseRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationDatabaseRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public QueryApplicationDatabaseRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryApplicationDatabaseRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryApplicationDatabaseRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
