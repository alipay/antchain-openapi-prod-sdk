// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ApplyCutpaymentRefundResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 退款商户订单号
        [NameInMap("refund_trans_id")]
        [Validation(Required=false)]
        public string RefundTransId { get; set; }

        // 退款商户流水号
        [NameInMap("refund_serial_no")]
        [Validation(Required=false)]
        public string RefundSerialNo { get; set; }

        // 退款金额，单位：分 整数
        [NameInMap("refund_amt")]
        [Validation(Required=false)]
        public string RefundAmt { get; set; }

    }

}
