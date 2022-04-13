// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodAffinityTerm extends TeaModel {
    // labelSelctor
    @NameInMap("label_selector")
    @Validation(required = true)
    public LabelSelector labelSelector;

    // namespaces
    @NameInMap("namespaces")
    @Validation(required = true)
    public java.util.List<String> namespaces;

    public static PodAffinityTerm build(java.util.Map<String, ?> map) throws Exception {
        PodAffinityTerm self = new PodAffinityTerm();
        return TeaModel.build(map, self);
    }

    public PodAffinityTerm setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public LabelSelector getLabelSelector() {
        return this.labelSelector;
    }

    public PodAffinityTerm setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

}
