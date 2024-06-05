// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    public class NotifyBlockchainBotDigitalkeyWithholdResponse : TeaModel {
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

        // 明细返回码
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 明细返回码描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

        // 预通知返回内容
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
