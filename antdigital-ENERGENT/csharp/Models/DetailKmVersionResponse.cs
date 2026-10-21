// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class DetailKmVersionResponse : TeaModel {
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

        // 版本ID
        [NameInMap("version_id")]
        [Validation(Required=false)]
        public string VersionId { get; set; }

        // 知识库ID
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public string TreeId { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 版本描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 版本快照JSON文本(树结构全文)
        [NameInMap("snapshot")]
        [Validation(Required=false)]
        public string Snapshot { get; set; }

        // 文档数
        [NameInMap("doc_count")]
        [Validation(Required=false)]
        public long? DocCount { get; set; }

        // 节点数
        [NameInMap("node_count")]
        [Validation(Required=false)]
        public long? NodeCount { get; set; }

    }

}
