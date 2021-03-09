// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceComputerspecRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 机器规格族
    @NameInMap("instance_type_groups")
    public String instanceTypeGroups;

    // CPU最大值
    @NameInMap("max_cpu")
    public Long maxCpu;

    // 最大内存
    @NameInMap("max_mem")
    public Long maxMem;

    // CPU最小值
    @NameInMap("min_cpu")
    public Long minCpu;

    // 最小内存
    @NameInMap("min_mem")
    public Long minMem;

    public static QueryResourceComputerspecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceComputerspecRequest self = new QueryResourceComputerspecRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceComputerspecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourceComputerspecRequest setInstanceTypeGroups(String instanceTypeGroups) {
        this.instanceTypeGroups = instanceTypeGroups;
        return this;
    }
    public String getInstanceTypeGroups() {
        return this.instanceTypeGroups;
    }

    public QueryResourceComputerspecRequest setMaxCpu(Long maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Long getMaxCpu() {
        return this.maxCpu;
    }

    public QueryResourceComputerspecRequest setMaxMem(Long maxMem) {
        this.maxMem = maxMem;
        return this;
    }
    public Long getMaxMem() {
        return this.maxMem;
    }

    public QueryResourceComputerspecRequest setMinCpu(Long minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public Long getMinCpu() {
        return this.minCpu;
    }

    public QueryResourceComputerspecRequest setMinMem(Long minMem) {
        this.minMem = minMem;
        return this;
    }
    public Long getMinMem() {
        return this.minMem;
    }

}
