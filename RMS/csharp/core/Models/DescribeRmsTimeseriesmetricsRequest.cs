// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class DescribeRmsTimeseriesmetricsRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // sum或none
        [NameInMap("aggregator")]
        [Validation(Required=false)]
        public string Aggregator { get; set; }

        // 结束毫秒时间戳
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // metrics字段名称
        [NameInMap("metrics")]
        [Validation(Required=false)]
        public List<StringValue> Metrics { get; set; }

        // 开始毫秒时间戳
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 扩展字段tags
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeyValuePair> Tags { get; set; }

        // metrics类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // workspace_id或workspace_name选填一个
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        // workspace_id或workspace_name选填一个
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

    }

}
