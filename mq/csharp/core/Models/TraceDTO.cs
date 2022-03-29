// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // TracePageDTO内每行数据
    public class TraceDTO : TeaModel {
        // 查询的 Cell
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息查询所用的 Message ID
        [NameInMap("msg_id")]
        [Validation(Required=false)]
        public string MsgId { get; set; }

        // 消息查询所用的 Message Key
        [NameInMap("msg_key")]
        [Validation(Required=false)]
        public string MsgKey { get; set; }

        // 查询 ID
        [NameInMap("query_id")]
        [Validation(Required=true)]
        public string QueryId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 查询的 Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
