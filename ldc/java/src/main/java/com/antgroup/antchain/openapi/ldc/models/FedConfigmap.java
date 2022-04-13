// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedConfigmap extends TeaModel {
    // fed configmap annotations
    @NameInMap("annotations")
    @Validation(required = true)
    public java.util.List<Annotation> annotations;

    // Fed资源集群Cell状态
    @NameInMap("cell_status")
    public java.util.List<ClusteCellStatus> cellStatus;

    // fed clusters
    @NameInMap("clusters")
    @Validation(required = true)
    public java.util.List<String> clusters;

    // 创建时间
    @NameInMap("create_time_stamp")
    @Validation(required = true)
    public String createTimeStamp;

    // fed configmap data
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<ConfigMapData> data;

    // fed configmap labels
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<Label> labels;

    // fed configmap name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // fed configmap namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // fed configmap override
    @NameInMap("overrides")
    @Validation(required = true)
    public java.util.List<FedConfigmapOverride> overrides;

    // 原因
    @NameInMap("reason")
    public String reason;

    // propagation状态
    @NameInMap("status")
    public String status;

    public static FedConfigmap build(java.util.Map<String, ?> map) throws Exception {
        FedConfigmap self = new FedConfigmap();
        return TeaModel.build(map, self);
    }

    public FedConfigmap setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public FedConfigmap setCellStatus(java.util.List<ClusteCellStatus> cellStatus) {
        this.cellStatus = cellStatus;
        return this;
    }
    public java.util.List<ClusteCellStatus> getCellStatus() {
        return this.cellStatus;
    }

    public FedConfigmap setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public FedConfigmap setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public String getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public FedConfigmap setData(java.util.List<ConfigMapData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ConfigMapData> getData() {
        return this.data;
    }

    public FedConfigmap setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public FedConfigmap setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedConfigmap setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FedConfigmap setOverrides(java.util.List<FedConfigmapOverride> overrides) {
        this.overrides = overrides;
        return this;
    }
    public java.util.List<FedConfigmapOverride> getOverrides() {
        return this.overrides;
    }

    public FedConfigmap setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public FedConfigmap setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
