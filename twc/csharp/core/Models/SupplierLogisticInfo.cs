// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 共享项目，资产端的采购平台回传的物流信息
    public class SupplierLogisticInfo : TeaModel {
        // 采购平台的物流单号
        [NameInMap("logistic_order_id")]
        [Validation(Required=true)]
        public string LogisticOrderId { get; set; }

    }

}
