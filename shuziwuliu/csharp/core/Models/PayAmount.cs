// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 货主支付方式
    public class PayAmount : TeaModel {
        // 支付金额（2位小数）
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 支付方式
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

    }

}
