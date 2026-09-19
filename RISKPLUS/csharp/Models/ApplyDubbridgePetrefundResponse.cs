// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgePetrefundResponse : TeaModel {
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

        // 退款单号
        [NameInMap("refund_no")]
        [Validation(Required=false)]
        public string RefundNo { get; set; }

        // 退款申请结果，Y-提交成功，N-提交失败
        [NameInMap("refund_status")]
        [Validation(Required=false)]
        public string RefundStatus { get; set; }

        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 业务订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

    }

}
