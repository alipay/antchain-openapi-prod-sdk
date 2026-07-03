<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCompanyOpinionDetail extends Model
{
    // 具体的舆情内容
    /**
     * @example 行业整体趋势仍向好,白酒2Q18营收增速略回落,大众品龙头竞争力强化
     *
     * @var string
     */
    public $docContent;

    // 舆情的id
    /**
     * @example 1843266597720304871
     *
     * @var string
     */
    public $docId;

    // 舆情的标题
    /**
     * @example 扫IC网获金证引擎战略投资;产业+互联网+金融;推进电子产业资源整合_搜狐科技_搜狐网
     *
     * @var string
     */
    public $docTitle;

    // 舆情的url
    /**
     * @example http://istock.jrj.com.cn/article,yanbao,30483668.html
     *
     * @var string
     */
    public $docUrl;

    // 情感得分
    /**
     * @example 2.80
     *
     * @var string
     */
    public $emotionScore;

    // 实体相关度得分
    /**
     * @example 0.71
     *
     * @var string
     */
    public $entityRelevancyScore;

    // 命中的关键词
    /**
     * @example
     *
     * @var string
     */
    public $hitKeywords;

    // 媒体影响力得分
    /**
     * @example 6.90
     *
     * @var string
     */
    public $mediaInfluenceScore;

    // 来源媒体
    /**
     * @example 东方媒体
     *
     * @var string
     */
    public $mediaName;

    // 媒体传播得分
    /**
     * @example 0.60
     *
     * @var string
     */
    public $mediaPropagationScore;

    // 舆情的发布时间
    /**
     * @example 2018-07-15
     *
     * @var string
     */
    public $publishTime;

    // 相似文章数
    /**
     * @example 2
     *
     * @var int
     */
    public $similarDocs;
    protected $_name = [
        'docContent'            => 'doc_content',
        'docId'                 => 'doc_id',
        'docTitle'              => 'doc_title',
        'docUrl'                => 'doc_url',
        'emotionScore'          => 'emotion_score',
        'entityRelevancyScore'  => 'entity_relevancy_score',
        'hitKeywords'           => 'hit_keywords',
        'mediaInfluenceScore'   => 'media_influence_score',
        'mediaName'             => 'media_name',
        'mediaPropagationScore' => 'media_propagation_score',
        'publishTime'           => 'publish_time',
        'similarDocs'           => 'similar_docs',
    ];

    public function validate()
    {
        Model::validateRequired('docContent', $this->docContent, true);
        Model::validateRequired('docId', $this->docId, true);
        Model::validateRequired('docTitle', $this->docTitle, true);
        Model::validateRequired('docUrl', $this->docUrl, true);
        Model::validateRequired('mediaName', $this->mediaName, true);
        Model::validateRequired('publishTime', $this->publishTime, true);
        Model::validatePattern('publishTime', $this->publishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->docContent) {
            $res['doc_content'] = $this->docContent;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->docTitle) {
            $res['doc_title'] = $this->docTitle;
        }
        if (null !== $this->docUrl) {
            $res['doc_url'] = $this->docUrl;
        }
        if (null !== $this->emotionScore) {
            $res['emotion_score'] = $this->emotionScore;
        }
        if (null !== $this->entityRelevancyScore) {
            $res['entity_relevancy_score'] = $this->entityRelevancyScore;
        }
        if (null !== $this->hitKeywords) {
            $res['hit_keywords'] = $this->hitKeywords;
        }
        if (null !== $this->mediaInfluenceScore) {
            $res['media_influence_score'] = $this->mediaInfluenceScore;
        }
        if (null !== $this->mediaName) {
            $res['media_name'] = $this->mediaName;
        }
        if (null !== $this->mediaPropagationScore) {
            $res['media_propagation_score'] = $this->mediaPropagationScore;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->similarDocs) {
            $res['similar_docs'] = $this->similarDocs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopCompanyOpinionDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['doc_content'])) {
            $model->docContent = $map['doc_content'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['doc_title'])) {
            $model->docTitle = $map['doc_title'];
        }
        if (isset($map['doc_url'])) {
            $model->docUrl = $map['doc_url'];
        }
        if (isset($map['emotion_score'])) {
            $model->emotionScore = $map['emotion_score'];
        }
        if (isset($map['entity_relevancy_score'])) {
            $model->entityRelevancyScore = $map['entity_relevancy_score'];
        }
        if (isset($map['hit_keywords'])) {
            $model->hitKeywords = $map['hit_keywords'];
        }
        if (isset($map['media_influence_score'])) {
            $model->mediaInfluenceScore = $map['media_influence_score'];
        }
        if (isset($map['media_name'])) {
            $model->mediaName = $map['media_name'];
        }
        if (isset($map['media_propagation_score'])) {
            $model->mediaPropagationScore = $map['media_propagation_score'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }
        if (isset($map['similar_docs'])) {
            $model->similarDocs = $map['similar_docs'];
        }

        return $model;
    }
}
