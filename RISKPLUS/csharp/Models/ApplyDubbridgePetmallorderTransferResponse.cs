// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgePetmallorderTransferResponse : TeaModel {
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

        // 业务订单
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

        // 受理结果：Y-受理成功、N-受理失败
        [NameInMap("settle_result")]
        [Validation(Required=false)]
        public string SettleResult { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 分账单号，提交成功时返回
        [NameInMap("transfer_no")]
        [Validation(Required=false)]
        public string TransferNo { get; set; }

    }

}
