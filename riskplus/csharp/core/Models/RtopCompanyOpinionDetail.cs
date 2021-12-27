// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 舆情的详情
    public class RtopCompanyOpinionDetail : TeaModel {
        // 具体的舆情内容
        [NameInMap("doc_content")]
        [Validation(Required=true)]
        public string DocContent { get; set; }

        // 舆情的id
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

        // 舆情的标题
        [NameInMap("doc_title")]
        [Validation(Required=true)]
        public string DocTitle { get; set; }

        // 舆情的url
        [NameInMap("doc_url")]
        [Validation(Required=true)]
        public string DocUrl { get; set; }

        // 情感得分
        [NameInMap("emotion_score")]
        [Validation(Required=false)]
        public string EmotionScore { get; set; }

        // 实体相关度得分
        [NameInMap("entity_relevancy_score")]
        [Validation(Required=false)]
        public string EntityRelevancyScore { get; set; }

        // 命中的关键词
        [NameInMap("hit_keywords")]
        [Validation(Required=false)]
        public string HitKeywords { get; set; }

        // 媒体影响力得分
        [NameInMap("media_influence_score")]
        [Validation(Required=false)]
        public string MediaInfluenceScore { get; set; }

        // 来源媒体
        [NameInMap("media_name")]
        [Validation(Required=true)]
        public string MediaName { get; set; }

        // 媒体传播得分
        [NameInMap("media_propagation_score")]
        [Validation(Required=false)]
        public string MediaPropagationScore { get; set; }

        // 舆情的发布时间
        [NameInMap("publish_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PublishTime { get; set; }

        // 相似文章数
        [NameInMap("similar_docs")]
        [Validation(Required=false)]
        public int? SimilarDocs { get; set; }

    }

}
