// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CustomStatus extends TeaModel {
    // 是否进行过授信申请
    @NameInMap("apply_flag")
    public Boolean applyFlag;

    // 0:通过； 1:拒绝； 2:处理中；
    @NameInMap("status")
    public String status;

    // 拒绝原因
    @NameInMap("msg")
    public String msg;

    public static CustomStatus build(java.util.Map<String, ?> map) throws Exception {
        CustomStatus self = new CustomStatus();
        return TeaModel.build(map, self);
    }

    public CustomStatus setApplyFlag(Boolean applyFlag) {
        this.applyFlag = applyFlag;
        return this;
    }
    public Boolean getApplyFlag() {
        return this.applyFlag;
    }

    public CustomStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CustomStatus setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
