<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class YuqingMessage extends Model
{
    // 作者头像地址
    /**
     * @example 作者头像地址
     *
     * @var string
     */
    public $authorAvatarUrl;

    // 粉丝数
    /**
     * @example 粉丝数
     *
     * @var int
     */
    public $authorFollowersCount;

    // 好友数
    /**
     * @example 好友数
     *
     * @var int
     */
    public $authorFriendsCount;

    // 作者id
    /**
     * @example 作者id
     *
     * @var string
     */
    public $authorId;

    // 作者名称
    /**
     * @example 作者名称
     *
     * @var string
     */
    public $authorName;

    // 发文数
    /**
     * @example 发文数
     *
     * @var int
     */
    public $authorStatusesCount;

    // 作者认证类型
    /**
     * @example 作者认证类型
     *
     * @var string
     */
    public $authorVerifyType;

    // 舆情文章被抓取的时间戳
    /**
     * @example 舆情文章被抓取的时间戳
     *
     * @var int
     */
    public $createTime;

    // 文章正文内容
    /**
     * @example 文章正文内容
     *
     * @var string
     */
    public $docContent;

    // 文章摘要
    /**
     * @example 文章摘要
     *
     * @var string
     */
    public $docContentBrief;

    // 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
    /**
     * @example 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
     *
     * @var string
     */
    public $docContentSign;

    // 文章唯一docId
    /**
     * @example 文章唯一docId
     *
     * @var string
     */
    public $docId;

    // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
    /**
     * @example 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
     *
     * @var string
     */
    public $docSelfContentSign;

    // 文章标题
    /**
     * @example 文章标题
     *
     * @var string
     */
    public $docTitle;

    // 原文地址
    /**
     * @example 原文地址
     *
     * @var string
     */
    public $docUrl;

    // 情感的正负面，-1代表负面，1代表非负面
    /**
     * @example 情感的正负面，-1代表负面，1代表非负面
     *
     * @var int
     */
    public $emotionType;

    // 命中的搜索词列表
    /**
     * @example 命中的搜索词列表
     *
     * @var string[]
     */
    public $highlightKeywords;

    // 媒体类型，枚举值
    /**
     * @example 媒体类型，枚举值
     *
     * @var string
     */
    public $mediaType;

    // 舆情消息类型:转发,评论/回复, 原文,群聊等
    /**
     * @example 舆情消息类型:转发,评论/回复, 原文,群聊等
     *
     * @var string
     */
    public $messageType;

    // 文章的父docId，如被转发的文章docId
    /**
     * @example 文章的父docId，如被转发的文章docId
     *
     * @var string
     */
    public $parentDocId;

    // 舆情文章的发布时间戳
    /**
     * @example 舆情文章的发布时间戳
     *
     * @var int
     */
    public $publishTime;

    // 相关性得分
    /**
     * @example 相关性得分
     *
     * @var string
     */
    public $relevanceScore;

    // 相似文章数
    /**
     * @example 相似文章数
     *
     * @var int
     */
    public $similarNumber;

    // 微博评论id
    /**
     * @example 微博评论id
     *
     * @var string
     */
    public $weiboCommentId;

    // 微博消息id
    /**
     * @example 微博消息id
     *
     * @var string
     */
    public $weiboMid;

    // 传播得分，0-10
    /**
     * @example 10
     *
     * @var string
     */
    public $propagationScore;

    // 情感得分
    /**
     * @example 10.1
     *
     * @var string
     */
    public $emotionScore;

    // 影响力得分
    /**
     * @example 10.2
     *
     * @var string
     */
    public $influenceScore;

    // 提级地域列表
    /**
     * @example
     *
     * @var string[]
     */
    public $docAreas;

    // 媒体名称
    /**
     * @example 微博
     *
     * @var string
     */
    public $mediaName;

    // 扩展信息
    /**
     * @example
     *
     * @var YuqingMessageExtInfo
     */
    public $extInfo;

    // 文章转载自
    /**
     * @example 文章转载自
     *
     * @var string
     */
    public $docReprintName;

    // 视频列表地址
    /**
     * @example 视频列表地址
     *
     * @var string
     */
    public $contentVideoUrls;

    // 图片列表地址
    /**
     * @example 图片列表地址
     *
     * @var string
     */
    public $contentImageUrls;

    // 图片识别出来的文本
    /**
     * @example 图片识别出来的文本
     *
     * @var string
     */
    public $contentImageText;

    // 音频列表地址
    /**
     * @example 音频列表地址
     *
     * @var string
     */
    public $contentAudioUrls;

    // 音频识别出来的文本
    /**
     * @example 音频识别出来的文本
     *
     * @var string
     */
    public $contentAudioText;

    // 视频识别出来的文本
    /**
     * @example 视频识别出来的文本
     *
     * @var string
     */
    public $contentVideoText;

    // 文章转发数
    /**
     * @example 1
     *
     * @var int
     */
    public $docRepostsCount;

    // 文章评论数
    /**
     * @example 1
     *
     * @var int
     */
    public $docCommentsCount;

    // 文章点赞数
    /**
     * @example 1
     *
     * @var int
     */
    public $docLikesCount;

    // 文章阅读数
    /**
     * @example 1
     *
     * @var int
     */
    public $docReadsCount;

    // 回答数
    /**
     * @example 1
     *
     * @var int
     */
    public $docAnswersCount;
    protected $_name = [
        'authorAvatarUrl'      => 'author_avatar_url',
        'authorFollowersCount' => 'author_followers_count',
        'authorFriendsCount'   => 'author_friends_count',
        'authorId'             => 'author_id',
        'authorName'           => 'author_name',
        'authorStatusesCount'  => 'author_statuses_count',
        'authorVerifyType'     => 'author_verify_type',
        'createTime'           => 'create_time',
        'docContent'           => 'doc_content',
        'docContentBrief'      => 'doc_content_brief',
        'docContentSign'       => 'doc_content_sign',
        'docId'                => 'doc_id',
        'docSelfContentSign'   => 'doc_self_content_sign',
        'docTitle'             => 'doc_title',
        'docUrl'               => 'doc_url',
        'emotionType'          => 'emotion_type',
        'highlightKeywords'    => 'highlight_keywords',
        'mediaType'            => 'media_type',
        'messageType'          => 'message_type',
        'parentDocId'          => 'parent_doc_id',
        'publishTime'          => 'publish_time',
        'relevanceScore'       => 'relevance_score',
        'similarNumber'        => 'similar_number',
        'weiboCommentId'       => 'weibo_comment_id',
        'weiboMid'             => 'weibo_mid',
        'propagationScore'     => 'propagation_score',
        'emotionScore'         => 'emotion_score',
        'influenceScore'       => 'influence_score',
        'docAreas'             => 'doc_areas',
        'mediaName'            => 'media_name',
        'extInfo'              => 'ext_info',
        'docReprintName'       => 'doc_reprint_name',
        'contentVideoUrls'     => 'content_video_urls',
        'contentImageUrls'     => 'content_image_urls',
        'contentImageText'     => 'content_image_text',
        'contentAudioUrls'     => 'content_audio_urls',
        'contentAudioText'     => 'content_audio_text',
        'contentVideoText'     => 'content_video_text',
        'docRepostsCount'      => 'doc_reposts_count',
        'docCommentsCount'     => 'doc_comments_count',
        'docLikesCount'        => 'doc_likes_count',
        'docReadsCount'        => 'doc_reads_count',
        'docAnswersCount'      => 'doc_answers_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authorAvatarUrl) {
            $res['author_avatar_url'] = $this->authorAvatarUrl;
        }
        if (null !== $this->authorFollowersCount) {
            $res['author_followers_count'] = $this->authorFollowersCount;
        }
        if (null !== $this->authorFriendsCount) {
            $res['author_friends_count'] = $this->authorFriendsCount;
        }
        if (null !== $this->authorId) {
            $res['author_id'] = $this->authorId;
        }
        if (null !== $this->authorName) {
            $res['author_name'] = $this->authorName;
        }
        if (null !== $this->authorStatusesCount) {
            $res['author_statuses_count'] = $this->authorStatusesCount;
        }
        if (null !== $this->authorVerifyType) {
            $res['author_verify_type'] = $this->authorVerifyType;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->docContent) {
            $res['doc_content'] = $this->docContent;
        }
        if (null !== $this->docContentBrief) {
            $res['doc_content_brief'] = $this->docContentBrief;
        }
        if (null !== $this->docContentSign) {
            $res['doc_content_sign'] = $this->docContentSign;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->docSelfContentSign) {
            $res['doc_self_content_sign'] = $this->docSelfContentSign;
        }
        if (null !== $this->docTitle) {
            $res['doc_title'] = $this->docTitle;
        }
        if (null !== $this->docUrl) {
            $res['doc_url'] = $this->docUrl;
        }
        if (null !== $this->emotionType) {
            $res['emotion_type'] = $this->emotionType;
        }
        if (null !== $this->highlightKeywords) {
            $res['highlight_keywords'] = $this->highlightKeywords;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
        }
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->parentDocId) {
            $res['parent_doc_id'] = $this->parentDocId;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
        }
        if (null !== $this->relevanceScore) {
            $res['relevance_score'] = $this->relevanceScore;
        }
        if (null !== $this->similarNumber) {
            $res['similar_number'] = $this->similarNumber;
        }
        if (null !== $this->weiboCommentId) {
            $res['weibo_comment_id'] = $this->weiboCommentId;
        }
        if (null !== $this->weiboMid) {
            $res['weibo_mid'] = $this->weiboMid;
        }
        if (null !== $this->propagationScore) {
            $res['propagation_score'] = $this->propagationScore;
        }
        if (null !== $this->emotionScore) {
            $res['emotion_score'] = $this->emotionScore;
        }
        if (null !== $this->influenceScore) {
            $res['influence_score'] = $this->influenceScore;
        }
        if (null !== $this->docAreas) {
            $res['doc_areas'] = $this->docAreas;
        }
        if (null !== $this->mediaName) {
            $res['media_name'] = $this->mediaName;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = null !== $this->extInfo ? $this->extInfo->toMap() : null;
        }
        if (null !== $this->docReprintName) {
            $res['doc_reprint_name'] = $this->docReprintName;
        }
        if (null !== $this->contentVideoUrls) {
            $res['content_video_urls'] = $this->contentVideoUrls;
        }
        if (null !== $this->contentImageUrls) {
            $res['content_image_urls'] = $this->contentImageUrls;
        }
        if (null !== $this->contentImageText) {
            $res['content_image_text'] = $this->contentImageText;
        }
        if (null !== $this->contentAudioUrls) {
            $res['content_audio_urls'] = $this->contentAudioUrls;
        }
        if (null !== $this->contentAudioText) {
            $res['content_audio_text'] = $this->contentAudioText;
        }
        if (null !== $this->contentVideoText) {
            $res['content_video_text'] = $this->contentVideoText;
        }
        if (null !== $this->docRepostsCount) {
            $res['doc_reposts_count'] = $this->docRepostsCount;
        }
        if (null !== $this->docCommentsCount) {
            $res['doc_comments_count'] = $this->docCommentsCount;
        }
        if (null !== $this->docLikesCount) {
            $res['doc_likes_count'] = $this->docLikesCount;
        }
        if (null !== $this->docReadsCount) {
            $res['doc_reads_count'] = $this->docReadsCount;
        }
        if (null !== $this->docAnswersCount) {
            $res['doc_answers_count'] = $this->docAnswersCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return YuqingMessage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['author_avatar_url'])) {
            $model->authorAvatarUrl = $map['author_avatar_url'];
        }
        if (isset($map['author_followers_count'])) {
            $model->authorFollowersCount = $map['author_followers_count'];
        }
        if (isset($map['author_friends_count'])) {
            $model->authorFriendsCount = $map['author_friends_count'];
        }
        if (isset($map['author_id'])) {
            $model->authorId = $map['author_id'];
        }
        if (isset($map['author_name'])) {
            $model->authorName = $map['author_name'];
        }
        if (isset($map['author_statuses_count'])) {
            $model->authorStatusesCount = $map['author_statuses_count'];
        }
        if (isset($map['author_verify_type'])) {
            $model->authorVerifyType = $map['author_verify_type'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['doc_content'])) {
            $model->docContent = $map['doc_content'];
        }
        if (isset($map['doc_content_brief'])) {
            $model->docContentBrief = $map['doc_content_brief'];
        }
        if (isset($map['doc_content_sign'])) {
            $model->docContentSign = $map['doc_content_sign'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['doc_self_content_sign'])) {
            $model->docSelfContentSign = $map['doc_self_content_sign'];
        }
        if (isset($map['doc_title'])) {
            $model->docTitle = $map['doc_title'];
        }
        if (isset($map['doc_url'])) {
            $model->docUrl = $map['doc_url'];
        }
        if (isset($map['emotion_type'])) {
            $model->emotionType = $map['emotion_type'];
        }
        if (isset($map['highlight_keywords'])) {
            if (!empty($map['highlight_keywords'])) {
                $model->highlightKeywords = $map['highlight_keywords'];
            }
        }
        if (isset($map['media_type'])) {
            $model->mediaType = $map['media_type'];
        }
        if (isset($map['message_type'])) {
            $model->messageType = $map['message_type'];
        }
        if (isset($map['parent_doc_id'])) {
            $model->parentDocId = $map['parent_doc_id'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }
        if (isset($map['relevance_score'])) {
            $model->relevanceScore = $map['relevance_score'];
        }
        if (isset($map['similar_number'])) {
            $model->similarNumber = $map['similar_number'];
        }
        if (isset($map['weibo_comment_id'])) {
            $model->weiboCommentId = $map['weibo_comment_id'];
        }
        if (isset($map['weibo_mid'])) {
            $model->weiboMid = $map['weibo_mid'];
        }
        if (isset($map['propagation_score'])) {
            $model->propagationScore = $map['propagation_score'];
        }
        if (isset($map['emotion_score'])) {
            $model->emotionScore = $map['emotion_score'];
        }
        if (isset($map['influence_score'])) {
            $model->influenceScore = $map['influence_score'];
        }
        if (isset($map['doc_areas'])) {
            if (!empty($map['doc_areas'])) {
                $model->docAreas = $map['doc_areas'];
            }
        }
        if (isset($map['media_name'])) {
            $model->mediaName = $map['media_name'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = YuqingMessageExtInfo::fromMap($map['ext_info']);
        }
        if (isset($map['doc_reprint_name'])) {
            $model->docReprintName = $map['doc_reprint_name'];
        }
        if (isset($map['content_video_urls'])) {
            $model->contentVideoUrls = $map['content_video_urls'];
        }
        if (isset($map['content_image_urls'])) {
            $model->contentImageUrls = $map['content_image_urls'];
        }
        if (isset($map['content_image_text'])) {
            $model->contentImageText = $map['content_image_text'];
        }
        if (isset($map['content_audio_urls'])) {
            $model->contentAudioUrls = $map['content_audio_urls'];
        }
        if (isset($map['content_audio_text'])) {
            $model->contentAudioText = $map['content_audio_text'];
        }
        if (isset($map['content_video_text'])) {
            $model->contentVideoText = $map['content_video_text'];
        }
        if (isset($map['doc_reposts_count'])) {
            $model->docRepostsCount = $map['doc_reposts_count'];
        }
        if (isset($map['doc_comments_count'])) {
            $model->docCommentsCount = $map['doc_comments_count'];
        }
        if (isset($map['doc_likes_count'])) {
            $model->docLikesCount = $map['doc_likes_count'];
        }
        if (isset($map['doc_reads_count'])) {
            $model->docReadsCount = $map['doc_reads_count'];
        }
        if (isset($map['doc_answers_count'])) {
            $model->docAnswersCount = $map['doc_answers_count'];
        }

        return $model;
    }
}
