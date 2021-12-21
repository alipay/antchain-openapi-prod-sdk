// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 申请授权合作的备注信息
    public class IPOrderApplyInfo : TeaModel {
        // 授权合作商品
        [NameInMap("auth_goods")]
        [Validation(Required=true)]
        public string AuthGoods { get; set; }

        // 销售规模数量
        [NameInMap("sales_amount")]
        [Validation(Required=true)]
        public long? SalesAmount { get; set; }

        // 销售规模金额
        [NameInMap("sales_number")]
        [Validation(Required=true)]
        public string SalesNumber { get; set; }

    }

}
