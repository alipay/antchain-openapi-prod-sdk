// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XDashboardQuery extends TeaModel {
    //  
    @NameInMap("uuid")
    public String uuid;

    //  
    @NameInMap("parent_uuid")
    public String parentUuid;

    //  
    @NameInMap("name")
    public String name;

    public static XDashboardQuery build(java.util.Map<String, ?> map) throws Exception {
        XDashboardQuery self = new XDashboardQuery();
        return TeaModel.build(map, self);
    }

    public XDashboardQuery setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public XDashboardQuery setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }
    public String getParentUuid() {
        return this.parentUuid;
    }

    public XDashboardQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
