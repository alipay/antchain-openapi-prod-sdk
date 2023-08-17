// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class Groups extends TeaModel {
    // groupid
    @NameInMap("groupid")
    public String groupid;

    // groupname
    @NameInMap("groupname")
    public String groupname;

    public static Groups build(java.util.Map<String, ?> map) throws Exception {
        Groups self = new Groups();
        return TeaModel.build(map, self);
    }

    public Groups setGroupid(String groupid) {
        this.groupid = groupid;
        return this;
    }
    public String getGroupid() {
        return this.groupid;
    }

    public Groups setGroupname(String groupname) {
        this.groupname = groupname;
        return this;
    }
    public String getGroupname() {
        return this.groupname;
    }

}
