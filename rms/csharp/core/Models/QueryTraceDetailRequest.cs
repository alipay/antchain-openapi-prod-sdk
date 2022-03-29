// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraceDetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // traceId
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 备选的入口ip
        [NameInMap("backup_entryip")]
        [Validation(Required=false)]
        public string BackupEntryip { get; set; }

        // 是否为第一次查询
        [NameInMap("first_query")]
        [Validation(Required=true)]
        public bool? FirstQuery { get; set; }

    }

}
