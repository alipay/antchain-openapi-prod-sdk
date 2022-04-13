<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanStatesummaryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组名称
    //
    /**
     * @var string
     */
    public $workspaceGroup;

    // 发布单类型列表
    //
    /**
     * @var string[]
     */
    public $types;

    // 发布单号
    //
    /**
     * @var string
     */
    public $timeSeriesId;

    // 发布单状态列表
    //
    /**
     * @var string[]
     */
    public $stateList;

    // 发布单id列表
    //
    /**
     * @var string[]
     */
    public $planIds;

    // 发布单名称前缀
    //
    /**
     * @var string
     */
    public $name;

    // 分页大小
    //
    /**
     * @var int
     */
    public $pageSize;

    // 当前页码，从1开始
    //
    /**
     * @var int
     */
    public $currentPage;

    // 发布单创建起始时间
    /**
     * @var string
     */
    public $creationTimeFrom;

    // 发布单创建截止时间
    //
    /**
     * @var string
     */
    public $creationTimeTo;

    // 应用名称
    //
    /**
     * @var string
     */
    public $appName;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceGroup'   => 'workspace_group',
        'types'            => 'types',
        'timeSeriesId'     => 'time_series_id',
        'stateList'        => 'state_list',
        'planIds'          => 'plan_ids',
        'name'             => 'name',
        'pageSize'         => 'page_size',
        'currentPage'      => 'current_page',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo'   => 'creation_time_to',
        'appName'          => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('types', $this->types, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('pageSize', $this->pageSize, 1);
        Model::validateMinimum('currentPage', $this->currentPage, 1);
        Model::validatePattern('creationTimeFrom', $this->creationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('creationTimeTo', $this->creationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->stateList) {
            $res['state_list'] = $this->stateList;
        }
        if (null !== $this->planIds) {
            $res['plan_ids'] = $this->planIds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->creationTimeFrom) {
            $res['creation_time_from'] = $this->creationTimeFrom;
        }
        if (null !== $this->creationTimeTo) {
            $res['creation_time_to'] = $this->creationTimeTo;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanStatesummaryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }
        if (isset($map['state_list'])) {
            if (!empty($map['state_list'])) {
                $model->stateList = $map['state_list'];
            }
        }
        if (isset($map['plan_ids'])) {
            if (!empty($map['plan_ids'])) {
                $model->planIds = $map['plan_ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['creation_time_from'])) {
            $model->creationTimeFrom = $map['creation_time_from'];
        }
        if (isset($map['creation_time_to'])) {
            $model->creationTimeTo = $map['creation_time_to'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
