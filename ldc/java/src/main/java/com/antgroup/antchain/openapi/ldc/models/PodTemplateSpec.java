// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodTemplateSpec extends TeaModel {
    // k8s Standard object_s metadata. 
    @NameInMap("metadata")
    @Validation(required = true)
    public ObjectMeta metadata;

    // Specification of the desired behavior of the pod.
    @NameInMap("spec")
    @Validation(required = true)
    public PodSpec spec;

    public static PodTemplateSpec build(java.util.Map<String, ?> map) throws Exception {
        PodTemplateSpec self = new PodTemplateSpec();
        return TeaModel.build(map, self);
    }

    public PodTemplateSpec setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public PodTemplateSpec setSpec(PodSpec spec) {
        this.spec = spec;
        return this;
    }
    public PodSpec getSpec() {
        return this.spec;
    }

}
