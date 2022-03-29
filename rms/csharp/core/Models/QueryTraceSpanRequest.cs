// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraceSpanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 搜索的毫秒开始时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 最大的毫秒开始时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 按traceId搜索时会用到 此时其他条件自动失效
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 最小毫秒耗时
        [NameInMap("min_duration")]
        [Validation(Required=false)]
        public long? MinDuration { get; set; }

        // 最大毫秒耗时
        [NameInMap("max_duration")]
        [Validation(Required=false)]
        public long? MaxDuration { get; set; }

        // 分页号
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 每页记录条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeySet> Tags { get; set; }

        // 总页数，小于0或不填代表第一次查询，用来获取总页数
        [NameInMap("total_page")]
        [Validation(Required=false)]
        public long? TotalPage { get; set; }

        // 总数，小于0或不填代表第一次查询，用来获取总数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

        // 排序字段
        [NameInMap("sort_by")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        // 排序是否逆序
        [NameInMap("sort_reverse")]
        [Validation(Required=false)]
        public bool? SortReverse { get; set; }

        // 传递需要过滤的字段
        [NameInMap("filter")]
        [Validation(Required=false)]
        public TraceQuerySummary Filter { get; set; }

    }

}
