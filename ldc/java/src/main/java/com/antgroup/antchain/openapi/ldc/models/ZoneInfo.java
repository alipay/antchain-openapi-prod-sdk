// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ZoneInfo extends TeaModel {
    // zone identity
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // zone name
    @NameInMap("name")
    public String name;

    // 所属region信息。
    @NameInMap("region")
    public String region;

    // zone display name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static ZoneInfo build(java.util.Map<String, ?> map) throws Exception {
        ZoneInfo self = new ZoneInfo();
        return TeaModel.build(map, self);
    }

    public ZoneInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ZoneInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ZoneInfo setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ZoneInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
