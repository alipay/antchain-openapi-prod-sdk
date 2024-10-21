// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UnfreezeDigitalkeyPreauthpayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户对本次解冻操作的附言描述
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // 商户的授权资金订单号
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 解冻请求流水号。
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

    }

}
