// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse : TeaModel {
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

        // 申请是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 返回结果码
        [NameInMap("resultcode")]
        [Validation(Required=false)]
        public string Resultcode { get; set; }

        // 返回结果描述
        [NameInMap("resultmessage")]
        [Validation(Required=false)]
        public string Resultmessage { get; set; }

    }

}
