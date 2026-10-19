// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class NotifyPoiCouponResponse : TeaModel {
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

        // open_id（回显）
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 通知结果
        [NameInMap("notify_result")]
        [Validation(Required=false)]
        public string NotifyResult { get; set; }

        // 失败原因（notify_result=FAILED 时返回，通知成功为空）。
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
