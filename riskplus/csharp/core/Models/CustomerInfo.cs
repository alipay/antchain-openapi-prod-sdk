// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 客群详细信息
    public class CustomerInfo : TeaModel {
        // 查询的用户凭证列表
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 客户属性的额外信息
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
