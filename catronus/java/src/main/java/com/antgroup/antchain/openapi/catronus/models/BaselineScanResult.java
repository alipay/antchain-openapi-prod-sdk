// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class BaselineScanResult extends TeaModel {
    // 类型
    @NameInMap("kind")
    @Validation(required = true)
    public String kind;

    // 资源名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 紧急control
    @NameInMap("criticals")
    public java.util.List<Control> criticals;

    // 高危control
    @NameInMap("highs")
    public java.util.List<Control> highs;

    // 中危controls
    @NameInMap("mids")
    public java.util.List<Control> mids;

    // 低危controls
    @NameInMap("lows")
    public java.util.List<Control> lows;

    // 资源内容
    @NameInMap("object")
    public String object;

    public static BaselineScanResult build(java.util.Map<String, ?> map) throws Exception {
        BaselineScanResult self = new BaselineScanResult();
        return TeaModel.build(map, self);
    }

    public BaselineScanResult setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public BaselineScanResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BaselineScanResult setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BaselineScanResult setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public BaselineScanResult setCriticals(java.util.List<Control> criticals) {
        this.criticals = criticals;
        return this;
    }
    public java.util.List<Control> getCriticals() {
        return this.criticals;
    }

    public BaselineScanResult setHighs(java.util.List<Control> highs) {
        this.highs = highs;
        return this;
    }
    public java.util.List<Control> getHighs() {
        return this.highs;
    }

    public BaselineScanResult setMids(java.util.List<Control> mids) {
        this.mids = mids;
        return this;
    }
    public java.util.List<Control> getMids() {
        return this.mids;
    }

    public BaselineScanResult setLows(java.util.List<Control> lows) {
        this.lows = lows;
        return this;
    }
    public java.util.List<Control> getLows() {
        return this.lows;
    }

    public BaselineScanResult setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

}
