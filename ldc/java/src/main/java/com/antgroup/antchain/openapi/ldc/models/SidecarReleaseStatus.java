// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarReleaseStatus extends TeaModel {
    // 运维单号
    @NameInMap("order_num")
    @Validation(required = true)
    public String orderNum;

    // 部署单元
    @NameInMap("cell_name")
    @Validation(required = true)
    public String cellName;

    // 所处状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static SidecarReleaseStatus build(java.util.Map<String, ?> map) throws Exception {
        SidecarReleaseStatus self = new SidecarReleaseStatus();
        return TeaModel.build(map, self);
    }

    public SidecarReleaseStatus setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

    public SidecarReleaseStatus setCellName(String cellName) {
        this.cellName = cellName;
        return this;
    }
    public String getCellName() {
        return this.cellName;
    }

    public SidecarReleaseStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
