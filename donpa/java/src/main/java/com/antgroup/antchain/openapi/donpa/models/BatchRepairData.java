// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BatchRepairData extends TeaModel {
    // "RPBS001":待修复,"RPBS002": 修 复 中 "RPBS003": 已 修 复,"RPBS004":修复失败
    @NameInMap("repair_batch_status")
    @Validation(required = true)
    public String repairBatchStatus;

    // 修复时间
    @NameInMap("repair_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String repairTime;

    // 参见RepairData
    @NameInMap("repair_datas")
    @Validation(required = true)
    public java.util.List<RepairData> repairDatas;

    public static BatchRepairData build(java.util.Map<String, ?> map) throws Exception {
        BatchRepairData self = new BatchRepairData();
        return TeaModel.build(map, self);
    }

    public BatchRepairData setRepairBatchStatus(String repairBatchStatus) {
        this.repairBatchStatus = repairBatchStatus;
        return this;
    }
    public String getRepairBatchStatus() {
        return this.repairBatchStatus;
    }

    public BatchRepairData setRepairTime(String repairTime) {
        this.repairTime = repairTime;
        return this;
    }
    public String getRepairTime() {
        return this.repairTime;
    }

    public BatchRepairData setRepairDatas(java.util.List<RepairData> repairDatas) {
        this.repairDatas = repairDatas;
        return this;
    }
    public java.util.List<RepairData> getRepairDatas() {
        return this.repairDatas;
    }

}
