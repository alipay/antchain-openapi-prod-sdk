<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class TenantAppReleasePipeline extends Model
{
    // 机构名称
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $tenant;

    // 环境
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $workspaceGroup;

    // 应用发布releaseId
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $releaseId;

    // 发布单序列号
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $releaseTimeSeriesId;

    // 应用发布状态
    /**
     * @example SUCCEDED
     *
     * @var string
     */
    public $state;

    // 应用发布单详情url
    /**
     * @example http://xxx/xxxx/detail
     *
     * @var string
     */
    public $url;

    // 应用列表
    /**
     * @example
     *
     * @var string[]
     */
    public $apps;

    // 操作人员
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $operator;

    // 发布单ID
    /**
     * @example RRLESAPRV21120211141512810000
     *
     * @var string
     */
    public $approvePlanId;

    // 发布审批单Url
    /**
     * @example https://paas.alipay.com/index#/jiuzhou/my/plan/detail?planId=RRLESAPRV21120211141512810000&projectName=ANTCLOUD
     *
     * @var string
     */
    public $approvePlanUrl;
    protected $_name = [
        'tenant'              => 'tenant',
        'workspaceGroup'      => 'workspace_group',
        'releaseId'           => 'release_id',
        'releaseTimeSeriesId' => 'release_time_series_id',
        'state'               => 'state',
        'url'                 => 'url',
        'apps'                => 'apps',
        'operator'            => 'operator',
        'approvePlanId'       => 'approve_plan_id',
        'approvePlanUrl'      => 'approve_plan_url',
    ];

    public function validate()
    {
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('releaseId', $this->releaseId, true);
        Model::validateRequired('releaseTimeSeriesId', $this->releaseTimeSeriesId, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('apps', $this->apps, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->releaseId) {
            $res['release_id'] = $this->releaseId;
        }
        if (null !== $this->releaseTimeSeriesId) {
            $res['release_time_series_id'] = $this->releaseTimeSeriesId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->approvePlanId) {
            $res['approve_plan_id'] = $this->approvePlanId;
        }
        if (null !== $this->approvePlanUrl) {
            $res['approve_plan_url'] = $this->approvePlanUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TenantAppReleasePipeline
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['release_id'])) {
            $model->releaseId = $map['release_id'];
        }
        if (isset($map['release_time_series_id'])) {
            $model->releaseTimeSeriesId = $map['release_time_series_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['approve_plan_id'])) {
            $model->approvePlanId = $map['approve_plan_id'];
        }
        if (isset($map['approve_plan_url'])) {
            $model->approvePlanUrl = $map['approve_plan_url'];
        }

        return $model;
    }
}
