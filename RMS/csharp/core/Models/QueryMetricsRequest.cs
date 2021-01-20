// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryMetricsRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=false)]
        public long? Start { get; set; }

        // 结束时间
        [NameInMap("end")]
        [Validation(Required=false)]
        public long? End { get; set; }

        // 插件类型
        [NameInMap("plugin")]
        [Validation(Required=false)]
        public string Plugin { get; set; }

        // 监控指标 ID
        [NameInMap("ds_id")]
        [Validation(Required=false)]
        public long? DsId { get; set; }

        // contentType
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

    }

}
