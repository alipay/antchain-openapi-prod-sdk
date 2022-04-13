// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedSecret extends TeaModel {
    // fed secret annotations
    // 
    @NameInMap("annotations")
    public java.util.List<Annotation> annotations;

    // FedSecret Cell Cluster Status
    @NameInMap("cell_status")
    @Validation(required = true)
    public java.util.List<ClusteCellStatus> cellStatus;

    // fed clusters
    // 
    @NameInMap("clusters")
    @Validation(required = true)
    public java.util.List<String> clusters;

    // 创建时间
    @NameInMap("create_time_stamp")
    @Validation(required = true)
    public String createTimeStamp;

    // fed secret data
    // 
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<SecretData> data;

    // fed secret labels
    // 
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // fed secret name
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // fed secret namespace
    // 
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // fed secret override
    // 
    @NameInMap("overrides")
    @Validation(required = true)
    public java.util.List<FedSecretOverride> overrides;

    // 原因描述
    @NameInMap("reason")
    public String reason;

    // FedSecret同步状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // opaque
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static FedSecret build(java.util.Map<String, ?> map) throws Exception {
        FedSecret self = new FedSecret();
        return TeaModel.build(map, self);
    }

    public FedSecret setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public FedSecret setCellStatus(java.util.List<ClusteCellStatus> cellStatus) {
        this.cellStatus = cellStatus;
        return this;
    }
    public java.util.List<ClusteCellStatus> getCellStatus() {
        return this.cellStatus;
    }

    public FedSecret setClusters(java.util.List<String> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<String> getClusters() {
        return this.clusters;
    }

    public FedSecret setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public String getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public FedSecret setData(java.util.List<SecretData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SecretData> getData() {
        return this.data;
    }

    public FedSecret setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public FedSecret setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedSecret setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FedSecret setOverrides(java.util.List<FedSecretOverride> overrides) {
        this.overrides = overrides;
        return this;
    }
    public java.util.List<FedSecretOverride> getOverrides() {
        return this.overrides;
    }

    public FedSecret setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public FedSecret setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FedSecret setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
