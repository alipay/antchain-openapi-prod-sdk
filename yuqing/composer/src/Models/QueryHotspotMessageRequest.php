<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class QueryHotspotMessageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 标题包含XX
    /**
     * @var string
     */
    public $titleIncludingWordsIdx;

    // 正向关键词（短语匹配）
    /**
     * @var string
     */
    public $posKeywords;

    // 标题完全相等的检索条件，与attributes.display_title字段对应
    /**
     * @var string
     */
    public $wholeKeywords;

    // 排序方式： 正序(+)、倒序(-)
    /**
     * @var string
     */
    public $sortByDirection;

    // 省份
    /**
     * @var string
     */
    public $provinces;

    // 爬取时间的最小值（含）
    /**
     * @var int
     */
    public $crawlerTimeStartFilter;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // [媒体子类型
    /**
     * @var string[]
     */
    public $mediaSubType;

    // 是否不指定关键词进行查询：\n 默认false，表示需要指定关键词来查询
    /**
     * @var bool
     */
    public $queryWithoutKeyword;

    // 指定的id列表
    /**
     * @var string[]
     */
    public $docIds;

    // 城市
    /**
     * @var string[]
     */
    public $cities;

    // 爬取时间的最大值（不含）
    /**
     * @var int
     */
    public $crawlerTimeEndFilter;

    // 是否要进行关键词高亮显示
    /**
     * @var bool
     */
    public $enableKeywordHighlight;

    // d当前页
    /**
     * @var int
     */
    public $pageNow;

    // 是否当前在榜 true表示在榜，false或null表示不限
    /**
     * @var bool
     */
    public $fileId;

    // 排序字段
    /**
     * @var string
     */
    public $sortBy;

    // 是否当前在榜
    /**
     * @var bool
     */
    public $active;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'titleIncludingWordsIdx' => 'title_including_words_idx',
        'posKeywords'            => 'pos_keywords',
        'wholeKeywords'          => 'whole_keywords',
        'sortByDirection'        => 'sort_by_direction',
        'provinces'              => 'provinces',
        'crawlerTimeStartFilter' => 'crawler_time_start_filter',
        'pageSize'               => 'page_size',
        'mediaSubType'           => 'media_sub_type',
        'queryWithoutKeyword'    => 'query_without_keyword',
        'docIds'                 => 'doc_ids',
        'cities'                 => 'cities',
        'crawlerTimeEndFilter'   => 'crawler_time_end_filter',
        'enableKeywordHighlight' => 'enable_keyword_highlight',
        'pageNow'                => 'page_now',
        'fileId'                 => 'file_id',
        'sortBy'                 => 'sort_by',
        'active'                 => 'active',
    ];

    public function validate()
    {
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageNow', $this->pageNow, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->titleIncludingWordsIdx) {
            $res['title_including_words_idx'] = $this->titleIncludingWordsIdx;
        }
        if (null !== $this->posKeywords) {
            $res['pos_keywords'] = $this->posKeywords;
        }
        if (null !== $this->wholeKeywords) {
            $res['whole_keywords'] = $this->wholeKeywords;
        }
        if (null !== $this->sortByDirection) {
            $res['sort_by_direction'] = $this->sortByDirection;
        }
        if (null !== $this->provinces) {
            $res['provinces'] = $this->provinces;
        }
        if (null !== $this->crawlerTimeStartFilter) {
            $res['crawler_time_start_filter'] = $this->crawlerTimeStartFilter;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->mediaSubType) {
            $res['media_sub_type'] = $this->mediaSubType;
        }
        if (null !== $this->queryWithoutKeyword) {
            $res['query_without_keyword'] = $this->queryWithoutKeyword;
        }
        if (null !== $this->docIds) {
            $res['doc_ids'] = $this->docIds;
        }
        if (null !== $this->cities) {
            $res['cities'] = $this->cities;
        }
        if (null !== $this->crawlerTimeEndFilter) {
            $res['crawler_time_end_filter'] = $this->crawlerTimeEndFilter;
        }
        if (null !== $this->enableKeywordHighlight) {
            $res['enable_keyword_highlight'] = $this->enableKeywordHighlight;
        }
        if (null !== $this->pageNow) {
            $res['page_now'] = $this->pageNow;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->sortBy) {
            $res['sort_by'] = $this->sortBy;
        }
        if (null !== $this->active) {
            $res['active'] = $this->active;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryHotspotMessageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['title_including_words_idx'])) {
            $model->titleIncludingWordsIdx = $map['title_including_words_idx'];
        }
        if (isset($map['pos_keywords'])) {
            $model->posKeywords = $map['pos_keywords'];
        }
        if (isset($map['whole_keywords'])) {
            $model->wholeKeywords = $map['whole_keywords'];
        }
        if (isset($map['sort_by_direction'])) {
            $model->sortByDirection = $map['sort_by_direction'];
        }
        if (isset($map['provinces'])) {
            $model->provinces = $map['provinces'];
        }
        if (isset($map['crawler_time_start_filter'])) {
            $model->crawlerTimeStartFilter = $map['crawler_time_start_filter'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['media_sub_type'])) {
            if (!empty($map['media_sub_type'])) {
                $model->mediaSubType = $map['media_sub_type'];
            }
        }
        if (isset($map['query_without_keyword'])) {
            $model->queryWithoutKeyword = $map['query_without_keyword'];
        }
        if (isset($map['doc_ids'])) {
            if (!empty($map['doc_ids'])) {
                $model->docIds = $map['doc_ids'];
            }
        }
        if (isset($map['cities'])) {
            if (!empty($map['cities'])) {
                $model->cities = $map['cities'];
            }
        }
        if (isset($map['crawler_time_end_filter'])) {
            $model->crawlerTimeEndFilter = $map['crawler_time_end_filter'];
        }
        if (isset($map['enable_keyword_highlight'])) {
            $model->enableKeywordHighlight = $map['enable_keyword_highlight'];
        }
        if (isset($map['page_now'])) {
            $model->pageNow = $map['page_now'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['sort_by'])) {
            $model->sortBy = $map['sort_by'];
        }
        if (isset($map['active'])) {
            $model->active = $map['active'];
        }

        return $model;
    }
}
