// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SidecarInjectConfigModel extends TeaModel {
    // sidecar类型 支持inject_all，clusters，namespaces，labels，annotations
    @NameInMap("type")
    public String type;

    // 字符串数组
    @NameInMap("strs")
    public java.util.List<String> strs;

    // kv键值对数组
    @NameInMap("kvs")
    public java.util.List<KV> kvs;

    public static SidecarInjectConfigModel build(java.util.Map<String, ?> map) throws Exception {
        SidecarInjectConfigModel self = new SidecarInjectConfigModel();
        return TeaModel.build(map, self);
    }

    public SidecarInjectConfigModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SidecarInjectConfigModel setStrs(java.util.List<String> strs) {
        this.strs = strs;
        return this;
    }
    public java.util.List<String> getStrs() {
        return this.strs;
    }

    public SidecarInjectConfigModel setKvs(java.util.List<KV> kvs) {
        this.kvs = kvs;
        return this;
    }
    public java.util.List<KV> getKvs() {
        return this.kvs;
    }

}
