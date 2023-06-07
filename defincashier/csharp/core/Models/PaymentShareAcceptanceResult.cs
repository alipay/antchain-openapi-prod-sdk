// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 交易分账受理结果
    public class PaymentShareAcceptanceResult : TeaModel {
        // 外部业务平台原始交易号
        [NameInMap("out_order_id")]
        [Validation(Required=true)]
        public string OutOrderId { get; set; }

        // 外部请求ID，幂等字段
        // 
        [NameInMap("out_request_id")]
        [Validation(Required=true)]
        public string OutRequestId { get; set; }

        // 分账单状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
