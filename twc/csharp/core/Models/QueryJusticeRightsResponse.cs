// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryJusticeRightsResponse : TeaModel {
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

        // 案件业务信息(申请人,被申请人,业务要素),示例查看对接文档
        [NameInMap("business_info")]
        [Validation(Required=false)]
        public string BusinessInfo { get; set; }

        // 证据信息,示例查看对接文档
        [NameInMap("evidence_info")]
        [Validation(Required=false)]
        public string EvidenceInfo { get; set; }

    }

}
