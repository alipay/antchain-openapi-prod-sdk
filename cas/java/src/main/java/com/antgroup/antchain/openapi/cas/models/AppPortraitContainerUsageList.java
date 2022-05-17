// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitContainerUsageList extends TeaModel {
    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // request_cpu
    @NameInMap("request_cpu")
    @Validation(required = true)
    public Long requestCpu;

    // request_mem
    @NameInMap("request_mem")
    @Validation(required = true)
    public Long requestMem;

    // limit_cpu
    @NameInMap("limit_cpu")
    @Validation(required = true)
    public Long limitCpu;

    // limit_mem
    @NameInMap("limit_mem")
    @Validation(required = true)
    public Long limitMem;

    // average_cpu
    @NameInMap("average_cpu")
    @Validation(required = true)
    public Long averageCpu;

    // average_mem
    @NameInMap("average_mem")
    @Validation(required = true)
    public Long averageMem;

    public static AppPortraitContainerUsageList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitContainerUsageList self = new AppPortraitContainerUsageList();
        return TeaModel.build(map, self);
    }

    public AppPortraitContainerUsageList setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AppPortraitContainerUsageList setRequestCpu(Long requestCpu) {
        this.requestCpu = requestCpu;
        return this;
    }
    public Long getRequestCpu() {
        return this.requestCpu;
    }

    public AppPortraitContainerUsageList setRequestMem(Long requestMem) {
        this.requestMem = requestMem;
        return this;
    }
    public Long getRequestMem() {
        return this.requestMem;
    }

    public AppPortraitContainerUsageList setLimitCpu(Long limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }
    public Long getLimitCpu() {
        return this.limitCpu;
    }

    public AppPortraitContainerUsageList setLimitMem(Long limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public Long getLimitMem() {
        return this.limitMem;
    }

    public AppPortraitContainerUsageList setAverageCpu(Long averageCpu) {
        this.averageCpu = averageCpu;
        return this;
    }
    public Long getAverageCpu() {
        return this.averageCpu;
    }

    public AppPortraitContainerUsageList setAverageMem(Long averageMem) {
        this.averageMem = averageMem;
        return this;
    }
    public Long getAverageMem() {
        return this.averageMem;
    }

}
