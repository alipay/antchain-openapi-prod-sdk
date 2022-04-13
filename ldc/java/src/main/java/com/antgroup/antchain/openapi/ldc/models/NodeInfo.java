// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeInfo extends TeaModel {
    // cell name
    @NameInMap("cell_name")
    public String cellName;

    // node ip
    @NameInMap("ip")
    public String ip;

    // true
    @NameInMap("is_schedulable")
    public Boolean isSchedulable;

    // number of capacity cpu core
    @NameInMap("limited_cpu")
    public Long limitedCpu;

    // quantity of capacity memory
    @NameInMap("limited_memory")
    public Long limitedMemory;

    // node name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // pod number of one node
    @NameInMap("pod_number")
    public String podNumber;

    // node state
    @NameInMap("state")
    public String state;

    // quantity of used cpu core
    @NameInMap("used_cpu")
    public Long usedCpu;

    // quantity of used memory
    @NameInMap("used_memory")
    public Long usedMemory;

    // zone name
    @NameInMap("zone_name")
    public String zoneName;

    // node labels
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // node annotations
    @NameInMap("annotations")
    public java.util.List<Annotation> annotations;

    // node created time
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // node system infos
    @NameInMap("system_infos")
    public java.util.List<Annotation> systemInfos;

    // max pod amount of node
    @NameInMap("max_pod_amount")
    public Long maxPodAmount;

    // running pod amount of node
    @NameInMap("running_pod_amount")
    public Long runningPodAmount;

    public static NodeInfo build(java.util.Map<String, ?> map) throws Exception {
        NodeInfo self = new NodeInfo();
        return TeaModel.build(map, self);
    }

    public NodeInfo setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public NodeInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public NodeInfo setIsSchedulable(Boolean isSchedulable) {
        this.isSchedulable = isSchedulable;
        return this;
    }
    public Boolean getIsSchedulable() {
        return this.isSchedulable;
    }

    public NodeInfo setLimitedCpu(Long limitedCpu) {
        this.limitedCpu = limitedCpu;
        return this;
    }
    public Long getLimitedCpu() {
        return this.limitedCpu;
    }

    public NodeInfo setLimitedMemory(Long limitedMemory) {
        this.limitedMemory = limitedMemory;
        return this;
    }
    public Long getLimitedMemory() {
        return this.limitedMemory;
    }

    public NodeInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NodeInfo setPodNumber(String podNumber) {
        this.podNumber = podNumber;
        return this;
    }
    public String getPodNumber() {
        return this.podNumber;
    }

    public NodeInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public NodeInfo setUsedCpu(Long usedCpu) {
        this.usedCpu = usedCpu;
        return this;
    }
    public Long getUsedCpu() {
        return this.usedCpu;
    }

    public NodeInfo setUsedMemory(Long usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }
    public Long getUsedMemory() {
        return this.usedMemory;
    }

    public NodeInfo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public NodeInfo setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public NodeInfo setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public NodeInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public NodeInfo setSystemInfos(java.util.List<Annotation> systemInfos) {
        this.systemInfos = systemInfos;
        return this;
    }
    public java.util.List<Annotation> getSystemInfos() {
        return this.systemInfos;
    }

    public NodeInfo setMaxPodAmount(Long maxPodAmount) {
        this.maxPodAmount = maxPodAmount;
        return this;
    }
    public Long getMaxPodAmount() {
        return this.maxPodAmount;
    }

    public NodeInfo setRunningPodAmount(Long runningPodAmount) {
        this.runningPodAmount = runningPodAmount;
        return this;
    }
    public Long getRunningPodAmount() {
        return this.runningPodAmount;
    }

}
