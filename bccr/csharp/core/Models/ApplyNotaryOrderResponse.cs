// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class ApplyNotaryOrderResponse : TeaModel {
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

        // 出证申请订单ID
        [NameInMap("notary_order_id")]
        [Validation(Required=false)]
        public string NotaryOrderId { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 支付二维码链接
        [NameInMap("pay_url")]
        [Validation(Required=false)]
        public string PayUrl { get; set; }

        // 支付二维码过期时间
        [NameInMap("pay_url_expire_time")]
        [Validation(Required=false)]
        public long? PayUrlExpireTime { get; set; }

    }

}
