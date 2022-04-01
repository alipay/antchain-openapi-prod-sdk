// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 客户价值法信息
    public class CustomerValueInfo : TeaModel {
        // 客户价价值法信息
        [NameInMap("customer_value_details")]
        [Validation(Required=false)]
        public List<CustomerValueDetail> CustomerValueDetails { get; set; }

    }

}
