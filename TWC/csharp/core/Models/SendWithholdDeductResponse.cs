// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SendWithholdDeductResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 该笔转账在支付宝系统内部的单据ID
        [NameInMap("entrust_order_id")]
        [Validation(Required=false)]
        public string EntrustOrderId { get; set; }

        // INIT：受理成功，扣款中
        // FINISHED：扣款成功
        // CLOSED：商户已关单
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
