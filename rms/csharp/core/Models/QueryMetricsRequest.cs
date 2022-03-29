// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryMetricsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 结束时间
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 插件类型
        [NameInMap("plugin")]
        [Validation(Required=true)]
        public string Plugin { get; set; }

        // 监控指标 ID
        [NameInMap("ds_id")]
        [Validation(Required=true)]
        public string DsId { get; set; }

        // contentType
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // //采集频率
        [NameInMap("period_type")]
        [Validation(Required=false)]
        public string PeriodType { get; set; }

        // 查询目标列
        [NameInMap("fields")]
        [Validation(Required=false)]
        public List<string> Fields { get; set; }

        // 查询条件
        [NameInMap("where")]
        [Validation(Required=false)]
        public List<KeySet> Where { get; set; }

    }

}
