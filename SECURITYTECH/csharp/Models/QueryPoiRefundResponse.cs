// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryPoiRefundResponse : TeaModel {
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
        [Validation(Required=true)]
        public string RefundNo { get; set; }

        // 退款状态：INIT/PROCESSING/SUCCESS/FAILED
        [NameInMap("refund_status")]
        [Validation(Required=true)]
        public string RefundStatus { get; set; }

        // 活体部分退款金额
        [NameInMap("pet_refund_amount")]
        [Validation(Required=false)]
        public string PetRefundAmount { get; set; }

        // 商城部分退款金额
        [NameInMap("mall_refund_amount")]
        [Validation(Required=false)]
        public string MallRefundAmount { get; set; }

        // 说明（与退款申请响应同口径）
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
