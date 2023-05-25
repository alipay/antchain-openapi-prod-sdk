<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskTasksRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 当前页数
    /**
     * @var int
     */
    public $page;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 风险ID
    /**
     * @var string
     */
    public $riskTaskId;

    // 风险名称
    /**
     * @var string
     */
    public $displayName;

    // 风险等级
    /**
     * @var string
     */
    public $priority;

    // 风险类型
    /**
     * @var string
     */
    public $riskType;

    // 风险状态
    /**
     * @var string
     */
    public $riskTaskState;

    // FROM时间点， 按照时间范围搜索的开始时间点
    /**
     * @var string
     */
    public $creationTimeFrom;

    // to时间点， 按照时间范围搜索的结束时间点
    //
    /**
     * @var string
     */
    public $creationTimeTo;
    protected $_name = [
        'authToken'        => 'auth_token',
        'page'             => 'page',
        'pageSize'         => 'page_size',
        'riskTaskId'       => 'risk_task_id',
        'displayName'      => 'display_name',
        'priority'         => 'priority',
        'riskType'         => 'risk_type',
        'riskTaskState'    => 'risk_task_state',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo'   => 'creation_time_to',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validatePattern('creationTimeFrom', $this->creationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('creationTimeTo', $this->creationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->riskTaskId) {
            $res['risk_task_id'] = $this->riskTaskId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->riskTaskState) {
            $res['risk_task_state'] = $this->riskTaskState;
        }
        if (null !== $this->creationTimeFrom) {
            $res['creation_time_from'] = $this->creationTimeFrom;
        }
        if (null !== $this->creationTimeTo) {
            $res['creation_time_to'] = $this->creationTimeTo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskTasksRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['risk_task_id'])) {
            $model->riskTaskId = $map['risk_task_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['risk_task_state'])) {
            $model->riskTaskState = $map['risk_task_state'];
        }
        if (isset($map['creation_time_from'])) {
            $model->creationTimeFrom = $map['creation_time_from'];
        }
        if (isset($map['creation_time_to'])) {
            $model->creationTimeTo = $map['creation_time_to'];
        }

        return $model;
    }
}
