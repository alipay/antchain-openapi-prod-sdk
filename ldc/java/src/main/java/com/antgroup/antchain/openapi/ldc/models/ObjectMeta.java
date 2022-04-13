// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ObjectMeta extends TeaModel {
    // k8s meta annotation
    @NameInMap("annotations")
    public java.util.List<Annotation> annotations;

    // 创建时间戳
    @NameInMap("creation_timestamp")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTimestamp;

    // k8s meta labels
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<Label> labels;

    // 名称
    @NameInMap("name")
    public String name;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    public static ObjectMeta build(java.util.Map<String, ?> map) throws Exception {
        ObjectMeta self = new ObjectMeta();
        return TeaModel.build(map, self);
    }

    public ObjectMeta setAnnotations(java.util.List<Annotation> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public ObjectMeta setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public ObjectMeta setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public ObjectMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ObjectMeta setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
