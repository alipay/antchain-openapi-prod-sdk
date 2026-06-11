// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 退款账户明细信息
    public class RefundDetail : TeaModel {
        // 支出方账户ID，如果是支付宝：以2088开头的纯16位数字
        [NameInMap("trans_out_account")]
        [Validation(Required=false)]
        public string TransOutAccount { get; set; }

        // 分账的金额，单位为分
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

    }

}
