// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 平台报案赔款支付信息
    public class ReparationsInfo : TeaModel {
        // 平台赔款支付流水号
        [NameInMap("payment_no")]
        [Validation(Required=false)]
        public string PaymentNo { get; set; }

        // 平台赔款支付金额
        [NameInMap("payment_amount")]
        [Validation(Required=false)]
        public string PaymentAmount { get; set; }

        // 平台是否放弃货物所有权。Y:是，N:否
        [NameInMap("relinquish_goods")]
        [Validation(Required=false)]
        public string RelinquishGoods { get; set; }

        // 退货本身是否高于货物本身价值。Y:是，N:否
        [NameInMap("return_over_value")]
        [Validation(Required=false)]
        public string ReturnOverValue { get; set; }

    }

}
