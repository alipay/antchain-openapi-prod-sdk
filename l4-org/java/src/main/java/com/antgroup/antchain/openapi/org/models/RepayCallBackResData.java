// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class RepayCallBackResData extends TeaModel {
    // 状态
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    public static RepayCallBackResData build(java.util.Map<String, ?> map) throws Exception {
        RepayCallBackResData self = new RepayCallBackResData();
        return TeaModel.build(map, self);
    }

    public RepayCallBackResData setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
