// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ApplyCutpaymentPaymentResponse : TeaModel {
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

        // 成功金额,整数，单位:分
        [NameInMap("succ_amt")]
        [Validation(Required=false)]
        public string SuccAmt { get; set; }

        // 支付成功时间，yyyy-MM-dd HH:mm:ss
        [NameInMap("succ_time")]
        [Validation(Required=false)]
        public string SuccTime { get; set; }

        // 平台订单号
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 商户订单号
        [NameInMap("trans_id")]
        [Validation(Required=false)]
        public string TransId { get; set; }

    }

}
