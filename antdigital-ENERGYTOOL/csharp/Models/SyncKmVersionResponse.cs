// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class SyncKmVersionResponse : TeaModel {
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

        // 树ID
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public string TreeId { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 快照原文
        [NameInMap("snapshot")]
        [Validation(Required=false)]
        public string Snapshot { get; set; }

        // 版本关联的文档详情列表
        [NameInMap("documents")]
        [Validation(Required=false)]
        public List<SnapshotDocumentItem> Documents { get; set; }

    }

}
