// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ApplyPoiRefundResponse : TeaModel {
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

        // 退款单号（回显）
        [NameInMap("refund_no")]
        [Validation(Required=true)]
        public string RefundNo { get; set; }

        // 退款状态：INIT-已受理 / PROCESSING-处理中 / SUCCESS-退款成功 / FAILED-退款失败
        [NameInMap("refund_status")]
        [Validation(Required=true)]
        public string RefundStatus { get; set; }

        // 受理/拒绝说明（在途拦截整单拒绝时携带拆分提示；成功受理为空）
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
