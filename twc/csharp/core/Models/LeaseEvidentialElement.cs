// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 自动进件证据要素
    public class LeaseEvidentialElement : TeaModel {
        // 订单信息
        [NameInMap("lease_order_info")]
        [Validation(Required=true)]
        public LeaseOrderInfo LeaseOrderInfo { get; set; }

        // 承诺信息
        [NameInMap("commitment_info")]
        [Validation(Required=true)]
        public CommitmentInfo CommitmentInfo { get; set; }

        // 物流信息
        [NameInMap("logistics_info")]
        [Validation(Required=true)]
        public LogisticsInfo LogisticsInfo { get; set; }

        // 履约信息
        [NameInMap("performance_info")]
        [Validation(Required=true)]
        public LeasePerformanceInfo PerformanceInfo { get; set; }

    }

}
