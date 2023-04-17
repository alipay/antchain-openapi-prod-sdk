// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class QueryHotspotMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 标题包含XX
        [NameInMap("title_including_words_idx")]
        [Validation(Required=false)]
        public string TitleIncludingWordsIdx { get; set; }

        // 正向关键词（短语匹配）
        [NameInMap("pos_keywords")]
        [Validation(Required=false)]
        public string PosKeywords { get; set; }

        // 标题完全相等的检索条件，与attributes.display_title字段对应
        [NameInMap("whole_keywords")]
        [Validation(Required=false)]
        public string WholeKeywords { get; set; }

        // 排序方式： 正序(+)、倒序(-)
        [NameInMap("sort_by_direction")]
        [Validation(Required=false)]
        public string SortByDirection { get; set; }

        // 省份
        [NameInMap("provinces")]
        [Validation(Required=false)]
        public string Provinces { get; set; }

        // 爬取时间的最小值（含）
        [NameInMap("crawler_time_start_filter")]
        [Validation(Required=false)]
        public long? CrawlerTimeStartFilter { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // [媒体子类型
        [NameInMap("media_sub_type")]
        [Validation(Required=false)]
        public List<string> MediaSubType { get; set; }

        // 是否不指定关键词进行查询：\n 默认false，表示需要指定关键词来查询
        [NameInMap("query_without_keyword")]
        [Validation(Required=false)]
        public bool? QueryWithoutKeyword { get; set; }

        // 指定的id列表
        [NameInMap("doc_ids")]
        [Validation(Required=false)]
        public List<string> DocIds { get; set; }

        // 城市
        [NameInMap("cities")]
        [Validation(Required=false)]
        public List<string> Cities { get; set; }

        // 爬取时间的最大值（不含）
        [NameInMap("crawler_time_end_filter")]
        [Validation(Required=false)]
        public long? CrawlerTimeEndFilter { get; set; }

        // 是否要进行关键词高亮显示
        [NameInMap("enable_keyword_highlight")]
        [Validation(Required=false)]
        public bool? EnableKeywordHighlight { get; set; }

        // d当前页
        [NameInMap("page_now")]
        [Validation(Required=true)]
        public long? PageNow { get; set; }

        // 是否当前在榜 true表示在榜，false或null表示不限
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public bool? FileId { get; set; }

        // 排序字段
        [NameInMap("sort_by")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        // 是否当前在榜
        [NameInMap("active")]
        [Validation(Required=false)]
        public bool? Active { get; set; }

    }

}
