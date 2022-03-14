// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾批量查询单条结果
    public class BaseCustomerUmktInfoModel : TeaModel {
        // 用户凭证
        [NameInMap("customer_key")]
        [Validation(Required=false)]
        public string CustomerKey { get; set; }

        // 输入模板
        [NameInMap("query_template")]
        [Validation(Required=false)]
        public string QueryTemplate { get; set; }

        // 实时营销结果
        [NameInMap("umkt_result")]
        [Validation(Required=false)]
        public long? UmktResult { get; set; }

    }

}
