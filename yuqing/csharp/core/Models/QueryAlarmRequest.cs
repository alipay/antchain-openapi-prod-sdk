// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class QueryAlarmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 规则id列表
        [NameInMap("alarm_rule_ids")]
        [Validation(Required=false)]
        public List<long?> AlarmRuleIds { get; set; }

        // 排序字段名称，如gmt_create
        [NameInMap("order_by")]
        [Validation(Required=false)]
        public string OrderBy { get; set; }

        // 是否用更新时间筛选
        [NameInMap("is_query_update_time")]
        [Validation(Required=false)]
        public bool? IsQueryUpdateTime { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 舆情项目id列表
        [NameInMap("project_ids")]
        [Validation(Required=false)]
        public List<long?> ProjectIds { get; set; }

        // 预警时间下限
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 预警等级，如：P0
        [NameInMap("levels")]
        [Validation(Required=false)]
        public string Levels { get; set; }

        // 预警时间上限
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 预警规则类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 预警消息id
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<long?> Ids { get; set; }

        // 标签id
        [NameInMap("tag_ids")]
        [Validation(Required=false)]
        public List<long?> TagIds { get; set; }

        // 媒体类型
        [NameInMap("doc_media_type")]
        [Validation(Required=false)]
        public string DocMediaType { get; set; }

        // 消息状态，如：FINISHED
        [NameInMap("status")]
        [Validation(Required=false)]
        public List<string> Status { get; set; }

        // 文章docId列表
        [NameInMap("doc_id_list")]
        [Validation(Required=false)]
        public List<string> DocIdList { get; set; }

        // 排序方向，DESC降序，ASC升序
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

        // requestId
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
