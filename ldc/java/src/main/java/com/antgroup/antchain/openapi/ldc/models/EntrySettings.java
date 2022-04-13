// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EntrySettings extends TeaModel {
    // 是否自定义uai entry
    @NameInMap("customized")
    public Boolean customized;

    // 统一接入实例每个datacenter的用户自定义入口负载均衡实例id列表
    @NameInMap("entry_ids")
    public java.util.List<MapStringToString> entryIds;

    // 统一接入实例每个datacenter用户自定义入口负载均衡实例的vip
    @NameInMap("entry_vips")
    public java.util.List<MapStringToString> entryVips;

    public static EntrySettings build(java.util.Map<String, ?> map) throws Exception {
        EntrySettings self = new EntrySettings();
        return TeaModel.build(map, self);
    }

    public EntrySettings setCustomized(Boolean customized) {
        this.customized = customized;
        return this;
    }
    public Boolean getCustomized() {
        return this.customized;
    }

    public EntrySettings setEntryIds(java.util.List<MapStringToString> entryIds) {
        this.entryIds = entryIds;
        return this;
    }
    public java.util.List<MapStringToString> getEntryIds() {
        return this.entryIds;
    }

    public EntrySettings setEntryVips(java.util.List<MapStringToString> entryVips) {
        this.entryVips = entryVips;
        return this;
    }
    public java.util.List<MapStringToString> getEntryVips() {
        return this.entryVips;
    }

}
