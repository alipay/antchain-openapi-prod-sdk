// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    // 发放订单明细
    public class GrantOrderDetail : TeaModel {
        // 券编码
        [NameInMap("voucher_code")]
        [Validation(Required=true)]
        public string VoucherCode { get; set; }

    }

}
