<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SearchCondition extends Model
{
    // 搭配词
    /**
     * @example 搭配词
     *
     * @var string
     */
    public $assKeywords;

    // 被@的用户名称
    /**
     * @example 被@的用户名称
     *
     * @var string
     */
    public $atAuthorName;

    // 作者名称
    /**
     * @example 作者名称
     *
     * @var string
     */
    public $authorName;

    // 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    /**
     * @example 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
     *
     * @var int
     */
    public $commentsLevel;

    // 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    /**
     * @example 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
     *
     * @var string
     */
    public $contentLenLevel;

    // 抓取截止时间
    /**
     * @example 抓取截止时间
     *
     * @var int
     */
    public $createTimeEnd;

    // 抓取起始时间
    /**
     * @example 抓取起始时间
     *
     * @var int
     */
    public $createTimeStart;

    // 文章签名
    /**
     * @example 文章签名
     *
     * @var string
     */
    public $docContentSign;

    // 舆情文章唯一docId
    /**
     * @example 舆情文章唯一docId
     *
     * @var string
     */
    public $docId;

    // 是否去重
    /**
     * @example true, false
     *
     * @var bool
     */
    public $duplicateRemoval;

    // 情感类型，1非负，-1负面
    /**
     * @example 情感类型，1非负，-1负面
     *
     * @var int
     */
    public $emotionType;

    // 是否高亮关键词
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableKeywordHighlight;

    // 排除被@的用户名称
    /**
     * @example 排除被@的用户名称
     *
     * @var string
     */
    public $excludeAtAuthorName;

    // 排除作者名称
    /**
     * @example 排除作者名称
     *
     * @var string
     */
    public $excludeAuthorName;

    // 排除网站域名
    /**
     * @example 排除网站域名
     *
     * @var string
     */
    public $excludeHostName;

    // 排除关键词标签Id列表
    /**
     * @example 排除关键词标签Id列表
     *
     * @var string
     */
    public $excludeKeywordTagIds;

    // 排除词
    /**
     * @example 排除词
     *
     * @var string
     */
    public $excludeKeywords;

    // 标题排除词
    /**
     * @example 标题排除词
     *
     * @var string
     */
    public $excludeKeywordsInTitle;

    // 排除媒体库id列表
    /**
     * @example 排除媒体库id列表
     *
     * @var string
     */
    public $excludeMediaLibraryIds;

    // 排除媒体名称
    /**
     * @example 排除媒体名称
     *
     * @var string
     */
    public $excludeMediaName;

    // 排除媒体类型，枚举值
    /**
     * @example 排除媒体类型，枚举值
     *
     * @var string
     */
    public $excludeMediaType;

    // 排除消息类型，枚举值
    /**
     * @example 排除消息类型，枚举值
     *
     * @var string
     */
    public $excludeMessageType;

    // 其他过滤条件
    /**
     * @example 其他过滤条件
     *
     * @var string
     */
    public $fieldConditions;

    // 文章是否含有图片
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasImage;

    // 是否含有视频
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasVideo;

    // 网站域名
    /**
     * @example 网站域名
     *
     * @var string
     */
    public $hostName;

    // 关键词标签Id列表
    /**
     * @example 关键词标签Id列表
     *
     * @var string
     */
    public $keywordTagIds;

    // 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    /**
     * @example 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
     *
     * @var int
     */
    public $likesLevel;

    // 媒体库id列表
    /**
     * @example 媒体库id列表
     *
     * @var string
     */
    public $mediaLibraryIds;

    // 媒体名称
    /**
     * @example 媒体名称
     *
     * @var string
     */
    public $mediaName;

    // 体类型，枚举值
    /**
     * @example 体类型，枚举值
     *
     * @var string
     */
    public $mediaType;

    // 消息类型，枚举值
    /**
     * @example 消息类型，枚举值
     *
     * @var string
     */
    public $messageType;

    // 当前页
    /**
     * @example 当前页
     *
     * @var int
     */
    public $pageNow;

    // 页大小
    /**
     * @example 页大小
     *
     * @var int
     */
    public $pageSize;

    // 舆情父文章的docId，一般用于查看某篇文章的评论
    /**
     * @example 舆情父文章的docId，一般用于查看某篇文章的评论
     *
     * @var string
     */
    public $parentDocId;

    // 关键词
    /**
     * @example 关键词
     *
     * @var string
     */
    public $posKeyWords;

    // 标题关键词
    /**
     * @example 标题关键词
     *
     * @var string
     */
    public $posKeywordsInTitle;

    // 截止发布时间
    /**
     * @example 截止发布时间
     *
     * @var int
     */
    public $publishTimeEnd;

    // 起始发布时间
    /**
     * @example 起始发布时间
     *
     * @var string
     */
    public $publishTimeStart;

    // 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    /**
     * @example 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
     *
     * @var int
     */
    public $readsLevel;

    // 相关性等级，1：低，2：中，3：高，4：低级别以上
    /**
     * @example 相关性等级，1：低，2：中，3：高，4：低级别以上
     *
     * @var int
     */
    public $relevanceLevel;

    // 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    /**
     * @example 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
     *
     * @var int
     */
    public $repostLevel;

    // 排序字段
    /**
     * @example 排序字段
     *
     * @var string
     */
    public $sortBy;

    // 指定正反向排序
    /**
     * @example 指定正反向排序
     *
     * @var string
     */
    public $sortByDirection;

    // #话题
    /**
     * @example #话题
     *
     * @var string
     */
    public $topics;

    // 舆情文章截止更新时间
    /**
     * @example 舆情文章截止更新时间
     *
     * @var int
     */
    public $updateTimeEnd;

    // 舆情文章起始更新时间
    /**
     * @example 舆情文章起始更新时间
     *
     * @var int
     */
    public $updateTimeStart;
    protected $_name = [
        'assKeywords'            => 'ass_keywords',
        'atAuthorName'           => 'at_author_name',
        'authorName'             => 'author_name',
        'commentsLevel'          => 'comments_level',
        'contentLenLevel'        => 'content_len_level',
        'createTimeEnd'          => 'create_time_end',
        'createTimeStart'        => 'create_time_start',
        'docContentSign'         => 'doc_content_sign',
        'docId'                  => 'doc_id',
        'duplicateRemoval'       => 'duplicate_removal',
        'emotionType'            => 'emotion_type',
        'enableKeywordHighlight' => 'enable_keyword_highlight',
        'excludeAtAuthorName'    => 'exclude_at_author_name',
        'excludeAuthorName'      => 'exclude_author_name',
        'excludeHostName'        => 'exclude_host_name',
        'excludeKeywordTagIds'   => 'exclude_keyword_tag_ids',
        'excludeKeywords'        => 'exclude_keywords',
        'excludeKeywordsInTitle' => 'exclude_keywords_in_title',
        'excludeMediaLibraryIds' => 'exclude_media_library_ids',
        'excludeMediaName'       => 'exclude_media_name',
        'excludeMediaType'       => 'exclude_media_type',
        'excludeMessageType'     => 'exclude_message_type',
        'fieldConditions'        => 'field_conditions',
        'hasImage'               => 'has_image',
        'hasVideo'               => 'has_video',
        'hostName'               => 'host_name',
        'keywordTagIds'          => 'keyword_tag_ids',
        'likesLevel'             => 'likes_level',
        'mediaLibraryIds'        => 'media_library_ids',
        'mediaName'              => 'media_name',
        'mediaType'              => 'media_type',
        'messageType'            => 'message_type',
        'pageNow'                => 'page_now',
        'pageSize'               => 'page_size',
        'parentDocId'            => 'parent_doc_id',
        'posKeyWords'            => 'pos_key_words',
        'posKeywordsInTitle'     => 'pos_keywords_in_title',
        'publishTimeEnd'         => 'publish_time_end',
        'publishTimeStart'       => 'publish_time_start',
        'readsLevel'             => 'reads_level',
        'relevanceLevel'         => 'relevance_level',
        'repostLevel'            => 'repost_level',
        'sortBy'                 => 'sort_by',
        'sortByDirection'        => 'sort_by_direction',
        'topics'                 => 'topics',
        'updateTimeEnd'          => 'update_time_end',
        'updateTimeStart'        => 'update_time_start',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assKeywords) {
            $res['ass_keywords'] = $this->assKeywords;
        }
        if (null !== $this->atAuthorName) {
            $res['at_author_name'] = $this->atAuthorName;
        }
        if (null !== $this->authorName) {
            $res['author_name'] = $this->authorName;
        }
        if (null !== $this->commentsLevel) {
            $res['comments_level'] = $this->commentsLevel;
        }
        if (null !== $this->contentLenLevel) {
            $res['content_len_level'] = $this->contentLenLevel;
        }
        if (null !== $this->createTimeEnd) {
            $res['create_time_end'] = $this->createTimeEnd;
        }
        if (null !== $this->createTimeStart) {
            $res['create_time_start'] = $this->createTimeStart;
        }
        if (null !== $this->docContentSign) {
            $res['doc_content_sign'] = $this->docContentSign;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->duplicateRemoval) {
            $res['duplicate_removal'] = $this->duplicateRemoval;
        }
        if (null !== $this->emotionType) {
            $res['emotion_type'] = $this->emotionType;
        }
        if (null !== $this->enableKeywordHighlight) {
            $res['enable_keyword_highlight'] = $this->enableKeywordHighlight;
        }
        if (null !== $this->excludeAtAuthorName) {
            $res['exclude_at_author_name'] = $this->excludeAtAuthorName;
        }
        if (null !== $this->excludeAuthorName) {
            $res['exclude_author_name'] = $this->excludeAuthorName;
        }
        if (null !== $this->excludeHostName) {
            $res['exclude_host_name'] = $this->excludeHostName;
        }
        if (null !== $this->excludeKeywordTagIds) {
            $res['exclude_keyword_tag_ids'] = $this->excludeKeywordTagIds;
        }
        if (null !== $this->excludeKeywords) {
            $res['exclude_keywords'] = $this->excludeKeywords;
        }
        if (null !== $this->excludeKeywordsInTitle) {
            $res['exclude_keywords_in_title'] = $this->excludeKeywordsInTitle;
        }
        if (null !== $this->excludeMediaLibraryIds) {
            $res['exclude_media_library_ids'] = $this->excludeMediaLibraryIds;
        }
        if (null !== $this->excludeMediaName) {
            $res['exclude_media_name'] = $this->excludeMediaName;
        }
        if (null !== $this->excludeMediaType) {
            $res['exclude_media_type'] = $this->excludeMediaType;
        }
        if (null !== $this->excludeMessageType) {
            $res['exclude_message_type'] = $this->excludeMessageType;
        }
        if (null !== $this->fieldConditions) {
            $res['field_conditions'] = $this->fieldConditions;
        }
        if (null !== $this->hasImage) {
            $res['has_image'] = $this->hasImage;
        }
        if (null !== $this->hasVideo) {
            $res['has_video'] = $this->hasVideo;
        }
        if (null !== $this->hostName) {
            $res['host_name'] = $this->hostName;
        }
        if (null !== $this->keywordTagIds) {
            $res['keyword_tag_ids'] = $this->keywordTagIds;
        }
        if (null !== $this->likesLevel) {
            $res['likes_level'] = $this->likesLevel;
        }
        if (null !== $this->mediaLibraryIds) {
            $res['media_library_ids'] = $this->mediaLibraryIds;
        }
        if (null !== $this->mediaName) {
            $res['media_name'] = $this->mediaName;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
        }
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->pageNow) {
            $res['page_now'] = $this->pageNow;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->parentDocId) {
            $res['parent_doc_id'] = $this->parentDocId;
        }
        if (null !== $this->posKeyWords) {
            $res['pos_key_words'] = $this->posKeyWords;
        }
        if (null !== $this->posKeywordsInTitle) {
            $res['pos_keywords_in_title'] = $this->posKeywordsInTitle;
        }
        if (null !== $this->publishTimeEnd) {
            $res['publish_time_end'] = $this->publishTimeEnd;
        }
        if (null !== $this->publishTimeStart) {
            $res['publish_time_start'] = $this->publishTimeStart;
        }
        if (null !== $this->readsLevel) {
            $res['reads_level'] = $this->readsLevel;
        }
        if (null !== $this->relevanceLevel) {
            $res['relevance_level'] = $this->relevanceLevel;
        }
        if (null !== $this->repostLevel) {
            $res['repost_level'] = $this->repostLevel;
        }
        if (null !== $this->sortBy) {
            $res['sort_by'] = $this->sortBy;
        }
        if (null !== $this->sortByDirection) {
            $res['sort_by_direction'] = $this->sortByDirection;
        }
        if (null !== $this->topics) {
            $res['topics'] = $this->topics;
        }
        if (null !== $this->updateTimeEnd) {
            $res['update_time_end'] = $this->updateTimeEnd;
        }
        if (null !== $this->updateTimeStart) {
            $res['update_time_start'] = $this->updateTimeStart;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SearchCondition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ass_keywords'])) {
            $model->assKeywords = $map['ass_keywords'];
        }
        if (isset($map['at_author_name'])) {
            $model->atAuthorName = $map['at_author_name'];
        }
        if (isset($map['author_name'])) {
            $model->authorName = $map['author_name'];
        }
        if (isset($map['comments_level'])) {
            $model->commentsLevel = $map['comments_level'];
        }
        if (isset($map['content_len_level'])) {
            $model->contentLenLevel = $map['content_len_level'];
        }
        if (isset($map['create_time_end'])) {
            $model->createTimeEnd = $map['create_time_end'];
        }
        if (isset($map['create_time_start'])) {
            $model->createTimeStart = $map['create_time_start'];
        }
        if (isset($map['doc_content_sign'])) {
            $model->docContentSign = $map['doc_content_sign'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['duplicate_removal'])) {
            $model->duplicateRemoval = $map['duplicate_removal'];
        }
        if (isset($map['emotion_type'])) {
            $model->emotionType = $map['emotion_type'];
        }
        if (isset($map['enable_keyword_highlight'])) {
            $model->enableKeywordHighlight = $map['enable_keyword_highlight'];
        }
        if (isset($map['exclude_at_author_name'])) {
            $model->excludeAtAuthorName = $map['exclude_at_author_name'];
        }
        if (isset($map['exclude_author_name'])) {
            $model->excludeAuthorName = $map['exclude_author_name'];
        }
        if (isset($map['exclude_host_name'])) {
            $model->excludeHostName = $map['exclude_host_name'];
        }
        if (isset($map['exclude_keyword_tag_ids'])) {
            $model->excludeKeywordTagIds = $map['exclude_keyword_tag_ids'];
        }
        if (isset($map['exclude_keywords'])) {
            $model->excludeKeywords = $map['exclude_keywords'];
        }
        if (isset($map['exclude_keywords_in_title'])) {
            $model->excludeKeywordsInTitle = $map['exclude_keywords_in_title'];
        }
        if (isset($map['exclude_media_library_ids'])) {
            $model->excludeMediaLibraryIds = $map['exclude_media_library_ids'];
        }
        if (isset($map['exclude_media_name'])) {
            $model->excludeMediaName = $map['exclude_media_name'];
        }
        if (isset($map['exclude_media_type'])) {
            $model->excludeMediaType = $map['exclude_media_type'];
        }
        if (isset($map['exclude_message_type'])) {
            $model->excludeMessageType = $map['exclude_message_type'];
        }
        if (isset($map['field_conditions'])) {
            $model->fieldConditions = $map['field_conditions'];
        }
        if (isset($map['has_image'])) {
            $model->hasImage = $map['has_image'];
        }
        if (isset($map['has_video'])) {
            $model->hasVideo = $map['has_video'];
        }
        if (isset($map['host_name'])) {
            $model->hostName = $map['host_name'];
        }
        if (isset($map['keyword_tag_ids'])) {
            $model->keywordTagIds = $map['keyword_tag_ids'];
        }
        if (isset($map['likes_level'])) {
            $model->likesLevel = $map['likes_level'];
        }
        if (isset($map['media_library_ids'])) {
            $model->mediaLibraryIds = $map['media_library_ids'];
        }
        if (isset($map['media_name'])) {
            $model->mediaName = $map['media_name'];
        }
        if (isset($map['media_type'])) {
            $model->mediaType = $map['media_type'];
        }
        if (isset($map['message_type'])) {
            $model->messageType = $map['message_type'];
        }
        if (isset($map['page_now'])) {
            $model->pageNow = $map['page_now'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['parent_doc_id'])) {
            $model->parentDocId = $map['parent_doc_id'];
        }
        if (isset($map['pos_key_words'])) {
            $model->posKeyWords = $map['pos_key_words'];
        }
        if (isset($map['pos_keywords_in_title'])) {
            $model->posKeywordsInTitle = $map['pos_keywords_in_title'];
        }
        if (isset($map['publish_time_end'])) {
            $model->publishTimeEnd = $map['publish_time_end'];
        }
        if (isset($map['publish_time_start'])) {
            $model->publishTimeStart = $map['publish_time_start'];
        }
        if (isset($map['reads_level'])) {
            $model->readsLevel = $map['reads_level'];
        }
        if (isset($map['relevance_level'])) {
            $model->relevanceLevel = $map['relevance_level'];
        }
        if (isset($map['repost_level'])) {
            $model->repostLevel = $map['repost_level'];
        }
        if (isset($map['sort_by'])) {
            $model->sortBy = $map['sort_by'];
        }
        if (isset($map['sort_by_direction'])) {
            $model->sortByDirection = $map['sort_by_direction'];
        }
        if (isset($map['topics'])) {
            $model->topics = $map['topics'];
        }
        if (isset($map['update_time_end'])) {
            $model->updateTimeEnd = $map['update_time_end'];
        }
        if (isset($map['update_time_start'])) {
            $model->updateTimeStart = $map['update_time_start'];
        }

        return $model;
    }
}
