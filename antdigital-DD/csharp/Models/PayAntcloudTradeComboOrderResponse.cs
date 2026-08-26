// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class PayAntcloudTradeComboOrderResponse : TeaModel {
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

        // 页面支付地址
        [NameInMap("pay_url")]
        [Validation(Required=false)]
        public string PayUrl { get; set; }

        // 支付订单号
        [NameInMap("pay_order_id")]
        [Validation(Required=false)]
        public string PayOrderId { get; set; }

        // 支付状态，
        // SUCCESS：已支付;
        // INIT：未支付;
        // PROCESS：支付中;
        // CANCEL：取消支付;
        [NameInMap("pay_status")]
        [Validation(Required=false)]
        public string PayStatus { get; set; }

        // 支付链接超时时间 单位：分钟
        [NameInMap("timeout_minutes")]
        [Validation(Required=false)]
        public long? TimeoutMinutes { get; set; }

        // 支付链接过期时间
        [NameInMap("expire_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireTime { get; set; }

    }

}
