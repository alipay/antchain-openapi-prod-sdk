// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QuerySimOrderResponse : TeaModel {
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

        // 订单信息，如果查无返回空对象
        [NameInMap("order_info")]
        [Validation(Required=false)]
        public SimOrderInfo OrderInfo { get; set; }

        // 小程序链接
        [NameInMap("miniapp_link")]
        [Validation(Required=false)]
        public string MiniappLink { get; set; }

    }

}
