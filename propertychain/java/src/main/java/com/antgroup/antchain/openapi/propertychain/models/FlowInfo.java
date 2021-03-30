// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class FlowInfo extends TeaModel {
    // 备注
    @NameInMap("comment")
    public String comment;

    // 操作时间
    @NameInMap("operate_time")
    public String operateTime;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 操作状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
    @NameInMap("status")
    public String status;

    public static FlowInfo build(java.util.Map<String, ?> map) throws Exception {
        FlowInfo self = new FlowInfo();
        return TeaModel.build(map, self);
    }

    public FlowInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FlowInfo setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public FlowInfo setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public FlowInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
