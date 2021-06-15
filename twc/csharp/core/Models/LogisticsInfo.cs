// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 物流信息
    public class LogisticsInfo : TeaModel {
        // 发货时间
        [NameInMap("delivery_time")]
        [Validation(Required=true)]
        public string DeliveryTime { get; set; }

        // 快递物流公司
        [NameInMap("express_logistics_company")]
        [Validation(Required=true)]
        public string ExpressLogisticsCompany { get; set; }

        // 快递单号
        [NameInMap("courier_number")]
        [Validation(Required=true)]
        public string CourierNumber { get; set; }

        // 签收时间
        [NameInMap("sign_time")]
        [Validation(Required=true)]
        public string SignTime { get; set; }

    }

}
