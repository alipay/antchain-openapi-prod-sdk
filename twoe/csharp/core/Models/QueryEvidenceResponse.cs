// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWOE.Models
{
    public class QueryEvidenceResponse : TeaModel {
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

        // session编号
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 取证状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 证据信息，只有当status为EVIDENCE时返回，否则为null
        [NameInMap("data")]
        [Validation(Required=false)]
        public EvidenceInfo Data { get; set; }

    }

}
