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
        /// <summary>
        /// <b>Example:</b>
        /// <para>行业整体趋势仍向好,白酒2Q18营收增速略回落,大众品龙头竞争力强化</para>
        /// </summary>
        [NameInMap("doc_content")]
        [Validation(Required=true)]
        public string DocContent { get; set; }

        // 舆情的id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1843266597720304871</para>
        /// </summary>
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

        // 舆情的标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>扫IC网获金证引擎战略投资;产业+互联网+金融;推进电子产业资源整合_搜狐科技_搜狐网</para>
        /// </summary>
        [NameInMap("doc_title")]
        [Validation(Required=true)]
        public string DocTitle { get; set; }

        // 舆情的url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://istock.jrj.com.cn/article,yanbao,30483668.html">http://istock.jrj.com.cn/article,yanbao,30483668.html</a></para>
        /// </summary>
        [NameInMap("doc_url")]
        [Validation(Required=true)]
        public string DocUrl { get; set; }

        // 情感得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.80</para>
        /// </summary>
        [NameInMap("emotion_score")]
        [Validation(Required=false)]
        public string EmotionScore { get; set; }

        // 实体相关度得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.71</para>
        /// </summary>
        [NameInMap("entity_relevancy_score")]
        [Validation(Required=false)]
        public string EntityRelevancyScore { get; set; }

        // 命中的关键词
        [NameInMap("hit_keywords")]
        [Validation(Required=false)]
        public string HitKeywords { get; set; }

        // 媒体影响力得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>6.90</para>
        /// </summary>
        [NameInMap("media_influence_score")]
        [Validation(Required=false)]
        public string MediaInfluenceScore { get; set; }

        // 来源媒体
        /// <summary>
        /// <b>Example:</b>
        /// <para>东方媒体</para>
        /// </summary>
        [NameInMap("media_name")]
        [Validation(Required=true)]
        public string MediaName { get; set; }

        // 媒体传播得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.60</para>
        /// </summary>
        [NameInMap("media_propagation_score")]
        [Validation(Required=false)]
        public string MediaPropagationScore { get; set; }

        // 舆情的发布时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-07-15</para>
        /// </summary>
        [NameInMap("publish_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PublishTime { get; set; }

        // 相似文章数
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("similar_docs")]
        [Validation(Required=false)]
        public int? SimilarDocs { get; set; }

    }

}
