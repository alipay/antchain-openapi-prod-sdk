// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsTracespanRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 最大的毫秒开始时间戳
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 万能扩展字段
        [NameInMap("extensions")]
        [Validation(Required=false)]
        public List<KeySet> Extensions { get; set; }

        // 最大毫秒耗时
        [NameInMap("max_duration")]
        [Validation(Required=false)]
        public long? MaxDuration { get; set; }

        // 最小毫秒耗时
        [NameInMap("min_duration")]
        [Validation(Required=false)]
        public long? MinDuration { get; set; }

        // 分页号
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 搜索的毫秒开始时间戳
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 结果码
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeySet> Tags { get; set; }

        // 按traceId搜索时会用到 此时其他条件自动失效
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

    }

}
