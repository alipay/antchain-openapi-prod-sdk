// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LocalSubClusterDetail extends TeaModel {
    // 可用实例数
    @NameInMap("available")
    public Long available;

    // 期望实例数
    @NameInMap("desired")
    public Long desired;

    // 容器镜像地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 发布容器带的标签
    @NameInMap("labels")
    public java.util.List<Label> labels;

    // 可能存在的错误信息
    @NameInMap("message")
    public String message;

    // 健康实例数
    @NameInMap("ready")
    public Long ready;

    // 实际sub cluster 状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 已更新实例数
    @NameInMap("updated")
    public Long updated;

    // 容器版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 多个机房下的覆盖配置项
    @NameInMap("overrides")
    public java.util.List<SpannerSubClusterOverrides> overrides;

    public static LocalSubClusterDetail build(java.util.Map<String, ?> map) throws Exception {
        LocalSubClusterDetail self = new LocalSubClusterDetail();
        return TeaModel.build(map, self);
    }

    public LocalSubClusterDetail setAvailable(Long available) {
        this.available = available;
        return this;
    }
    public Long getAvailable() {
        return this.available;
    }

    public LocalSubClusterDetail setDesired(Long desired) {
        this.desired = desired;
        return this;
    }
    public Long getDesired() {
        return this.desired;
    }

    public LocalSubClusterDetail setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public LocalSubClusterDetail setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public LocalSubClusterDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LocalSubClusterDetail setReady(Long ready) {
        this.ready = ready;
        return this;
    }
    public Long getReady() {
        return this.ready;
    }

    public LocalSubClusterDetail setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public LocalSubClusterDetail setUpdated(Long updated) {
        this.updated = updated;
        return this;
    }
    public Long getUpdated() {
        return this.updated;
    }

    public LocalSubClusterDetail setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public LocalSubClusterDetail setOverrides(java.util.List<SpannerSubClusterOverrides> overrides) {
        this.overrides = overrides;
        return this;
    }
    public java.util.List<SpannerSubClusterOverrides> getOverrides() {
        return this.overrides;
    }

}
