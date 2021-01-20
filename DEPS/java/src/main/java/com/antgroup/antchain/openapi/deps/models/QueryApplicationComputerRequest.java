// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
    @NameInMap("application")
    public String application;

    // assign=true代表分配了app/appservice的computer,反之代表没有分配app/appservice的computer
    @NameInMap("assign")
    public Boolean assign;

    // 资源类型
    @NameInMap("computer_type")
    public String computerType;

    // cpu核数
    @NameInMap("cpu")
    public Long cpu;

    // 内存大小，单位MB
    @NameInMap("memory")
    public Long memory;

    // 资源名称
    @NameInMap("name")
    public String name;

    // 当前页码，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认10
    @NameInMap("page_size")
    public Long pageSize;

    // 目标服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    // 资源所处的状态，可指定多个
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // 目标工作空间名称
    @NameInMap("workspace")
    public String workspace;

    public static QueryApplicationComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationComputerRequest self = new QueryApplicationComputerRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationComputerRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public QueryApplicationComputerRequest setAssign(Boolean assign) {
        this.assign = assign;
        return this;
    }
    public Boolean getAssign() {
        return this.assign;
    }

    public QueryApplicationComputerRequest setComputerType(String computerType) {
        this.computerType = computerType;
        return this;
    }
    public String getComputerType() {
        return this.computerType;
    }

    public QueryApplicationComputerRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public QueryApplicationComputerRequest setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public QueryApplicationComputerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryApplicationComputerRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationComputerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationComputerRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryApplicationComputerRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryApplicationComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
