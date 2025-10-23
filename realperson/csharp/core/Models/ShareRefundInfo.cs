// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 分账退款信息
    public class ShareRefundInfo : TeaModel {
        // 商户id
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 分账金额,整数、单位为分
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

    }

}
