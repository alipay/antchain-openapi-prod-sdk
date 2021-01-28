// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryWithholdPayresultResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 支付完成日期
        [NameInMap("pay_date")]
        [Validation(Required=false)]
        public string PayDate { get; set; }

        // 支付宝支付单据号
        [NameInMap("pay_order_id")]
        [Validation(Required=false)]
        public string PayOrderId { get; set; }

        // INIT：受理成功，扣款中
        // FINISHED：扣款成功
        // CLOSED：商户已关单
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 扣款金额
        [NameInMap("trans_amount")]
        [Validation(Required=false)]
        public string TransAmount { get; set; }

    }

}
