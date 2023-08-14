// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class SubmitHotspotTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 媒体类型
        [NameInMap("media_sub_types")]
        [Validation(Required=true)]
        public List<string> MediaSubTypes { get; set; }

        // 任务过期时间,单位秒
        [NameInMap("expired_time")]
        [Validation(Required=true)]
        public long? ExpiredTime { get; set; }

        // 排序方式： 正序(+)、倒序(-)
        [NameInMap("sort_by_direction")]
        [Validation(Required=false)]
        public string SortByDirection { get; set; }

        // 排序字段
        [NameInMap("sort_by")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        // 爬取开始时间过滤
        [NameInMap("crawler_time_start_filter")]
        [Validation(Required=false)]
        public long? CrawlerTimeStartFilter { get; set; }

        // 爬取结束时间过滤
        [NameInMap("crawler_time_end_filter")]
        [Validation(Required=false)]
        public long? CrawlerTimeEndFilter { get; set; }

    }

}
