// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsGroup extends TeaModel {
    // 运维操作组当前状态。取值列表： INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； CANCELED：已取消； CONFIRM_WAITING：待确认
    @NameInMap("status")
    public String status;

    // 包含在此运维操作组中的运维单元列表
    @NameInMap("units")
    public java.util.List<OpsUnit> units;

    // 运维任务进度列表
    @NameInMap("progresses")
    public java.util.List<OpsGroupTaskProgress> progresses;

    public static OpsGroup build(java.util.Map<String, ?> map) throws Exception {
        OpsGroup self = new OpsGroup();
        return TeaModel.build(map, self);
    }

    public OpsGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpsGroup setUnits(java.util.List<OpsUnit> units) {
        this.units = units;
        return this;
    }
    public java.util.List<OpsUnit> getUnits() {
        return this.units;
    }

    public OpsGroup setProgresses(java.util.List<OpsGroupTaskProgress> progresses) {
        this.progresses = progresses;
        return this;
    }
    public java.util.List<OpsGroupTaskProgress> getProgresses() {
        return this.progresses;
    }

}
