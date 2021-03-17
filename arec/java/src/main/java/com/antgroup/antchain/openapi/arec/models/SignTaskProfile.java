// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class SignTaskProfile extends TeaModel {
    // 签署任务列表
    @NameInMap("sign_task_list")
    @Validation(required = true)
    public java.util.List<SignTask> signTaskList;

    public static SignTaskProfile build(java.util.Map<String, ?> map) throws Exception {
        SignTaskProfile self = new SignTaskProfile();
        return TeaModel.build(map, self);
    }

    public SignTaskProfile setSignTaskList(java.util.List<SignTask> signTaskList) {
        this.signTaskList = signTaskList;
        return this;
    }
    public java.util.List<SignTask> getSignTaskList() {
        return this.signTaskList;
    }

}
