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
     * @var string[]
     */
    public $assKeywordList;

    // 被@的用户名称
    /**
     * @example 被@的用户名称
     *
     * @var string[]
     */
    public $atAuthorNameList;

    // 作者名称
    /**
     * @example 作者名称
     *
     * @var string[]
     */
    public $authorNameList;

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
     * @var string[]
     */
    public $docIdList;

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
     * @var string[]
     */
    public $excludeAtAuthorNameList;

    // 排除作者名称
    /**
     * @example 排除作者名称
     *
     * @var string[]
     */
    public $excludeAuthorNameList;

    // 排除网站域名
    /**
     * @example 排除网站域名
     *
     * @var string[]
     */
    public $excludeHostNameList;

    // 排除关键词标签Id列表
    /**
     * @example 排除关键词标签Id列表
     *
     * @var int[]
     */
    public $excludeKeywordTagIds;

    // 排除词
    /**
     * @example 排除词
     *
     * @var string[]
     */
    public $excludeKeywordList;

    // 标题排除词
    /**
     * @example 标题排除词
     *
     * @var string[]
     */
    public $excludeKeywordListInTitle;

    // 排除媒体库id列表
    /**
     * @example 排除媒体库id列表
     *
     * @var int[]
     */
    public $excludeMediaLibraryIdList;

    // 排除媒体名称
    /**
     * @example 排除媒体名称
     *
     * @var string[]
     */
    public $excludeMediaNameList;

    // 排除媒体类型，枚举值
    /**
     * @example 排除媒体类型，枚举值
     *
     * @var string[]
     */
    public $excludeMediaTypeList;

    // 排除消息类型，枚举值
    /**
     * @example 排除消息类型，枚举值
     *
     * @var string[]
     */
    public $excludeMessageTypeList;

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
     * @var string[]
     */
    public $hostNameList;

    // 关键词标签Id列表
    /**
     * @example 关键词标签Id列表
     *
     * @var int[]
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
     * @var int[]
     */
    public $mediaLibraryIdList;

    // 媒体名称
    /**
     * @example 媒体名称
     *
     * @var string[]
     */
    public $mediaNameList;

    // 体类型，枚举值
    /**
     * @example 体类型，枚举值
     *
     * @var string[]
     */
    public $mediaTypeList;

    // 消息类型，枚举值
    /**
     * @example 消息类型，枚举值
     *
     * @var string[]
     */
    public $messageTypeList;

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
     * @var string[]
     */
    public $posKeywordList;

    // 标题关键词
    /**
     * @example 标题关键词
     *
     * @var string[]
     */
    public $posKeywordListInTitle;

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
     * @var int
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
     * @var string[]
     */
    public $topicList;

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
        'assKeywordList'            => 'ass_keyword_list',
        'atAuthorNameList'          => 'at_author_name_list',
        'authorNameList'            => 'author_name_list',
        'commentsLevel'             => 'comments_level',
        'contentLenLevel'           => 'content_len_level',
        'createTimeEnd'             => 'create_time_end',
        'createTimeStart'           => 'create_time_start',
        'docContentSign'            => 'doc_content_sign',
        'docIdList'                 => 'doc_id_list',
        'duplicateRemoval'          => 'duplicate_removal',
        'emotionType'               => 'emotion_type',
        'enableKeywordHighlight'    => 'enable_keyword_highlight',
        'excludeAtAuthorNameList'   => 'exclude_at_author_name_list',
        'excludeAuthorNameList'     => 'exclude_author_name_list',
        'excludeHostNameList'       => 'exclude_host_name_list',
        'excludeKeywordTagIds'      => 'exclude_keyword_tag_ids',
        'excludeKeywordList'        => 'exclude_keyword_list',
        'excludeKeywordListInTitle' => 'exclude_keyword_list_in_title',
        'excludeMediaLibraryIdList' => 'exclude_media_library_id_list',
        'excludeMediaNameList'      => 'exclude_media_name_list',
        'excludeMediaTypeList'      => 'exclude_media_type_list',
        'excludeMessageTypeList'    => 'exclude_message_type_list',
        'hasImage'                  => 'has_image',
        'hasVideo'                  => 'has_video',
        'hostNameList'              => 'host_name_list',
        'keywordTagIds'             => 'keyword_tag_ids',
        'likesLevel'                => 'likes_level',
        'mediaLibraryIdList'        => 'media_library_id_list',
        'mediaNameList'             => 'media_name_list',
        'mediaTypeList'             => 'media_type_list',
        'messageTypeList'           => 'message_type_list',
        'pageNow'                   => 'page_now',
        'pageSize'                  => 'page_size',
        'parentDocId'               => 'parent_doc_id',
        'posKeywordList'            => 'pos_keyword_list',
        'posKeywordListInTitle'     => 'pos_keyword_list_in_title',
        'publishTimeEnd'            => 'publish_time_end',
        'publishTimeStart'          => 'publish_time_start',
        'readsLevel'                => 'reads_level',
        'relevanceLevel'            => 'relevance_level',
        'repostLevel'               => 'repost_level',
        'sortBy'                    => 'sort_by',
        'sortByDirection'           => 'sort_by_direction',
        'topicList'                 => 'topic_list',
        'updateTimeEnd'             => 'update_time_end',
        'updateTimeStart'           => 'update_time_start',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assKeywordList) {
            $res['ass_keyword_list'] = $this->assKeywordList;
        }
        if (null !== $this->atAuthorNameList) {
            $res['at_author_name_list'] = $this->atAuthorNameList;
        }
        if (null !== $this->authorNameList) {
            $res['author_name_list'] = $this->authorNameList;
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
        if (null !== $this->docIdList) {
            $res['doc_id_list'] = $this->docIdList;
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
        if (null !== $this->excludeAtAuthorNameList) {
            $res['exclude_at_author_name_list'] = $this->excludeAtAuthorNameList;
        }
        if (null !== $this->excludeAuthorNameList) {
            $res['exclude_author_name_list'] = $this->excludeAuthorNameList;
        }
        if (null !== $this->excludeHostNameList) {
            $res['exclude_host_name_list'] = $this->excludeHostNameList;
        }
        if (null !== $this->excludeKeywordTagIds) {
            $res['exclude_keyword_tag_ids'] = $this->excludeKeywordTagIds;
        }
        if (null !== $this->excludeKeywordList) {
            $res['exclude_keyword_list'] = $this->excludeKeywordList;
        }
        if (null !== $this->excludeKeywordListInTitle) {
            $res['exclude_keyword_list_in_title'] = $this->excludeKeywordListInTitle;
        }
        if (null !== $this->excludeMediaLibraryIdList) {
            $res['exclude_media_library_id_list'] = $this->excludeMediaLibraryIdList;
        }
        if (null !== $this->excludeMediaNameList) {
            $res['exclude_media_name_list'] = $this->excludeMediaNameList;
        }
        if (null !== $this->excludeMediaTypeList) {
            $res['exclude_media_type_list'] = $this->excludeMediaTypeList;
        }
        if (null !== $this->excludeMessageTypeList) {
            $res['exclude_message_type_list'] = $this->excludeMessageTypeList;
        }
        if (null !== $this->hasImage) {
            $res['has_image'] = $this->hasImage;
        }
        if (null !== $this->hasVideo) {
            $res['has_video'] = $this->hasVideo;
        }
        if (null !== $this->hostNameList) {
            $res['host_name_list'] = $this->hostNameList;
        }
        if (null !== $this->keywordTagIds) {
            $res['keyword_tag_ids'] = $this->keywordTagIds;
        }
        if (null !== $this->likesLevel) {
            $res['likes_level'] = $this->likesLevel;
        }
        if (null !== $this->mediaLibraryIdList) {
            $res['media_library_id_list'] = $this->mediaLibraryIdList;
        }
        if (null !== $this->mediaNameList) {
            $res['media_name_list'] = $this->mediaNameList;
        }
        if (null !== $this->mediaTypeList) {
            $res['media_type_list'] = $this->mediaTypeList;
        }
        if (null !== $this->messageTypeList) {
            $res['message_type_list'] = $this->messageTypeList;
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
        if (null !== $this->posKeywordList) {
            $res['pos_keyword_list'] = $this->posKeywordList;
        }
        if (null !== $this->posKeywordListInTitle) {
            $res['pos_keyword_list_in_title'] = $this->posKeywordListInTitle;
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
        if (null !== $this->topicList) {
            $res['topic_list'] = $this->topicList;
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
        if (isset($map['ass_keyword_list'])) {
            if (!empty($map['ass_keyword_list'])) {
                $model->assKeywordList = $map['ass_keyword_list'];
            }
        }
        if (isset($map['at_author_name_list'])) {
            if (!empty($map['at_author_name_list'])) {
                $model->atAuthorNameList = $map['at_author_name_list'];
            }
        }
        if (isset($map['author_name_list'])) {
            if (!empty($map['author_name_list'])) {
                $model->authorNameList = $map['author_name_list'];
            }
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
        if (isset($map['doc_id_list'])) {
            if (!empty($map['doc_id_list'])) {
                $model->docIdList = $map['doc_id_list'];
            }
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
        if (isset($map['exclude_at_author_name_list'])) {
            if (!empty($map['exclude_at_author_name_list'])) {
                $model->excludeAtAuthorNameList = $map['exclude_at_author_name_list'];
            }
        }
        if (isset($map['exclude_author_name_list'])) {
            if (!empty($map['exclude_author_name_list'])) {
                $model->excludeAuthorNameList = $map['exclude_author_name_list'];
            }
        }
        if (isset($map['exclude_host_name_list'])) {
            if (!empty($map['exclude_host_name_list'])) {
                $model->excludeHostNameList = $map['exclude_host_name_list'];
            }
        }
        if (isset($map['exclude_keyword_tag_ids'])) {
            if (!empty($map['exclude_keyword_tag_ids'])) {
                $model->excludeKeywordTagIds = $map['exclude_keyword_tag_ids'];
            }
        }
        if (isset($map['exclude_keyword_list'])) {
            if (!empty($map['exclude_keyword_list'])) {
                $model->excludeKeywordList = $map['exclude_keyword_list'];
            }
        }
        if (isset($map['exclude_keyword_list_in_title'])) {
            if (!empty($map['exclude_keyword_list_in_title'])) {
                $model->excludeKeywordListInTitle = $map['exclude_keyword_list_in_title'];
            }
        }
        if (isset($map['exclude_media_library_id_list'])) {
            if (!empty($map['exclude_media_library_id_list'])) {
                $model->excludeMediaLibraryIdList = $map['exclude_media_library_id_list'];
            }
        }
        if (isset($map['exclude_media_name_list'])) {
            if (!empty($map['exclude_media_name_list'])) {
                $model->excludeMediaNameList = $map['exclude_media_name_list'];
            }
        }
        if (isset($map['exclude_media_type_list'])) {
            if (!empty($map['exclude_media_type_list'])) {
                $model->excludeMediaTypeList = $map['exclude_media_type_list'];
            }
        }
        if (isset($map['exclude_message_type_list'])) {
            if (!empty($map['exclude_message_type_list'])) {
                $model->excludeMessageTypeList = $map['exclude_message_type_list'];
            }
        }
        if (isset($map['has_image'])) {
            $model->hasImage = $map['has_image'];
        }
        if (isset($map['has_video'])) {
            $model->hasVideo = $map['has_video'];
        }
        if (isset($map['host_name_list'])) {
            if (!empty($map['host_name_list'])) {
                $model->hostNameList = $map['host_name_list'];
            }
        }
        if (isset($map['keyword_tag_ids'])) {
            if (!empty($map['keyword_tag_ids'])) {
                $model->keywordTagIds = $map['keyword_tag_ids'];
            }
        }
        if (isset($map['likes_level'])) {
            $model->likesLevel = $map['likes_level'];
        }
        if (isset($map['media_library_id_list'])) {
            if (!empty($map['media_library_id_list'])) {
                $model->mediaLibraryIdList = $map['media_library_id_list'];
            }
        }
        if (isset($map['media_name_list'])) {
            if (!empty($map['media_name_list'])) {
                $model->mediaNameList = $map['media_name_list'];
            }
        }
        if (isset($map['media_type_list'])) {
            if (!empty($map['media_type_list'])) {
                $model->mediaTypeList = $map['media_type_list'];
            }
        }
        if (isset($map['message_type_list'])) {
            if (!empty($map['message_type_list'])) {
                $model->messageTypeList = $map['message_type_list'];
            }
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
        if (isset($map['pos_keyword_list'])) {
            if (!empty($map['pos_keyword_list'])) {
                $model->posKeywordList = $map['pos_keyword_list'];
            }
        }
        if (isset($map['pos_keyword_list_in_title'])) {
            if (!empty($map['pos_keyword_list_in_title'])) {
                $model->posKeywordListInTitle = $map['pos_keyword_list_in_title'];
            }
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
        if (isset($map['topic_list'])) {
            if (!empty($map['topic_list'])) {
                $model->topicList = $map['topic_list'];
            }
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
