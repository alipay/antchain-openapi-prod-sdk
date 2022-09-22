// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FederatedServiceTopologyStatus extends TeaModel {
    // 部署单元
    @NameInMap("topology_name")
    @Validation(required = true)
    public String topologyName;

    // annotations
    @NameInMap("annotations")
    public java.util.List<Annotation> annotations;

    // 状态：succeed、updating、fail
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 错误信息
    @NameInMap("message")
    public String message;

    public static FederatedServiceTopologyStatus build(java.util.Map<String, ?> map) throws Exception {
        FederatedServiceTopologyStatus self = new FederatedServiceTopologyStatus();
        return TeaModel.build(map, self);
    }

    public FederatedServiceTopologyStatus setTopologyName(String topologyName) {
        this.topologyName = topologyName;
        return this;
    }
    public String getTopologyName() {
        return this.topologyName;
    }

    public FederatedServiceTopologyStatus setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public FederatedServiceTopologyStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FederatedServiceTopologyStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
