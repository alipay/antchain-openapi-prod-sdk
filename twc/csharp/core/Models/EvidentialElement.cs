// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 证据要素
    public class EvidentialElement : TeaModel {
        // 订单信息
        [NameInMap("order_info")]
        [Validation(Required=true)]
        public OrderInfo OrderInfo { get; set; }

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
        public PerformanceInfo PerformanceInfo { get; set; }

    }

}
