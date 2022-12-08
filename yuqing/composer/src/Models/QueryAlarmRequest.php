<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class QueryAlarmRequest extends Model
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

    // 规则id列表
    /**
     * @var int[]
     */
    public $alarmRuleIds;

    // 排序字段名称，如gmt_create
    /**
     * @var string
     */
    public $orderBy;

    // 是否用更新时间筛选
    /**
     * @var bool
     */
    public $isQueryUpdateTime;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 舆情项目id列表
    /**
     * @var int[]
     */
    public $projectIds;

    // 预警时间下限
    /**
     * @var int
     */
    public $endTime;

    // 预警等级，如：P0
    /**
     * @var string
     */
    public $levels;

    // 预警时间上限
    /**
     * @var int
     */
    public $startTime;

    // 预警规则类型
    /**
     * @var string
     */
    public $type;

    // 预警消息id
    /**
     * @var int[]
     */
    public $ids;

    // 标签id
    /**
     * @var int[]
     */
    public $tagIds;

    // 媒体类型
    /**
     * @var string
     */
    public $docMediaType;

    // 消息状态，如：FINISHED
    /**
     * @var string[]
     */
    public $status;

    // 文章docId列表
    /**
     * @var string[]
     */
    public $docIdList;

    // 排序方向，DESC降序，ASC升序
    /**
     * @var string
     */
    public $sortType;

    // requestId
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alarmRuleIds'      => 'alarm_rule_ids',
        'orderBy'           => 'order_by',
        'isQueryUpdateTime' => 'is_query_update_time',
        'currentPage'       => 'current_page',
        'pageSize'          => 'page_size',
        'projectIds'        => 'project_ids',
        'endTime'           => 'end_time',
        'levels'            => 'levels',
        'startTime'         => 'start_time',
        'type'              => 'type',
        'ids'               => 'ids',
        'tagIds'            => 'tag_ids',
        'docMediaType'      => 'doc_media_type',
        'status'            => 'status',
        'docIdList'         => 'doc_id_list',
        'sortType'          => 'sort_type',
        'requestId'         => 'request_id',
    ];

    public function validate()
    {
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
        if (null !== $this->alarmRuleIds) {
            $res['alarm_rule_ids'] = $this->alarmRuleIds;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->isQueryUpdateTime) {
            $res['is_query_update_time'] = $this->isQueryUpdateTime;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->projectIds) {
            $res['project_ids'] = $this->projectIds;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->levels) {
            $res['levels'] = $this->levels;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->tagIds) {
            $res['tag_ids'] = $this->tagIds;
        }
        if (null !== $this->docMediaType) {
            $res['doc_media_type'] = $this->docMediaType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->docIdList) {
            $res['doc_id_list'] = $this->docIdList;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlarmRequest
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
        if (isset($map['alarm_rule_ids'])) {
            if (!empty($map['alarm_rule_ids'])) {
                $model->alarmRuleIds = $map['alarm_rule_ids'];
            }
        }
        if (isset($map['order_by'])) {
            $model->orderBy = $map['order_by'];
        }
        if (isset($map['is_query_update_time'])) {
            $model->isQueryUpdateTime = $map['is_query_update_time'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['project_ids'])) {
            if (!empty($map['project_ids'])) {
                $model->projectIds = $map['project_ids'];
            }
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['levels'])) {
            $model->levels = $map['levels'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }
        if (isset($map['tag_ids'])) {
            if (!empty($map['tag_ids'])) {
                $model->tagIds = $map['tag_ids'];
            }
        }
        if (isset($map['doc_media_type'])) {
            $model->docMediaType = $map['doc_media_type'];
        }
        if (isset($map['status'])) {
            if (!empty($map['status'])) {
                $model->status = $map['status'];
            }
        }
        if (isset($map['doc_id_list'])) {
            if (!empty($map['doc_id_list'])) {
                $model->docIdList = $map['doc_id_list'];
            }
        }
        if (isset($map['sort_type'])) {
            $model->sortType = $map['sort_type'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
