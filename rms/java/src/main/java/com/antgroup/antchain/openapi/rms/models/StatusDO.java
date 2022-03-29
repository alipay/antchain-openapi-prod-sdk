// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StatusDO extends TeaModel {
    // creater
    @NameInMap("creater")
    @Validation(required = true)
    public String creater;

    // create_time
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // update_time
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    // status_desc
    @NameInMap("status_desc")
    @Validation(required = true)
    public String statusDesc;

    // compute_close
    @NameInMap("compute_close")
    @Validation(required = true)
    public Boolean computeClose;

    // degrade_reason
    @NameInMap("degrade_reason")
    @Validation(required = true)
    public String degradeReason;

    // degrade_operator
    @NameInMap("degrade_operator")
    @Validation(required = true)
    public String degradeOperator;

    // degrade_time
    @NameInMap("degrade_time")
    @Validation(required = true)
    public String degradeTime;

    // degrade_time_v2
    @NameInMap("degrade_time_v2")
    @Validation(required = true)
    public Long degradeTimeV2;

    public static StatusDO build(java.util.Map<String, ?> map) throws Exception {
        StatusDO self = new StatusDO();
        return TeaModel.build(map, self);
    }

    public StatusDO setCreater(String creater) {
        this.creater = creater;
        return this;
    }
    public String getCreater() {
        return this.creater;
    }

    public StatusDO setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public StatusDO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public StatusDO setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public StatusDO setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public StatusDO setComputeClose(Boolean computeClose) {
        this.computeClose = computeClose;
        return this;
    }
    public Boolean getComputeClose() {
        return this.computeClose;
    }

    public StatusDO setDegradeReason(String degradeReason) {
        this.degradeReason = degradeReason;
        return this;
    }
    public String getDegradeReason() {
        return this.degradeReason;
    }

    public StatusDO setDegradeOperator(String degradeOperator) {
        this.degradeOperator = degradeOperator;
        return this;
    }
    public String getDegradeOperator() {
        return this.degradeOperator;
    }

    public StatusDO setDegradeTime(String degradeTime) {
        this.degradeTime = degradeTime;
        return this;
    }
    public String getDegradeTime() {
        return this.degradeTime;
    }

    public StatusDO setDegradeTimeV2(Long degradeTimeV2) {
        this.degradeTimeV2 = degradeTimeV2;
        return this;
    }
    public Long getDegradeTimeV2() {
        return this.degradeTimeV2;
    }

}
