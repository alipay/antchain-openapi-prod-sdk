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
     * @var int
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

        return $model;
    }
}
