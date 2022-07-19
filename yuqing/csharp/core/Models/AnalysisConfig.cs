// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 深度分析配置
    public class AnalysisConfig : TeaModel {
        // 文章ID
        [NameInMap("doc_id")]
        [Validation(Required=false)]
        public string DocId { get; set; }

        // 文章URL
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public long? ProjectId { get; set; }

        // 模板ID
        [NameInMap("filter_id")]
        [Validation(Required=false)]
        public long? FilterId { get; set; }

        // 关键词列表
        [NameInMap("pos_keyword_list")]
        [Validation(Required=false)]
        public List<string> PosKeywordList { get; set; }

        // 开始时间
        [NameInMap("publish_time_start")]
        [Validation(Required=false)]
        public long? PublishTimeStart { get; set; }

        // 结束时间
        [NameInMap("publish_time_end")]
        [Validation(Required=false)]
        public long? PublishTimeEnd { get; set; }

        // URL列表
        [NameInMap("url_list")]
        [Validation(Required=false)]
        public List<string> UrlList { get; set; }

    }

}
