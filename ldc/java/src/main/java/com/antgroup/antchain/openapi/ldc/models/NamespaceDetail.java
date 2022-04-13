// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NamespaceDetail extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // labels
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // status
    @NameInMap("status")
    public String status;

    // created time
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    public static NamespaceDetail build(java.util.Map<String, ?> map) throws Exception {
        NamespaceDetail self = new NamespaceDetail();
        return TeaModel.build(map, self);
    }

    public NamespaceDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NamespaceDetail setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public NamespaceDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NamespaceDetail setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

}
