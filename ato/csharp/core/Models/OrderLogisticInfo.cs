// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单物流信息
    public class OrderLogisticInfo : TeaModel {
        // 物流单号
        [NameInMap("logistic_order_id")]
        [Validation(Required=false)]
        public string LogisticOrderId { get; set; }

        // 物流状态
        [NameInMap("logistic_status")]
        [Validation(Required=false)]
        public string LogisticStatus { get; set; }

    }

}
