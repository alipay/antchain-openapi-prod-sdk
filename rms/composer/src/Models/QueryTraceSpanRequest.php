<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceSpanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 搜索的毫秒开始时间戳
    /**
     * @var int
     */
    public $startTime;

    // 最大的毫秒开始时间戳
    /**
     * @var int
     */
    public $endTime;

    // 按traceId搜索时会用到 此时其他条件自动失效
    /**
     * @var string
     */
    public $traceId;

    // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
    /**
     * @var string
     */
    public $app;

    // 最小毫秒耗时
    /**
     * @var int
     */
    public $minDuration;

    // 最大毫秒耗时
    /**
     * @var int
     */
    public $maxDuration;

    // 分页号
    /**
     * @var int
     */
    public $currentPage;

    // 每页记录条数
    /**
     * @var int
     */
    public $pageSize;

    // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
    /**
     * @var KeySet[]
     */
    public $tags;

    // 总页数，小于0或不填代表第一次查询，用来获取总页数
    /**
     * @var int
     */
    public $totalPage;

    // 总数，小于0或不填代表第一次查询，用来获取总数
    /**
     * @var int
     */
    public $totalSize;

    // 排序字段
    /**
     * @var string
     */
    public $sortBy;

    // 排序是否逆序
    /**
     * @var bool
     */
    public $sortReverse;

    // 传递需要过滤的字段
    /**
     * @var TraceQuerySummary
     */
    public $filter;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'startTime'     => 'start_time',
        'endTime'       => 'end_time',
        'traceId'       => 'trace_id',
        'app'           => 'app',
        'minDuration'   => 'min_duration',
        'maxDuration'   => 'max_duration',
        'currentPage'   => 'current_page',
        'pageSize'      => 'page_size',
        'tags'          => 'tags',
        'totalPage'     => 'total_page',
        'totalSize'     => 'total_size',
        'sortBy'        => 'sort_by',
        'sortReverse'   => 'sort_reverse',
        'filter'        => 'filter',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->minDuration) {
            $res['min_duration'] = $this->minDuration;
        }
        if (null !== $this->maxDuration) {
            $res['max_duration'] = $this->maxDuration;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }
        if (null !== $this->sortBy) {
            $res['sort_by'] = $this->sortBy;
        }
        if (null !== $this->sortReverse) {
            $res['sort_reverse'] = $this->sortReverse;
        }
        if (null !== $this->filter) {
            $res['filter'] = null !== $this->filter ? $this->filter->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceSpanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['min_duration'])) {
            $model->minDuration = $map['min_duration'];
        }
        if (isset($map['max_duration'])) {
            $model->maxDuration = $map['max_duration'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }
        if (isset($map['sort_by'])) {
            $model->sortBy = $map['sort_by'];
        }
        if (isset($map['sort_reverse'])) {
            $model->sortReverse = $map['sort_reverse'];
        }
        if (isset($map['filter'])) {
            $model->filter = TraceQuerySummary::fromMap($map['filter']);
        }

        return $model;
    }
}
