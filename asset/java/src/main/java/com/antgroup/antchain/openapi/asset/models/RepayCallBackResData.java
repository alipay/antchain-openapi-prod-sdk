// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class RepayCallBackResData extends TeaModel {
    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static RepayCallBackResData build(java.util.Map<String, ?> map) throws Exception {
        RepayCallBackResData self = new RepayCallBackResData();
        return TeaModel.build(map, self);
    }

    public RepayCallBackResData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
