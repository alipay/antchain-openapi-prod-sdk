// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraceCompactdetailResponse : TeaModel {
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

        // 节点
        [NameInMap("items")]
        [Validation(Required=false)]
        public List<TraceCompactTreeItem> Items { get; set; }

        // 描述整体链路的额外信息，比span总数，应用总数之类的
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public List<KeySet> Attributes { get; set; }

    }

}
