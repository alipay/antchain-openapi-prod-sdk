// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class StartIpPackagetradeResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

        // 支付信息
        [NameInMap("pay_url")]
        [Validation(Required=false)]
        public string PayUrl { get; set; }

        // 账单ID
        [NameInMap("ip_bill_id")]
        [Validation(Required=false)]
        public string IpBillId { get; set; }

    }

}
