// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class DescribeRmsTracetreeResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 树状图结构体
        // 找不到数据时 trace_tree_items 为空数组, 并不会报错
        [NameInMap("trace_tree_items")]
        [Validation(Required=false)]
        public List<TraceTreeItem> TraceTreeItems { get; set; }

    }

}
