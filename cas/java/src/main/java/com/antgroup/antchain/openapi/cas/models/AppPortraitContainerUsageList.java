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
    public String requestCpu;

    // request_mem
    @NameInMap("request_mem")
    @Validation(required = true)
    public String requestMem;

    // limit_cpu
    @NameInMap("limit_cpu")
    @Validation(required = true)
    public String limitCpu;

    // limit_mem
    @NameInMap("limit_mem")
    @Validation(required = true)
    public String limitMem;

    // average_cpu
    @NameInMap("average_cpu")
    @Validation(required = true)
    public String averageCpu;

    // average_mem
    @NameInMap("average_mem")
    @Validation(required = true)
    public String averageMem;

    // 建议1：xxxxx
    @NameInMap("tips")
    @Validation(required = true)
    public String tips;

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

    public AppPortraitContainerUsageList setRequestCpu(String requestCpu) {
        this.requestCpu = requestCpu;
        return this;
    }
    public String getRequestCpu() {
        return this.requestCpu;
    }

    public AppPortraitContainerUsageList setRequestMem(String requestMem) {
        this.requestMem = requestMem;
        return this;
    }
    public String getRequestMem() {
        return this.requestMem;
    }

    public AppPortraitContainerUsageList setLimitCpu(String limitCpu) {
        this.limitCpu = limitCpu;
        return this;
    }
    public String getLimitCpu() {
        return this.limitCpu;
    }

    public AppPortraitContainerUsageList setLimitMem(String limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public String getLimitMem() {
        return this.limitMem;
    }

    public AppPortraitContainerUsageList setAverageCpu(String averageCpu) {
        this.averageCpu = averageCpu;
        return this;
    }
    public String getAverageCpu() {
        return this.averageCpu;
    }

    public AppPortraitContainerUsageList setAverageMem(String averageMem) {
        this.averageMem = averageMem;
        return this;
    }
    public String getAverageMem() {
        return this.averageMem;
    }

    public AppPortraitContainerUsageList setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

}
