// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BizStatusInfoOp extends TeaModel {
    // 业务状态类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务状态
    @NameInMap("biz_status")
    @Validation(required = true)
    public String bizStatus;

    // 时间
    @NameInMap("op_time")
    @Validation(required = true)
    public String opTime;

    public static BizStatusInfoOp build(java.util.Map<String, ?> map) throws Exception {
        BizStatusInfoOp self = new BizStatusInfoOp();
        return TeaModel.build(map, self);
    }

    public BizStatusInfoOp setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public BizStatusInfoOp setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public BizStatusInfoOp setOpTime(String opTime) {
        this.opTime = opTime;
        return this;
    }
    public String getOpTime() {
        return this.opTime;
    }

}
