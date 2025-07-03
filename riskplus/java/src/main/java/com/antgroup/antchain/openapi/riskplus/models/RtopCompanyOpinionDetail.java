// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCompanyOpinionDetail extends TeaModel {
    // 具体的舆情内容
    /**
     * <strong>example:</strong>
     * <p>行业整体趋势仍向好,白酒2Q18营收增速略回落,大众品龙头竞争力强化</p>
     */
    @NameInMap("doc_content")
    @Validation(required = true)
    public String docContent;

    // 舆情的id
    /**
     * <strong>example:</strong>
     * <p>1843266597720304871</p>
     */
    @NameInMap("doc_id")
    @Validation(required = true)
    public String docId;

    // 舆情的标题
    /**
     * <strong>example:</strong>
     * <p>扫IC网获金证引擎战略投资;产业+互联网+金融;推进电子产业资源整合_搜狐科技_搜狐网</p>
     */
    @NameInMap("doc_title")
    @Validation(required = true)
    public String docTitle;

    // 舆情的url
    /**
     * <strong>example:</strong>
     * <p><a href="http://istock.jrj.com.cn/article,yanbao,30483668.html">http://istock.jrj.com.cn/article,yanbao,30483668.html</a></p>
     */
    @NameInMap("doc_url")
    @Validation(required = true)
    public String docUrl;

    // 情感得分
    /**
     * <strong>example:</strong>
     * <p>2.80</p>
     */
    @NameInMap("emotion_score")
    public String emotionScore;

    // 实体相关度得分
    /**
     * <strong>example:</strong>
     * <p>0.71</p>
     */
    @NameInMap("entity_relevancy_score")
    public String entityRelevancyScore;

    // 命中的关键词
    @NameInMap("hit_keywords")
    public String hitKeywords;

    // 媒体影响力得分
    /**
     * <strong>example:</strong>
     * <p>6.90</p>
     */
    @NameInMap("media_influence_score")
    public String mediaInfluenceScore;

    // 来源媒体
    /**
     * <strong>example:</strong>
     * <p>东方媒体</p>
     */
    @NameInMap("media_name")
    @Validation(required = true)
    public String mediaName;

    // 媒体传播得分
    /**
     * <strong>example:</strong>
     * <p>0.60</p>
     */
    @NameInMap("media_propagation_score")
    public String mediaPropagationScore;

    // 舆情的发布时间
    /**
     * <strong>example:</strong>
     * <p>2018-07-15</p>
     */
    @NameInMap("publish_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String publishTime;

    // 相似文章数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("similar_docs")
    public Integer similarDocs;

    public static RtopCompanyOpinionDetail build(java.util.Map<String, ?> map) throws Exception {
        RtopCompanyOpinionDetail self = new RtopCompanyOpinionDetail();
        return TeaModel.build(map, self);
    }

    public RtopCompanyOpinionDetail setDocContent(String docContent) {
        this.docContent = docContent;
        return this;
    }
    public String getDocContent() {
        return this.docContent;
    }

    public RtopCompanyOpinionDetail setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public RtopCompanyOpinionDetail setDocTitle(String docTitle) {
        this.docTitle = docTitle;
        return this;
    }
    public String getDocTitle() {
        return this.docTitle;
    }

    public RtopCompanyOpinionDetail setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public RtopCompanyOpinionDetail setEmotionScore(String emotionScore) {
        this.emotionScore = emotionScore;
        return this;
    }
    public String getEmotionScore() {
        return this.emotionScore;
    }

    public RtopCompanyOpinionDetail setEntityRelevancyScore(String entityRelevancyScore) {
        this.entityRelevancyScore = entityRelevancyScore;
        return this;
    }
    public String getEntityRelevancyScore() {
        return this.entityRelevancyScore;
    }

    public RtopCompanyOpinionDetail setHitKeywords(String hitKeywords) {
        this.hitKeywords = hitKeywords;
        return this;
    }
    public String getHitKeywords() {
        return this.hitKeywords;
    }

    public RtopCompanyOpinionDetail setMediaInfluenceScore(String mediaInfluenceScore) {
        this.mediaInfluenceScore = mediaInfluenceScore;
        return this;
    }
    public String getMediaInfluenceScore() {
        return this.mediaInfluenceScore;
    }

    public RtopCompanyOpinionDetail setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public RtopCompanyOpinionDetail setMediaPropagationScore(String mediaPropagationScore) {
        this.mediaPropagationScore = mediaPropagationScore;
        return this;
    }
    public String getMediaPropagationScore() {
        return this.mediaPropagationScore;
    }

    public RtopCompanyOpinionDetail setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public RtopCompanyOpinionDetail setSimilarDocs(Integer similarDocs) {
        this.similarDocs = similarDocs;
        return this;
    }
    public Integer getSimilarDocs() {
        return this.similarDocs;
    }

}
