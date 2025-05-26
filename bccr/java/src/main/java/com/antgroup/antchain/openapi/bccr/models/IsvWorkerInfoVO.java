// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class IsvWorkerInfoVO extends TeaModel {
    // 工作人员账号id
    @NameInMap("worker_account_id")
    @Validation(required = true)
    public String workerAccountId;

    // 工作人员姓名
    @NameInMap("worker_name")
    @Validation(required = true)
    public String workerName;

    public static IsvWorkerInfoVO build(java.util.Map<String, ?> map) throws Exception {
        IsvWorkerInfoVO self = new IsvWorkerInfoVO();
        return TeaModel.build(map, self);
    }

    public IsvWorkerInfoVO setWorkerAccountId(String workerAccountId) {
        this.workerAccountId = workerAccountId;
        return this;
    }
    public String getWorkerAccountId() {
        return this.workerAccountId;
    }

    public IsvWorkerInfoVO setWorkerName(String workerName) {
        this.workerName = workerName;
        return this;
    }
    public String getWorkerName() {
        return this.workerName;
    }

}
