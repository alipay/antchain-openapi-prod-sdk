// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    // 修复批次状态
    public class BatchRepairData : TeaModel {
        // "RPBS001":待修复,"RPBS002": 修 复 中 "RPBS003": 已 修 复,"RPBS004":修复失败
        [NameInMap("repair_batch_status")]
        [Validation(Required=true)]
        public string RepairBatchStatus { get; set; }

        // 修复时间
        [NameInMap("repair_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RepairTime { get; set; }

        // 参见RepairData
        [NameInMap("repair_datas")]
        [Validation(Required=true)]
        public List<RepairData> RepairDatas { get; set; }

    }

}
