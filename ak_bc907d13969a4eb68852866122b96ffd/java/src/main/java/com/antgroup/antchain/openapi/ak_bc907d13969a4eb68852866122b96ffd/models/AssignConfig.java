// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class AssignConfig extends TeaModel {
    // AVG_SIZE
    @NameInMap("assigntype")
    @Validation(required = true)
    public String assigntype;

    // AssignSubTaskCount
    @NameInMap("assignsubtaskcount")
    public Long assignsubtaskcount;

    public static AssignConfig build(java.util.Map<String, ?> map) throws Exception {
        AssignConfig self = new AssignConfig();
        return TeaModel.build(map, self);
    }

    public AssignConfig setAssigntype(String assigntype) {
        this.assigntype = assigntype;
        return this;
    }
    public String getAssigntype() {
        return this.assigntype;
    }

    public AssignConfig setAssignsubtaskcount(Long assignsubtaskcount) {
        this.assignsubtaskcount = assignsubtaskcount;
        return this;
    }
    public Long getAssignsubtaskcount() {
        return this.assignsubtaskcount;
    }

}
