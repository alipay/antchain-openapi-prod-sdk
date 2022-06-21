// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAccountStatusResponse : TeaModel {
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

        // 0:通过；
        // 1:拒绝；
        // 2:处理中；
        // 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 拒绝原因
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // true：是
        // false：否
        [NameInMap("apply_flag")]
        [Validation(Required=false)]
        public bool? ApplyFlag { get; set; }

    }

}
