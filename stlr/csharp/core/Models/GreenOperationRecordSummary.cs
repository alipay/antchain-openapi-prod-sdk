// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 绿色行为数据摘要
    public class GreenOperationRecordSummary : TeaModel {
        // 绿色行为记录编码
        [NameInMap("green_operation_no")]
        [Validation(Required=true)]
        public string GreenOperationNo { get; set; }

        // 绿色行为类型
        [NameInMap("green_operation_type")]
        [Validation(Required=true)]
        public string GreenOperationType { get; set; }

        // 绿色行为类型名称
        [NameInMap("green_operation_type_name")]
        [Validation(Required=true)]
        public string GreenOperationTypeName { get; set; }

        // 发生绿色行为的相关业务单号
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=true)]
        public string EnterpriseBizNo { get; set; }

        // 绿色行为发生时间，格式应如：2021-07-21 12:11:11
        [NameInMap("occurrence_time")]
        [Validation(Required=true)]
        public string OccurrenceTime { get; set; }

        // 绿色行为的绿色能量值
        [NameInMap("green_energy_amount")]
        [Validation(Required=true)]
        public long? GreenEnergyAmount { get; set; }

    }

}
