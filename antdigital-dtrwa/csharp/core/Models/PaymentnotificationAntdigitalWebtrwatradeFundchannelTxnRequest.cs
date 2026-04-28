// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTRWA.Models
{
    public class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
        [NameInMap("e2e_id")]
        [Validation(Required=true)]
        public string E2eId { get; set; }

        // 支付状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
