// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 两轮车一体机销售信息
    public class SimSalesInfo : TeaModel {
        // 销售对外业务id
        [NameInMap("sales_id")]
        [Validation(Required=true)]
        public string SalesId { get; set; }

        // 销售角色 法人:TWEV_STORE_MANAGER/销售:TWEV_SALES
        [NameInMap("sales_type")]
        [Validation(Required=true)]
        public string SalesType { get; set; }

    }

}
