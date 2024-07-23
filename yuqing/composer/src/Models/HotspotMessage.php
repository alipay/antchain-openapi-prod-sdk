<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class HotspotMessage extends Model
{
    // 热搜/热榜/话题 对应用户id (可能为空)
    /**
     * @example 1
     *
     * @var string
     */
    public $userId;

    // 在榜总时间
    /**
     * @example 1
     *
     * @var int
     */
    public $totalExistTimestamp;

    // 下榜时间
    /**
     * @example XXX
     *
     * @var string
     */
    public $lastExistDateFormat;

    // 爬虫爬取的时间
    /**
     * @example XXX
     *
     * @var string
     */
    public $crawlerTimeFmt;

    // 第一次上榜的格式化时间
    /**
     * @example XXX
     *
     * @var string
     */
    public $firstExistDateFormat;

    // 最高排名的总时长
    /**
     * @example 1
     *
     * @var int
     */
    public $maxRankTotalTimestamp;

    // 跟随量
    /**
     * @example 1
     *
     * @var int
     */
    public $followersCount;

    // 在榜单中的最高排名
    /**
     * @example 在榜单中的最高排名
     *
     * @var int
     */
    public $maxRank;

    // 阅读量
    /**
     * @example 1
     *
     * @var int
     */
    public $readsCount;

    // 评论数
    /**
     * @example 1
     *
     * @var int
     */
    public $commentsCount;

    // 标题，例如话题的标题就是话题本身
    /**
     * @example XXX
     *
     * @var string
     */
    public $docTitle;

    // 首次上榜排名
    /**
     * @example 1
     *
     * @var int
     */
    public $firstRank;

    // 原创人数
    /**
     * @example 1
     *
     * @var int
     */
    public $originalCount;

    // 主持人
    /**
     * @example XXX
     *
     * @var string
     */
    public $presenterName;

    // 热搜在热搜榜的位置
    /**
     * @example 1
     *
     * @var int
     */
    public $rank;

    // 热点媒体类型
    /**
     * @example XXX
     *
     * @var string
     */
    public $mediaType;

    // 文档id
    /**
     * @example XXX
     *
     * @var string
     */
    public $docId;

    // 类型
    /**
     * @example XXX
     *
     * @var string
     */
    public $type;

    // 热度值
    /**
     * @example 1
     *
     * @var int
     */
    public $hotValue;

    // 内容，热榜数据中存在着文章，热文就是有内容的
    /**
     * @example XXX
     *
     * @var string
     */
    public $docContent;

    // 热搜/热榜/话题 对应用户名称 (可能为空)
    /**
     * @example XXX
     *
     * @var string
     */
    public $screenName;

    // 热点媒体子类型
    /**
     * @example XXX
     *
     * @var string
     */
    public $mediaSubType;

    // 讨论量
    /**
     * @example 1
     *
     * @var int
     */
    public $discussesCount;

    // 分类
    /**
     * @example XXX
     *
     * @var string
     */
    public $category;

    // 视频量
    /**
     * @example 1
     *
     * @var int
     */
    public $videoCount;

    // 最高排名的格式化总时长
    /**
     * @example XXX
     *
     * @var string
     */
    public $maxRankTotalTimeFormat;

    // 省
    /**
     * @example XXX
     *
     * @var string
     */
    public $province;

    // 在榜格式化的总时间
    /**
     * @example XXX
     *
     * @var string
     */
    public $totalExistTimeFormat;

    // 第一次上最高排名的时间
    /**
     * @example 1
     *
     * @var int
     */
    public $firstTopExistTimestamp;

    // 链接地址
    /**
     * @example XXX
     *
     * @var string
     */
    public $docUrl;

    // 最大的热度值
    /**
     * @example 1
     *
     * @var int
     */
    public $maxHotValue;

    // 市
    /**
     * @example 北京
     *
     * @var string
     */
    public $city;

    // 最后一次上榜的时间
    /**
     * @example 1
     *
     * @var int
     */
    public $lastExistTimestamp;

    // 第一次上最高排名的时间
    /**
     * @example XXX
     *
     * @var string
     */
    public $firstTopExistDateFormat;

    // 下榜排名
    /**
     * @example 1
     *
     * @var int
     */
    public $lastRank;

    // 首次上榜热度
    /**
     * @example 1
     *
     * @var int
     */
    public $firstHotValue;

    // 热搜类型
    /**
     * @example XXX
     *
     * @var string
     */
    public $hotspotType;

    // 第一次上榜的时间
    /**
     * @example 1
     *
     * @var int
     */
    public $firstXxistTimestamp;

    // 第一次上榜时间
    /**
     * @example
     *
     * @var int
     */
    public $firstExistTimestamp;
    protected $_name = [
        'userId'                  => 'user_id',
        'totalExistTimestamp'     => 'total_exist_timestamp',
        'lastExistDateFormat'     => 'last_exist_date_format',
        'crawlerTimeFmt'          => 'crawler_time_fmt',
        'firstExistDateFormat'    => 'first_exist_date_format',
        'maxRankTotalTimestamp'   => 'max_rank_total_timestamp',
        'followersCount'          => 'followers_count',
        'maxRank'                 => 'max_rank',
        'readsCount'              => 'reads_count',
        'commentsCount'           => 'comments_count',
        'docTitle'                => 'doc_title',
        'firstRank'               => 'first_rank',
        'originalCount'           => 'original_count',
        'presenterName'           => 'presenter_name',
        'rank'                    => 'rank',
        'mediaType'               => 'media_type',
        'docId'                   => 'doc_id',
        'type'                    => 'type',
        'hotValue'                => 'hot_value',
        'docContent'              => 'doc_content',
        'screenName'              => 'screen_name',
        'mediaSubType'            => 'media_sub_type',
        'discussesCount'          => 'discusses_count',
        'category'                => 'category',
        'videoCount'              => 'video_count',
        'maxRankTotalTimeFormat'  => 'max_rank_total_time_format',
        'province'                => 'province',
        'totalExistTimeFormat'    => 'total_exist_time_format',
        'firstTopExistTimestamp'  => 'first_top_exist_timestamp',
        'docUrl'                  => 'doc_url',
        'maxHotValue'             => 'max_hot_value',
        'city'                    => 'city',
        'lastExistTimestamp'      => 'last_exist_timestamp',
        'firstTopExistDateFormat' => 'first_top_exist_date_format',
        'lastRank'                => 'last_rank',
        'firstHotValue'           => 'first_hot_value',
        'hotspotType'             => 'hotspot_type',
        'firstXxistTimestamp'     => 'first_xxist_timestamp',
        'firstExistTimestamp'     => 'first_exist_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('totalExistTimestamp', $this->totalExistTimestamp, true);
        Model::validateRequired('lastExistDateFormat', $this->lastExistDateFormat, true);
        Model::validateRequired('crawlerTimeFmt', $this->crawlerTimeFmt, true);
        Model::validateRequired('firstExistDateFormat', $this->firstExistDateFormat, true);
        Model::validateRequired('maxRankTotalTimestamp', $this->maxRankTotalTimestamp, true);
        Model::validateRequired('followersCount', $this->followersCount, true);
        Model::validateRequired('maxRank', $this->maxRank, true);
        Model::validateRequired('readsCount', $this->readsCount, true);
        Model::validateRequired('commentsCount', $this->commentsCount, true);
        Model::validateRequired('docTitle', $this->docTitle, true);
        Model::validateRequired('firstRank', $this->firstRank, true);
        Model::validateRequired('originalCount', $this->originalCount, true);
        Model::validateRequired('presenterName', $this->presenterName, true);
        Model::validateRequired('rank', $this->rank, true);
        Model::validateRequired('mediaType', $this->mediaType, true);
        Model::validateRequired('docId', $this->docId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('hotValue', $this->hotValue, true);
        Model::validateRequired('docContent', $this->docContent, true);
        Model::validateRequired('screenName', $this->screenName, true);
        Model::validateRequired('mediaSubType', $this->mediaSubType, true);
        Model::validateRequired('discussesCount', $this->discussesCount, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('videoCount', $this->videoCount, true);
        Model::validateRequired('maxRankTotalTimeFormat', $this->maxRankTotalTimeFormat, true);
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('totalExistTimeFormat', $this->totalExistTimeFormat, true);
        Model::validateRequired('firstTopExistTimestamp', $this->firstTopExistTimestamp, true);
        Model::validateRequired('maxHotValue', $this->maxHotValue, true);
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('lastExistTimestamp', $this->lastExistTimestamp, true);
        Model::validateRequired('firstTopExistDateFormat', $this->firstTopExistDateFormat, true);
        Model::validateRequired('lastRank', $this->lastRank, true);
        Model::validateRequired('firstHotValue', $this->firstHotValue, true);
        Model::validateRequired('hotspotType', $this->hotspotType, true);
        Model::validateRequired('firstXxistTimestamp', $this->firstXxistTimestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->totalExistTimestamp) {
            $res['total_exist_timestamp'] = $this->totalExistTimestamp;
        }
        if (null !== $this->lastExistDateFormat) {
            $res['last_exist_date_format'] = $this->lastExistDateFormat;
        }
        if (null !== $this->crawlerTimeFmt) {
            $res['crawler_time_fmt'] = $this->crawlerTimeFmt;
        }
        if (null !== $this->firstExistDateFormat) {
            $res['first_exist_date_format'] = $this->firstExistDateFormat;
        }
        if (null !== $this->maxRankTotalTimestamp) {
            $res['max_rank_total_timestamp'] = $this->maxRankTotalTimestamp;
        }
        if (null !== $this->followersCount) {
            $res['followers_count'] = $this->followersCount;
        }
        if (null !== $this->maxRank) {
            $res['max_rank'] = $this->maxRank;
        }
        if (null !== $this->readsCount) {
            $res['reads_count'] = $this->readsCount;
        }
        if (null !== $this->commentsCount) {
            $res['comments_count'] = $this->commentsCount;
        }
        if (null !== $this->docTitle) {
            $res['doc_title'] = $this->docTitle;
        }
        if (null !== $this->firstRank) {
            $res['first_rank'] = $this->firstRank;
        }
        if (null !== $this->originalCount) {
            $res['original_count'] = $this->originalCount;
        }
        if (null !== $this->presenterName) {
            $res['presenter_name'] = $this->presenterName;
        }
        if (null !== $this->rank) {
            $res['rank'] = $this->rank;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->hotValue) {
            $res['hot_value'] = $this->hotValue;
        }
        if (null !== $this->docContent) {
            $res['doc_content'] = $this->docContent;
        }
        if (null !== $this->screenName) {
            $res['screen_name'] = $this->screenName;
        }
        if (null !== $this->mediaSubType) {
            $res['media_sub_type'] = $this->mediaSubType;
        }
        if (null !== $this->discussesCount) {
            $res['discusses_count'] = $this->discussesCount;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->videoCount) {
            $res['video_count'] = $this->videoCount;
        }
        if (null !== $this->maxRankTotalTimeFormat) {
            $res['max_rank_total_time_format'] = $this->maxRankTotalTimeFormat;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->totalExistTimeFormat) {
            $res['total_exist_time_format'] = $this->totalExistTimeFormat;
        }
        if (null !== $this->firstTopExistTimestamp) {
            $res['first_top_exist_timestamp'] = $this->firstTopExistTimestamp;
        }
        if (null !== $this->docUrl) {
            $res['doc_url'] = $this->docUrl;
        }
        if (null !== $this->maxHotValue) {
            $res['max_hot_value'] = $this->maxHotValue;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->lastExistTimestamp) {
            $res['last_exist_timestamp'] = $this->lastExistTimestamp;
        }
        if (null !== $this->firstTopExistDateFormat) {
            $res['first_top_exist_date_format'] = $this->firstTopExistDateFormat;
        }
        if (null !== $this->lastRank) {
            $res['last_rank'] = $this->lastRank;
        }
        if (null !== $this->firstHotValue) {
            $res['first_hot_value'] = $this->firstHotValue;
        }
        if (null !== $this->hotspotType) {
            $res['hotspot_type'] = $this->hotspotType;
        }
        if (null !== $this->firstXxistTimestamp) {
            $res['first_xxist_timestamp'] = $this->firstXxistTimestamp;
        }
        if (null !== $this->firstExistTimestamp) {
            $res['first_exist_timestamp'] = $this->firstExistTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HotspotMessage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['total_exist_timestamp'])) {
            $model->totalExistTimestamp = $map['total_exist_timestamp'];
        }
        if (isset($map['last_exist_date_format'])) {
            $model->lastExistDateFormat = $map['last_exist_date_format'];
        }
        if (isset($map['crawler_time_fmt'])) {
            $model->crawlerTimeFmt = $map['crawler_time_fmt'];
        }
        if (isset($map['first_exist_date_format'])) {
            $model->firstExistDateFormat = $map['first_exist_date_format'];
        }
        if (isset($map['max_rank_total_timestamp'])) {
            $model->maxRankTotalTimestamp = $map['max_rank_total_timestamp'];
        }
        if (isset($map['followers_count'])) {
            $model->followersCount = $map['followers_count'];
        }
        if (isset($map['max_rank'])) {
            $model->maxRank = $map['max_rank'];
        }
        if (isset($map['reads_count'])) {
            $model->readsCount = $map['reads_count'];
        }
        if (isset($map['comments_count'])) {
            $model->commentsCount = $map['comments_count'];
        }
        if (isset($map['doc_title'])) {
            $model->docTitle = $map['doc_title'];
        }
        if (isset($map['first_rank'])) {
            $model->firstRank = $map['first_rank'];
        }
        if (isset($map['original_count'])) {
            $model->originalCount = $map['original_count'];
        }
        if (isset($map['presenter_name'])) {
            $model->presenterName = $map['presenter_name'];
        }
        if (isset($map['rank'])) {
            $model->rank = $map['rank'];
        }
        if (isset($map['media_type'])) {
            $model->mediaType = $map['media_type'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['hot_value'])) {
            $model->hotValue = $map['hot_value'];
        }
        if (isset($map['doc_content'])) {
            $model->docContent = $map['doc_content'];
        }
        if (isset($map['screen_name'])) {
            $model->screenName = $map['screen_name'];
        }
        if (isset($map['media_sub_type'])) {
            $model->mediaSubType = $map['media_sub_type'];
        }
        if (isset($map['discusses_count'])) {
            $model->discussesCount = $map['discusses_count'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['video_count'])) {
            $model->videoCount = $map['video_count'];
        }
        if (isset($map['max_rank_total_time_format'])) {
            $model->maxRankTotalTimeFormat = $map['max_rank_total_time_format'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['total_exist_time_format'])) {
            $model->totalExistTimeFormat = $map['total_exist_time_format'];
        }
        if (isset($map['first_top_exist_timestamp'])) {
            $model->firstTopExistTimestamp = $map['first_top_exist_timestamp'];
        }
        if (isset($map['doc_url'])) {
            $model->docUrl = $map['doc_url'];
        }
        if (isset($map['max_hot_value'])) {
            $model->maxHotValue = $map['max_hot_value'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['last_exist_timestamp'])) {
            $model->lastExistTimestamp = $map['last_exist_timestamp'];
        }
        if (isset($map['first_top_exist_date_format'])) {
            $model->firstTopExistDateFormat = $map['first_top_exist_date_format'];
        }
        if (isset($map['last_rank'])) {
            $model->lastRank = $map['last_rank'];
        }
        if (isset($map['first_hot_value'])) {
            $model->firstHotValue = $map['first_hot_value'];
        }
        if (isset($map['hotspot_type'])) {
            $model->hotspotType = $map['hotspot_type'];
        }
        if (isset($map['first_xxist_timestamp'])) {
            $model->firstXxistTimestamp = $map['first_xxist_timestamp'];
        }
        if (isset($map['first_exist_timestamp'])) {
            $model->firstExistTimestamp = $map['first_exist_timestamp'];
        }

        return $model;
    }
}
