// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class Institution extends TeaModel {
    // 机构id
    @NameInMap("inst_id")
    @Validation(required = true)
    public String instId;

    // 机构名称
    @NameInMap("inst_name")
    @Validation(required = true)
    public String instName;

    // 机构code
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    public static Institution build(java.util.Map<String, ?> map) throws Exception {
        Institution self = new Institution();
        return TeaModel.build(map, self);
    }

    public Institution setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

    public Institution setInstName(String instName) {
        this.instName = instName;
        return this;
    }
    public String getInstName() {
        return this.instName;
    }

    public Institution setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

}
