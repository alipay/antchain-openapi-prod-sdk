<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryAppPlanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名称，精准查询
    /**
     * @var string
     */
    public $appName;

    // 当前页码，从1开始，默认为1
    /**
     * @var int
     */
    public $currentPage;

    // 排序规则，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    /**
     * @var string
     */
    public $order;

    // 分页大小，默认为10
    /**
     * @var int
     */
    public $pageSize;

    // 状态筛选列表
    /**
     * @var string[]
     */
    public $states;

    // 查询指定发布单 timeseries_id 列表
    /**
     * @var string[]
     */
    public $timeseriesIds;

    // 工作空间组id列表
    /**
     * @var string[]
     */
    public $workspaceGroupNames;
    protected $_name = [
        'authToken'           => 'auth_token',
        'appName'             => 'app_name',
        'currentPage'         => 'current_page',
        'order'               => 'order',
        'pageSize'            => 'page_size',
        'states'              => 'states',
        'timeseriesIds'       => 'timeseries_ids',
        'workspaceGroupNames' => 'workspace_group_names',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->states) {
            $res['states'] = $this->states;
        }
        if (null !== $this->timeseriesIds) {
            $res['timeseries_ids'] = $this->timeseriesIds;
        }
        if (null !== $this->workspaceGroupNames) {
            $res['workspace_group_names'] = $this->workspaceGroupNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppPlanRequest
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
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['states'])) {
            if (!empty($map['states'])) {
                $model->states = $map['states'];
            }
        }
        if (isset($map['timeseries_ids'])) {
            if (!empty($map['timeseries_ids'])) {
                $model->timeseriesIds = $map['timeseries_ids'];
            }
        }
        if (isset($map['workspace_group_names'])) {
            if (!empty($map['workspace_group_names'])) {
                $model->workspaceGroupNames = $map['workspace_group_names'];
            }
        }

        return $model;
    }
}
