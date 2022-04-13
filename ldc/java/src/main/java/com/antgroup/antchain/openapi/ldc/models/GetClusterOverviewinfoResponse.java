// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetClusterOverviewinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // cpu
    @NameInMap("limited_cpu")
    public Long limitedCpu;

    // cpu unit
    @NameInMap("limited_cpu_unit")
    public String limitedCpuUnit;

    // memory
    @NameInMap("limited_memory")
    public Long limitedMemory;

    // memory unit
    @NameInMap("limited_memory_unit")
    public String limitedMemoryUnit;

    // pod overview info
    @NameInMap("pod_overview_info")
    public PodOverviewInfo podOverviewInfo;

    // total node number
    @NameInMap("total_node_num")
    public String totalNodeNum;

    // unhealthy node num
    @NameInMap("un_healthy_node_num")
    public String unHealthyNodeNum;

    // used cpu
    @NameInMap("used_cpu")
    public Long usedCpu;

    // used cpu unit
    @NameInMap("used_cpu_unit")
    public String usedCpuUnit;

    // used memory
    @NameInMap("used_memory")
    public Long usedMemory;

    // used memory unit
    @NameInMap("used_memory_unit")
    public String usedMemoryUnit;

    public static GetClusterOverviewinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOverviewinfoResponse self = new GetClusterOverviewinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterOverviewinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetClusterOverviewinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClusterOverviewinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetClusterOverviewinfoResponse setLimitedCpu(Long limitedCpu) {
        this.limitedCpu = limitedCpu;
        return this;
    }
    public Long getLimitedCpu() {
        return this.limitedCpu;
    }

    public GetClusterOverviewinfoResponse setLimitedCpuUnit(String limitedCpuUnit) {
        this.limitedCpuUnit = limitedCpuUnit;
        return this;
    }
    public String getLimitedCpuUnit() {
        return this.limitedCpuUnit;
    }

    public GetClusterOverviewinfoResponse setLimitedMemory(Long limitedMemory) {
        this.limitedMemory = limitedMemory;
        return this;
    }
    public Long getLimitedMemory() {
        return this.limitedMemory;
    }

    public GetClusterOverviewinfoResponse setLimitedMemoryUnit(String limitedMemoryUnit) {
        this.limitedMemoryUnit = limitedMemoryUnit;
        return this;
    }
    public String getLimitedMemoryUnit() {
        return this.limitedMemoryUnit;
    }

    public GetClusterOverviewinfoResponse setPodOverviewInfo(PodOverviewInfo podOverviewInfo) {
        this.podOverviewInfo = podOverviewInfo;
        return this;
    }
    public PodOverviewInfo getPodOverviewInfo() {
        return this.podOverviewInfo;
    }

    public GetClusterOverviewinfoResponse setTotalNodeNum(String totalNodeNum) {
        this.totalNodeNum = totalNodeNum;
        return this;
    }
    public String getTotalNodeNum() {
        return this.totalNodeNum;
    }

    public GetClusterOverviewinfoResponse setUnHealthyNodeNum(String unHealthyNodeNum) {
        this.unHealthyNodeNum = unHealthyNodeNum;
        return this;
    }
    public String getUnHealthyNodeNum() {
        return this.unHealthyNodeNum;
    }

    public GetClusterOverviewinfoResponse setUsedCpu(Long usedCpu) {
        this.usedCpu = usedCpu;
        return this;
    }
    public Long getUsedCpu() {
        return this.usedCpu;
    }

    public GetClusterOverviewinfoResponse setUsedCpuUnit(String usedCpuUnit) {
        this.usedCpuUnit = usedCpuUnit;
        return this;
    }
    public String getUsedCpuUnit() {
        return this.usedCpuUnit;
    }

    public GetClusterOverviewinfoResponse setUsedMemory(Long usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }
    public Long getUsedMemory() {
        return this.usedMemory;
    }

    public GetClusterOverviewinfoResponse setUsedMemoryUnit(String usedMemoryUnit) {
        this.usedMemoryUnit = usedMemoryUnit;
        return this;
    }
    public String getUsedMemoryUnit() {
        return this.usedMemoryUnit;
    }

}
