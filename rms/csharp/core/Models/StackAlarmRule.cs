// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 栈告警套餐配置
    public class StackAlarmRule : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 告警套餐配置
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        // 栈 ID
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public long? StackId { get; set; }

        // 指标 ID (如pv对应的ID)
        [NameInMap("stack_metric_id")]
        [Validation(Required=true)]
        public long? StackMetricId { get; set; }

        // 关联报警relation (如果未关联，默认为-1)
        [NameInMap("stack_relation_id")]
        [Validation(Required=true)]
        public long? StackRelationId { get; set; }

        // 实体对象复合 ID
        [NameInMap("stack_universal_table_id")]
        [Validation(Required=true)]
        public string StackUniversalTableId { get; set; }

    }

}
