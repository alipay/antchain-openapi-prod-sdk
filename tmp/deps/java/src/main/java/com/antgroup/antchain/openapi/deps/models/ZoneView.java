// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ZoneView extends TeaModel {
    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // table id
    @NameInMap("id")
    public String id;

    // 标识
    @NameInMap("identity")
    public String identity;

    // 状态
    @NameInMap("state")
    public String state;

    public static ZoneView build(java.util.Map<String, ?> map) throws Exception {
        ZoneView self = new ZoneView();
        return TeaModel.build(map, self);
    }

    public ZoneView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ZoneView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ZoneView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public ZoneView setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
