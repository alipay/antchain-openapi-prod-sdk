<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    //
    /**
     * @var string
     */
    public $appName;

    // 发布单创建起始时间
    //
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

    // 当前页码，从1开始
    /**
     * @var int
     */
    public $currentPage;

    // 发布单名称前缀
    /**
     * @var string
     */
    public $name;

    // 运维单类型：REBOOT,ONLINE,OFFLINE
    /**
     * @var string
     */
    public $mode;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 发布单id列表
    //
    /**
     * @var string[]
     */
    public $planIds;

    // 发布单状态列表
    /**
     * @var string[]
     */
    public $stateList;

    // 发布单号
    //
    /**
     * @var string
     */
    public $timeSeriesId;

    // 发布单类型列表， e.g: 分组发布|重启
    //
    /**
     * @var string[]
     */
    public $types;

    // 工作空间组名称
    //
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'        => 'auth_token',
        'appName'          => 'app_name',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo'   => 'creation_time_to',
        'currentPage'      => 'current_page',
        'name'             => 'name',
        'mode'             => 'mode',
        'pageSize'         => 'page_size',
        'planIds'          => 'plan_ids',
        'stateList'        => 'state_list',
        'timeSeriesId'     => 'time_series_id',
        'types'            => 'types',
        'workspaceGroup'   => 'workspace_group',
    ];

    public function validate()
    {
        Model::validatePattern('creationTimeFrom', $this->creationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('creationTimeTo', $this->creationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('types', $this->types, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('pageSize', $this->pageSize, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->creationTimeFrom) {
            $res['creation_time_from'] = $this->creationTimeFrom;
        }
        if (null !== $this->creationTimeTo) {
            $res['creation_time_to'] = $this->creationTimeTo;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->planIds) {
            $res['plan_ids'] = $this->planIds;
        }
        if (null !== $this->stateList) {
            $res['state_list'] = $this->stateList;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['creation_time_from'])) {
            $model->creationTimeFrom = $map['creation_time_from'];
        }
        if (isset($map['creation_time_to'])) {
            $model->creationTimeTo = $map['creation_time_to'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['plan_ids'])) {
            if (!empty($map['plan_ids'])) {
                $model->planIds = $map['plan_ids'];
            }
        }
        if (isset($map['state_list'])) {
            if (!empty($map['state_list'])) {
                $model->stateList = $map['state_list'];
            }
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
