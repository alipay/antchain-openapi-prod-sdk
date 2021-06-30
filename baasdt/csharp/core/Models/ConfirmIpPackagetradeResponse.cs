// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ConfirmIpPackagetradeResponse : TeaModel {
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

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

        // 保底金支付链接
        [NameInMap("pay_url")]
        [Validation(Required=false)]
        public string PayUrl { get; set; }

        // 保底金账单ID
        [NameInMap("ip_bill_id")]
        [Validation(Required=false)]
        public string IpBillId { get; set; }

    }

}
