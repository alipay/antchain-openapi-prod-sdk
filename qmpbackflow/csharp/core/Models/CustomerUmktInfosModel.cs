// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 混合批量营销圈客结果
    public class CustomerUmktInfosModel : TeaModel {
        // 归属用户的混合营销决策结果
        [NameInMap("umkt_results")]
        [Validation(Required=true)]
        public List<UmktInfoModel> UmktResults { get; set; }

        // 用户凭证
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

    }

}
